package javafxapplication.Controller.Seller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Seller;
import javafxapplication.Proxy.SellerProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;


public class ListSellerController implements Initializable {

    public TableColumn Райондун_аты;
    public TableView tableView1;

    SellerProxy sellerProxy = new SellerProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Райондун_аты.setCellValueFactory(new PropertyValueFactory<Seller, String>("Райондун_аты"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Seller> sellers = Arrays.asList(sellerProxy.getSellers());

        tableView1.getItems().setAll(sellers);
    }
}
