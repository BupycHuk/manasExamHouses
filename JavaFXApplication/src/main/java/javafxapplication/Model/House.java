package javafxapplication.Model;

public class House {
    private long id;
    private String adress;
    private Double price;
    private District district;
    private User user;

    protected House() {}

    public House(String adress, Double price, District district, User user) {
        this.adress = adress;
        this.price = price;
        this.district = district;
        this.user = user;
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }


    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

