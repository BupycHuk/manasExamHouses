package javafxapplication.Controller.District;

import javafxapplication.Model.District;

/**
 * Created with IntelliJ IDEA.
 * User: Jazzy
 * Date: 26.12.13
 * Time: 17:07
 * To change this template use File | Settings | File Templates.
 */

    public class ListDistrictController implements Initializable {


        public TableColumn Name;
        public TableView tableView1;

        ListDistrictControllerProxy districtProxy = new ListDistrictController()Proxy();

        @Override
        public void initialize(URL url, ResourceBundle rb) {
            Name.setCellValueFactory(new PropertyValueFactory<District, String>("DistrictName"));
        }

        public void textTolukta(ActionEvent actionEvent) {
            List<District> districts = Arrays.asList(districtProxy.getDistrict());


            tableView1.getItems().setAll(districts);
        }




    }



