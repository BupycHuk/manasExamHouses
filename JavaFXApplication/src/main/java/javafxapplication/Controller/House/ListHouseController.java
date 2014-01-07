package javafxapplication.Controller.House;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.House;
import javafxapplication.Proxy.HouseProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ListHouseController implements Initializable{


    public TableColumn address;
    public TableColumn price;
    public TableView tableView1;

    HouseProxy houseProxy = new HouseProxy();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        address.setCellValueFactory(new PropertyValueFactory<House, String>("address"));
        price.setCellValueFactory(new PropertyValueFactory<House, String>("price"));
    }

    public void update(ActionEvent actionEvent) {
        List<House> houses = Arrays.asList(houseProxy.getHouses());

        tableView1.getItems().setAll(houses);
    }
}
