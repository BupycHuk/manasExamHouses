package javafxapplication.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable {

    public VBox vbox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void addUser(ActionEvent actionEvent) throws IOException {
        openControl("/View/AddUserControl.fxml");
    }
    public void addHouse(ActionEvent actionEvent) throws IOException {
        openControl("/View/AddHouseControl.fxml");
    }



    public void listHouse(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListHouseControl.fxml");
    }

    public void addProduct(ActionEvent actionEvent) throws IOException {
        openControl("/View/AddProductsControl.fxml");
    }
    public void listProducts(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListProductsControl.fxml");
    }
    public void listOrders(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListOrderControl.fxml");
    }


    private void openControl(String controlPath) throws IOException {
        Parent control = FXMLLoader.load(getClass().getResource(controlPath));

        vbox.getChildren().clear();
        vbox.getChildren().add(control);
    }

    public void listUser(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListUserControl.fxml");
    }

    public void listSoldProducts(ActionEvent actionEvent) throws IOException {
        openControl("/View/ListSoldProductControl.fxml");
    }

    public void listHouseTreeView(ActionEvent event) throws IOException {
        openControl("/View/TreeView.fxml");
    }

    public void MainControl() throws IOException {
        openControl("/View/MainWindow.fxml");
    }
}
