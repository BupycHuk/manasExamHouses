package javafxapplication.Model;


public class Home {

    private long id;
    private String nameHome;
    private String price;

    public String getNameProduct() {
        return nameHome;
    }

    public void setNameHomeH(String nameHome, String Price) {
        this.nameHome = nameHome;
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

    private Home home;

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public String getHomename()
    {
        if (getHome()!=null)
            return getHome().getHome();
        return null;
    }


}
