package javafxapplication.Proxy;

//import javafxapplication.Model.User;
import javafx.event.ActionEvent;
import javafxapplication.Model.RequestDto.AddRoomRequest;
import javafxapplication.Model.Room;

import javax.swing.*;


public class RoomProxy extends Proxy {

    public void RoomDelete(long id){

        restTemplate.getForObject(urlService.GetServerUrl("/delete/Room/"+id), Room.class);
    }

}
    public void deleteRoom(ActionEvent actionEvent) {

        JColorChooser tableView1;
        Room room =  (Room) tableView1.getSelectionModel().getSelectedItem();
        long id = room.getId();
        RoomProxy.deleteRoom(id);