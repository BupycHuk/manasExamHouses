package javafxapplication.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Room;
import javafxapplication.Proxy.RoomProxy;


import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;



public class ListRoomController implements Initializable {

    public TableColumn name;
    public TableColumn raion;
    public TableColumn baa;
    public TableView adress;
    public TableView tableView1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name.setCellValueFactory(new PropertyValueFactory<Room, String>("name"));
        raion.setCellValueFactory(new PropertyValueFactory<Room, String>("raion"));
        baa.setCellValueFactory(new PropertyValueFactory<Room, String>("baa"));
        adress.setCellValueFactory(new PropertyValueFactory<Room, String>("adress"));
    }


    public void deleteRoom(ActionEvent actionEvent) {

       Room room =  (Room) tableView1.getSelectionModel().getSelectedItem();
        long id = room.getId();
        RoomProxy.deleteRoom(id);

    }

}
