package hello.Model;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="raion")
    private String raion;
    @Column(name="baa")
    private String baa;
    @Column(name="adress")
    private String adress;

    protected Room(){}
    public Room(String name, String raion, String baa, String adress) {
        this.name = name;
        this.raion = raion;
        this.baa = baa;
        this.adress = adress;
    }


    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaion() {
        return raion;
    }

    public void setRaion(String raion) {
        this.raion = raion;
    }

    public String getBaa() {
        return baa;
    }

    public void setBaa(String baa) {this.baa = baa;}

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

