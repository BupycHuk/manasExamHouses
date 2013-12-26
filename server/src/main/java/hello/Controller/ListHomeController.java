package hello.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Product;
import javafxapplication.Model.RequestDto.AddOrderRequest;
import javafxapplication.Proxy.OrderProxy;
import javafxapplication.Proxy.ProductProxy;
import org.apache.catalina.startup.HomesUserDatabase;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Aza on 08.12.13.
 */
public class ListHomeController implements Initializable {

    public TableColumn landlord;
    public TableColumn region;
    public TableColumn price;
    public TableColumn adress;
    public TableView tableView1;


    ProductProxy productProxy = new ProductProxy();
    OrderProxy orderProxy = new OrderProxy();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        landlord.setCellValueFactory(new PropertyValueFactory<Product, String>("landlord"));
        adress.setCellValueFactory(new PropertyValueFactory<Product, String>("adress"));
        region.setCellValueFactory(new PropertyValueFactory<Product, String>("region"));
        price.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));
    }

    public void update(ActionEvent actionEvent) {
        List<HomesUserDatabase> homesUserDatabaseList = Arrays.asList(homesUserDatabaseList.getHome());

        tableView1.getItems().setAll(homesUserDatabaseList);
    }

    public void deleteHome(ActionEvent actionEvent) {


        Home product =  (Home) tableView1.getSelectionModel().getSelectedItem();
        long id = product.getId();
        productProxy.homeDelete(id);

    }

}
