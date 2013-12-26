package javafxapplication.Controller.House;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.District;
import javafxapplication.Model.House;
import javafxapplication.Proxy.DistrictProxy;
import javafxapplication.Proxy.HouseProxy;
import sun.font.Decoration;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 12/26/13
 * Time: 6:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListHouseController implements Initializable {
    public TableColumn user;
    public TableColumn district;
    public TableColumn price;
    public TableColumn adress;
    public TableView tableView;
    public ComboBox choiceDistrictComboBox;
    public Label label;

    HouseProxy houseProxy = new HouseProxy();
    DistrictProxy districtProxy = new DistrictProxy();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        user.setCellValueFactory(new PropertyValueFactory<House, String>("nameUser"));
        district.setCellValueFactory(new PropertyValueFactory<House, String>("nameDistrict"));
        price.setCellValueFactory(new PropertyValueFactory<House, String>("price"));
        adress.setCellValueFactory(new PropertyValueFactory<House, String>("adress"));

        District[] districts = districtProxy.getDistricts();
        choiceDistrictComboBox.getItems().setAll(districts);
    }

    @FXML
    private void filtrloo(ActionEvent event) {
        String district = choiceDistrictComboBox.getValue().toString();
        label.setText(district);
//        long districtId = (district!=null)? (long) district.getId() :0;
    }

    public void Tolukta(ActionEvent actionEvent) {
        List<House> houses = Arrays.asList(houseProxy.getHouseInfo());
        tableView.getItems().setAll(houses);

    }
}
