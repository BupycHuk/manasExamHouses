package javafxapplication.Controller.House;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.District;
import javafxapplication.Model.House;
import javafxapplication.Proxy.HouseProxy;

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
    public ComboBox districComboBox;
    HouseProxy houseProxy = new HouseProxy();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        user.setCellValueFactory(new PropertyValueFactory<House, String>("user"));
        district.setCellValueFactory(new PropertyValueFactory<House, String>("district"));
        price.setCellValueFactory(new PropertyValueFactory<House, String>("price"));
        adress.setCellValueFactory(new PropertyValueFactory<House, String>("adress"));
    }


    @FXML
    private void handleButtonAction(ActionEvent event) {
        District district = (District)districComboBox.getValue();
//        Integer count = Integer.valueOf(text3.getText());
//        Double price = product.getPrice();
        long districtId = (district!=null)? (long) district.getId() :0;

        //WrittingOffProductRequest request = new WrittingOffProductRequest(productId,null,count,price);

        //soldProductsProxy.writtingOffProduct(request);
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<House> houses = Arrays.asList(houseProxy.getHouseInfo());
        tableView.getItems().setAll(houses);
    }


}
