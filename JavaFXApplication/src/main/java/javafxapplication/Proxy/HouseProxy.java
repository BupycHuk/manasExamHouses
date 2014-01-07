package javafxapplication.Proxy;

import javafxapplication.Model.House;
import javafxapplication.Model.RequestDto.AddHouseRequest;

public class HouseProxy extends Proxy{

    public boolean addHouseProduct(AddHouseRequest houseAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addHouse/"), houseAddRequest, House.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public House[] getHouses() {
        return restTemplate.getForObject(urlService.GetServerUrl("/houses/"), House[].class);
    }
}
