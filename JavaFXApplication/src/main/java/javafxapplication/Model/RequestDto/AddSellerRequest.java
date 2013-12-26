package javafxapplication.Model.RequestDto;

import java.io.Serializable;


public class AddSellerRequest implements Serializable {
    private long Id;
    private String Райондун_аты;


    public AddSellerRequest()
    {

    }

    public AddSellerRequest(long shopId, String sellername, String login, String password) {
        //To change body of created methods use File | Settings | File Templates.
        this.Id = Id;
        this.Райондун_аты = Райондун_аты;

    }

    public AddSellerRequest(long ıd, String райондун_аты) {

    }

    public long getId() {
        return Id;
    }

    public void setShopId(long shopId)
    {
        this.Id =Id;
    }

    public String getРайондун_аты() {
        return Райондун_аты;
    }

    public void setSellername(String sellername)
    {
        this.Райондун_аты=Райондун_аты;
    }



}

