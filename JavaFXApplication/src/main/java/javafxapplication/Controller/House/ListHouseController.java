package javafxapplication.Controller.House;


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

public class ListHouseController implements Initializable {

    public TableColumn<House, Long> houseId;
    public TableColumn<House, String> addUser;
    public TableColumn<House, String> area;
    public TableColumn<House, Long> price;
    public TableColumn<House, String> adress;

    public TableView<House> houseListTableView;

    HouseProxy houseProxy = new HouseProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        addUser.setCellValueFactory(new PropertyValueFactory<House, String>("addUser"));
        area.setCellValueFactory(new PropertyValueFactory<House, String>("area"));
        price.setCellValueFactory(new PropertyValueFactory<House, Long>("price"));
        adress.setCellValueFactory(new PropertyValueFactory<House, String>("adress"));

    }

    public void textTolukta(ActionEvent actionEvent) {
        List<House> house = Arrays.asList(houseProxy.getHouses());

        houseListTableView.getItems().setAll(house);
    }

    public void houseDelete(ActionEvent actionEvent)
    {


         House house = houseListTableView.getSelectionModel().getSelectedItem();
         long i=house.getHouseId();
         houseProxy.deleteHouses(i);



    }
}
