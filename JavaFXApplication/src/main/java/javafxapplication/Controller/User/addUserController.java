package javafxapplication.Controller.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafxapplication.Model.RequestDto.AddUserRequest;
import javafxapplication.Model.House;
import javafxapplication.Proxy.UserProxy;
import javafxapplication.Proxy.HouseProxy;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class AddUserController implements Initializable {

    public ComboBox HouseComboBox;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private PasswordField text4;



    UserProxy UserProxy = new UserProxy();
    HouseProxy HouseProxy = new HouseProxy();

    @FXML
    private void handleButtonAction(ActionEvent actionEvent) {

        String UserName, login, password;
        House House = (House)HouseComboBox.getValue();
        long HouseId = (House!=null)? (long) House.getId() :0;
        UserName=text2.getText();
        login=text3.getText();
        password=text4.getText();

        AddUserRequest request = new AddUserRequest(HouseId, UserName,login,password);

        UserProxy.addUser(request);
        text2.setText("");
        text3.setText("");
        text4.setText("");
    }
    @FXML
    private void textTazala(ActionEvent event){
        text2.setText("");
        text3.setText("");
        text4.setText("");
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        House[] Houses = HouseProxy.getHouses();
        HouseComboBox.getItems().setAll(Houses);
    }
}
