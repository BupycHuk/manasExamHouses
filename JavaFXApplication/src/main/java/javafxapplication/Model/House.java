package javafxapplication.Model;

public class House {
    private long id;
    private String adress;
    private Double price;
    private Raion raion;
    private User user;

    protected House() {}

    public House(String adress, Double price, Raion raion, User user){
        this.adress = adress;
        this.price = price;
        this.raion = raion;
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

    public Raion getRaion() {
        return raion;
    }

    public String getNameRaion()
    {
        if (getRaion()!=null)
            return getRaion().getRaionName();
        return null;
    }

    public User getUser() {
        return user;
    }

    public String getNameUser()
    {
        if (getUser()!=null)
            return getUser().getName();
        return null;
    }
}
