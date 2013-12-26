package hello.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

@Entity
public class House
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(adress="adress")
    public String adress;

    @Column(price="price")
    public double price;

    protected House() {}

    public House(String adress, double price) {
        this.adress = adress;
        this.price = price;
    }
    public long getId() {return id;}

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}