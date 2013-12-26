package javafxapplication.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.House;
import javafxapplication.Proxy.HouseProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class ListHouseController implements Initializable {


    public TableColumn username;
    public TableColumn address;
    public TableColumn price;
    public TableView tableView1;

    HouseProxy houseProxy = new HouseProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        username.setCellValueFactory(new PropertyValueFactory<House, String>("username"));
        address.setCellValueFactory(new PropertyValueFactory<House, String>("address"));
        price.setCellValueFactory(new PropertyValueFactory<House, String>("price"));
    }

    public void setActionEvent(ActionEvent actionEvent) {
        List<House> houses = Arrays.asList(houseProxy.getHouses());


        tableView1.getItems().setAll(houses);
    }
}
