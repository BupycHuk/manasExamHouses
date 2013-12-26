package hello.Model.RequestDto;

import java.io.Serializable;


public class AddSellerRequest implements Serializable {
    private long Id;
    private String Райондун_аты;


    public AddSellerRequest()
    {

    }

    public AddSellerRequest(long Id, String Райондун_аты) {
        //To change body of created methods use File | Settings | File Templates.
        this.Id = Id;
        this.Райондун_аты = Райондун_аты;

    }

    public long getId() {
        return Id;
    }

    public void setId(long Id)
    {
        this.Id =Id;
    }

    public String getРайондун_аты() {
        return Райондун_аты;
    }

    public void setРайондун_аты(String Райондун_аты)
    {
        this.Райондун_аты=Райондун_аты;
    }




}

