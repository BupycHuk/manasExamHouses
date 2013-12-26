package hello.Model.RequestDto;

import java.io.Serializable;

public class AddProviderRequest implements Serializable {

    private String Райондун_аты;

    public AddProviderRequest()
    {

    }

    public AddProviderRequest( String Райондун_аты) {
        //To change body of created methods use File | Settings | File Templates.

        this.Райондун_аты = Райондун_аты;
    }




    public String getРайондун_аты() {
        return Райондун_аты;
    }

    public void setName(String Райондун_аты)
    {
        this.Райондун_аты = Райондун_аты;
    }

}
