package javafxapplication.Model;

public class House {
    private long id;
    private String adress;
    private Double price;
    private District district;
    private User user;

    protected House() {}

    public House(String adress, Double price, District district, User user){
        this.adress = adress;
        this.price = price;
        this.district = district;
        this.user = user;
    }

    public String getAdress() {
        return adress;
    }

    public Double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    public District getDistrict() {
        return district;
    }

    public String getNameDistrict()
    {
        if (getDistrict()!=null)
            return getDistrict().getDistrictName();
        return null;
    }

    public User getUser() {
        return user;
    }

    public String getNameUser()
    {
        if (getUser()!=null)
            return getUser().getUsername();
        return null;
    }
}

