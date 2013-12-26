package hello.Model;

import javax.persistence.*;

@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="district_id")
    private long district_id;
    @Column(name="user_id")
    private long user_id;
    @Column(name="address")
    private String address;
    @Column(name="price")
    private String price;

    protected House(){}
    public House(Long district_id, Long user_id, String address, String price) {
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

