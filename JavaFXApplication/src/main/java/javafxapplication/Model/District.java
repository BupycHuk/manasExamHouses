package javafxapplication.Model;

public class District {
    private long id;
    private String districtName;


    public long getId() {
        return id;
    }

    public String getDistrictName() {
        return districtName;
    }
    public String toString()
    {
        return getDistrictName();

    }
}
