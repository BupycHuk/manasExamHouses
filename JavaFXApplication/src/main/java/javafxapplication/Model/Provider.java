package javafxapplication.Model;

public class Provider {
    private long id;
    private String Райондун_аты;


    protected Provider() {}

    public Provider(String Райондун_аты) {
        this.Райондун_аты = Райондун_аты;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }


    public String getРайондун_аты() {
        return Райондун_аты;
    }

    public void setName(String Райондун_аты) {
        this.Райондун_аты = Райондун_аты;
    }



}
