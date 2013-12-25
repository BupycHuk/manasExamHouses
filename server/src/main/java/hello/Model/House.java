package hello.Model;

import javax.persistence.*;

@Entity
public class House
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long houseId;
    @Column(name="addUser")
    private String addUser;
    @Column(name="Area")
    private String area;
    @Column(name="price")
    private Long price;
    @Column(name="adress")
    private String adress;

    public House(){}

    public House(String addUser, String area, Long price, String adress)
    {
        this.addUser=addUser;
        this.area=area;
        this.price=price;
        this.adress=adress;


    }

    public long getHouseId() {
        return houseId;
    }

    public void setHouseId(long houseId) {
        this.houseId = houseId;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
