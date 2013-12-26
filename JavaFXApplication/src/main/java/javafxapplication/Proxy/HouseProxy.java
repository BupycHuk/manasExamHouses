package javafxapplication.Proxy;

/**
 * Created by admin on 26.12.13.
 */
public class HouseProxy {

    public void deleteHouses(long id)

    {
        restTemplate.getForObject(urlService.GetServerUrl("/Houses/delete/"+id), House[].class);
        //return restTemplate.getForObject(urlService.GetServerUrl("/Houses/delete/{id}"), House[].class);
    }


    public boolean addHouse(AddHouseRequest HouseAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addHouse/"), HouseAddRequest, House.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }
    public House[] getHouses() {
        return restTemplate.getForObject(urlService.GetServerUrl("/Houses/"), House[].class);
    }
}
