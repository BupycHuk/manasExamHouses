package hello.Model;

import javax.persistence.*;

@Entity
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="districtName")
    private String districtName;

    protected District() {}

    public District(String districtName) {
        this.districtName = districtName;
    }


    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }


    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }
}
