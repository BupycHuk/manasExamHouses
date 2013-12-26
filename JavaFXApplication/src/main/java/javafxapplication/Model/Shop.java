
package javafxapplication.Model;
public class Shop{
    private long id;
    private String Райондун_аты;


    public String getРайондун_аты() {
        return Райондун_аты;
    }

    public void setName(String Райондун_аты) {
        this.Райондун_аты = Райондун_аты;
    }

    public long getId() {
        return id;
    }

    public String toString()
    {
        return getРайондун_аты();

    }



    public void setId(long id) {
        this.id = id;
    }


}
