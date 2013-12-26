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

    public TableColumn HouseName;
    public TableColumn name;
    public TableColumn Login;
    public TableView tableView1;

    UserProxy UserProxy = new UserProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        HouseName.setCellValueFactory(new PropertyValueFactory<User, String>("Housename"));
        name.setCellValueFactory(new PropertyValueFactory<User, String>("fullName"));
        Login.setCellValueFactory(new PropertyValueFactory<User, String>("login"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<User> Users = Arrays.asList(UserProxy.getUsers());


        tableView1.getItems().setAll(Users);
    }


}
