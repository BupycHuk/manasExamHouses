package javafxapplication.Model;

public class District {
    private long id;
    private String districtName;

    protected District() {}

    public District(String districtName) {
        this.districtName = districtName;
    }


    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    public String getDistrictName() {
        return districtName;
    }
    public String toString()
    {
        return getDistrictName();

    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
