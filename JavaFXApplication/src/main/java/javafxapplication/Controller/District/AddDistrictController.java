package javafxapplication.Controller.District;

/**
 * Created with IntelliJ IDEA.
 * User: Jazzy
 * Date: 26.12.13
 * Time: 17:07
 * To change this template use File | Settings | File Templates.
 */
public class AddDistrictController implements Initializable {
        public ComboBox shopComboBox;
        @FXML
        private TextField text2;

        DistrictrProxy districtProxy = new DistrictProxy();

        @FXML
        private void handleButtonAction(ActionEvent actionEvent) {

            String Name;
            Name=text2.getText();


            AddDistrictRequest request = new AddDistrictRequest(Id,Name);

            districtProxy.addDistrict(request);
            text2.setText("");

                    }
        @FXML
        private void textTazala(ActionEvent event){
            text2.setText("");

        }


}
