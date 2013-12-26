package javafxapplication.Controller.House;

/**
 * Created by admin on 26.12.13.
 */
public class ListHouseController {
    public TableColumn HouseName;
    public TableColumn nameProduct;
    public TableColumn price;
    public TableView tableView1;


    ProductProxy productProxy = new ProductProxy();
    OrderProxy orderProxy = new OrderProxy();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        HouseName.setCellValueFactory(new PropertyValueFactory<Product, String>("Housename"));
        nameProduct.setCellValueFactory(new PropertyValueFactory<Product, String>("nameProduct"));
        price.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));
    }

    public void update(ActionEvent actionEvent) {
        List<Product> products = Arrays.asList(productProxy.getProducts());

        tableView1.getItems().setAll(products);
    }

    public void deleteProduct(ActionEvent actionEvent) {


        Product product =  (Product) tableView1.getSelectionModel().getSelectedItem();
        long id = product.getId();
        productProxy.productDelete(id);

    }
    public void orderProduct(ActionEvent actionEvent) {

        Product product = (Product) tableView1.getSelectionModel().getSelectedItem();
        String orderedProduct, price;
//        long UserId = (User!=null)?(long)User.getId() :0;
        orderedProduct = product.getNameProduct();
        price = product.getPrice();
        AddOrderRequest request = new AddOrderRequest(orderedProduct, price);

        orderProxy.addOrderedProduct(request);
    }
}
