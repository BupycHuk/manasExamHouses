/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication.Model;


public class User {
    private long id;
    private String Райондун_аты;


    protected User() {}

    public User(String Райондун_аты) {
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


}

