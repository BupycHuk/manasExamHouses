package hello.Model;

import javax.persistence.*;

@Entity
public class Raion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="raionName")
    private String raionName;

    protected Raion() {}


    public String getRaionName() {
        return raionName;
    }

    public void setRaionName(String districtName) {
        this.raionName = districtName;
    }


    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }
}