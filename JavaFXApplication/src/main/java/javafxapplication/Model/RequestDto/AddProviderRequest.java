package javafxapplication.Model.RequestDto;

import java.io.Serializable;

public class AddProviderRequest implements Serializable {
    private String Райондун_аты;


    public AddProviderRequest()
    {

    }

    public AddProviderRequest( String name, String contacts) {
        //To change body of created methods use File | Settings | File Templates.
        this.Райондун_аты = name;

    }



    public String getРайондун_аты() {
        return Райондун_аты;
    }

    public void setРайондун_аты(String Райондун_аты)
    {
        this.Райондун_аты = Райондун_аты;
    }



}
