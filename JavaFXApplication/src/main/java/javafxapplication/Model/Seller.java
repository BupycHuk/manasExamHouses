/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication.Model;


public class Seller {
    private long id;
    private String Райондун_аты;


    protected Seller() {}

    public Seller(String Райондун_аты) {
        this.Райондун_аты = Райондун_аты;

    }


    public String getРайондун_аты() {
        return Райондун_аты;
    }

    public void setРайондун_аты(String Райондун_аты) {
        this.Райондун_аты = Райондун_аты;
    }


    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }


    private Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getShopname()
    {
        if (getShop()!=null)
            return getShop().getName();
        return null;
    }
}

