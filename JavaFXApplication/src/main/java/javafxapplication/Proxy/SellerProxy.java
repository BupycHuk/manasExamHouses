package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.Seller;


public class SellerProxy extends Proxy {

    public boolean addSeller(AddSellerRequest sellerAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addSeller/"), sellerAddRequest, Seller.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public Seller[] getSellers() {
        return restTemplate.getForObject(urlService.GetServerUrl("/sellers/"), Seller[].class);
    }
}
