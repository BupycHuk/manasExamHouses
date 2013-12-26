package javafxapplication.Controller.House;

/**
 * Created by admin on 26.12.13.
 */
public class addHouseController {
    public ComboBox HouseComboBox;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;


    ProductProxy productProxy= new ProductProxy();
    HouseProxy HouseProxy = new HouseProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String nameProduct, price;
        House House = (House)HouseComboBox.getValue();
        long HouseId = (House!=null)? (long) House.getId() :0;
        nameProduct=text2.getText();
        price=text3.getText();

        AddProductRequest request = new AddProductRequest(HouseId, nameProduct,price);

        productProxy.addProduct(request);
    }
    @FXML
    private void textTazala(ActionEvent event){
        text2.setText("");
        text3.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        House[] Houses = HouseProxy.getHouses();
        HouseComboBox.getItems().setAll(Houses);
    }
}
