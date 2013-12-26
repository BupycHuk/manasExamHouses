package javafxapplication.Controller.Provider;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafxapplication.Model.Provider;
import javafxapplication.Model.RequestDto.AddProviderRequest;
import javafxapplication.Proxy.ProviderProxy;

import java.net.URL;
import java.util.ResourceBundle;


public class AddProviderController implements Initializable {
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;

    ProviderProxy providerProxy = new ProviderProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String name, contacts;
        name=text2.getText();
        contacts=text3.getText();

        AddProviderRequest request = new AddProviderRequest( name,contacts);

        providerProxy.addProvider(request);
    }
    @FXML
    private void textTazala(ActionEvent event){
        text2.setText("");
        text3.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Provider[] providers = providerProxy.getProviders();
    }
}
