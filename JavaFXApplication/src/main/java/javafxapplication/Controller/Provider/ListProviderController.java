package javafxapplication.Controller.Provider;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Provider;
import javafxapplication.Proxy.ProviderProxy;


import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ListProviderController implements Initializable {
    public TableColumn Райондун_аты;
    public TableView tableView2;
    public TableColumn id;

    ProviderProxy providerProxy = new ProviderProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        id.setCellValueFactory(new PropertyValueFactory<Provider, Long>("id"));
        Райондун_аты.setCellValueFactory(new PropertyValueFactory<Provider, String>("Райондун аты"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Provider> providers = Arrays.asList(providerProxy.getProviders());

        tableView2.getItems().setAll(providers);
    }
}
