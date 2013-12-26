package javafxapplication.Model;

/**
 * Created with IntelliJ IDEA.
 * User: nurgul-pc
 * Date: 12/26/13
 * Time: 5:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class AddHouseRequest {
    private long id;
    private long district_id;
    private long user_id;
    private String address;
    private String price;

    protected AddHouseRequest(){}
    public AddHouseRequest(Long district_id, Long user_id, String address, String price) {
        this.district_id = district_id;
        this.user_id = user_id;
        this.address = address;
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(long district_id) {
        this.district_id = district_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
