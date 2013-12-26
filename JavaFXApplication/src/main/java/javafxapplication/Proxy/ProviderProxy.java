package javafxapplication.Proxy;

import javafxapplication.Model.Provider;
import javafxapplication.Model.RequestDto.AddProviderRequest;
import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.Seller;

public class ProviderProxy extends Proxy {

    public boolean addProvider(AddProviderRequest providerAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addProvider/"), providerAddRequest, Provider.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public Provider[] getProviders() {
        return restTemplate.getForObject(urlService.GetServerUrl("/providers/"), Provider[].class);
    }
}
