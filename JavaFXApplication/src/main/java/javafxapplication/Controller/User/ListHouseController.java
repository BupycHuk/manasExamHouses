package javafxapplication.Controller.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Raion;
import javafxapplication.Model.House;
import javafxapplication.Proxy.RaionProxy;
import javafxapplication.Proxy.HouseProxy;
import sun.font.Decoration;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;


public class ListHouseController implements Initializable {
    public TableColumn user;
    public TableColumn raion;
    public TableColumn price;
    public TableColumn adress;
    public TableView tableView;
    public ComboBox vyborRaionComboBox;
    public Label label;

    HouseProxy houseProxy = new HouseProxy();
    RaionProxy raionProxy = new RaionProxy();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        user.setCellValueFactory(new PropertyValueFactory<House, String>("nameUser"));
        raion.setCellValueFactory(new PropertyValueFactory<House, String>("nameRaion"));
        price.setCellValueFactory(new PropertyValueFactory<House, String>("price"));
        adress.setCellValueFactory(new PropertyValueFactory<House, String>("adress"));

        Raion[] raions = raionProxy.getRaions();
        vyborRaionComboBox.getItems().setAll(raions);
    }

    @FXML
    private void filtirloo(ActionEvent event) {
        String raion = vyborRaionComboBox.getValue().toString();
        label.setText(raion);
        //long raionId = (raion!=null)? (long) raion.getId() :0;
        //long raionid = (raion!=null)? (long) raion.getId() :0;
    }

    public void tolukta(ActionEvent actionEvent) {
        List<House> houses = Arrays.asList(houseProxy.getHouseInfo());
        tableView.getItems().setAll(houses);

    }
}