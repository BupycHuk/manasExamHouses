package javafxapplication.Model;

public class Raion {
    private long id;
    private String raionName;


    public long getId() {
        return id;
    }

    public String getRaionName() {
        return raionName;
    }
    public String toString()
    {
        return getRaionName();

    }
}