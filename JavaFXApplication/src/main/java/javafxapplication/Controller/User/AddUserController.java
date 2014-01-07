package javafxapplication.Controller.User;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafxapplication.Proxy.UserProxy;
import javafxapplication.Model.RequestDto.AddUserRequest;
//import javafxapplication.Model.Shop;
//import main.java.javafxapplication.Proxy.UserProxy;
//import javafxapplication.Proxy.ShopProxy;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 14:04
 * To change this template use File | Settings | File Templates.
 */
public class AddUserController implements Initializable{

    public TextField text1;
    @FXML
    public TextField text2;
    @FXML
    public TextField text3;


    UserProxy userProxy = new UserProxy();

    @FXML
    private void handleButtonAction(ActionEvent actionEvent) {

        String name, contact, adress;
        name = text1.getText();
        contact=text2.getText();
        adress=text3.getText();


        AddUserRequest request = new AddUserRequest(name,contact,adress);

        userProxy.addUser(request);
        text1.setText("");
        text2.setText("");
        text3.setText("");
    }
    @FXML
    private void textTazala(ActionEvent event){
        text1.setText("");
        text2.setText("");
        text3.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
