package javafxapplication.Controller.User;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.User;
import javafxapplication.Proxy.UserProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ListUserController implements Initializable {

    public TableColumn name;
    public TableColumn contact;
    public TableColumn adress;
    public TableView tableView1;

    UserProxy userProxy = new UserProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        contact.setCellValueFactory(new PropertyValueFactory<User, String>("contact"));
        adress.setCellValueFactory(new PropertyValueFactory<User, String>("adress"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<User> sellers = Arrays.asList(userProxy.getUsers());
        tableView1.getItems().setAll(sellers);
    }
  
    
}
