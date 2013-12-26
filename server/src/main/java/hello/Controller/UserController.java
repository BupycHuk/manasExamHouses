package hello.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 27.10.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */

@Component
@Controller
public class UserController {
    /**
     * Created by Aza on 08.12.13.
     */
    public static class home {

        private long id;
        private String nameProduct;
        private String price;

        public String getNameProduct() {
            return nameProduct;
        }

        public void setNameProduct(String nameProduct, String Price) {
            this.nameProduct = nameProduct;
            this.price = Price;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String toString()
        {
            return getId()+" - "+ getNameProduct();

        }


        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        private Shop shop;

        public Shop getShop() {
            return shop;
        }

        public void setShop(Shop shop) {
            this.shop = shop;
        }

        public String getShopname()
        {
            if (getShop()!=null)
                return getShop().getName();
            return null;
        }


    }
}

