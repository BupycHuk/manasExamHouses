package javafxapplication.Controller.User;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.User;
import javafxapplication.Proxy.UserProxy;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
public class ListUserController implements Initializable {


    public TableColumn<User, String> userName;
    public TableColumn<User, String> email;

    public TableView<User> UserListTableView;

    UserProxy userProxy = new UserProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        userName.setCellValueFactory(new PropertyValueFactory<User, String>("userName"));
        email.setCellValueFactory(new PropertyValueFactory<User, String>("email"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<User> users = Arrays.asList(userProxy.getUsers());


        UserListTableView.getItems().setAll(users);
    }


}
