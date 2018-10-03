/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.schukat.mavenproject4;

/**
 *
 * @author Michael
 */
public class Account {
    String name;
    int balance;
    String address;
    
    public Account(String name, int bal)
    {
        // CT417Class ct417 = new CT417Class();
        this.name = name;
        this.balance = bal;
        this.address = "Mayo";
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setBalance(int balance)
    {
        this.balance = balance;
    }    

}
