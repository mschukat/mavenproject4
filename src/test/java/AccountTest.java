/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ie.nuigalway.schukat.mavenproject4.Account;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class AccountTest {
    
    public AccountTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void evaluatesGetName() {
    Account acc = new Account("Michael", 1000);
    assertEquals(acc.getName(), "Michael");
    Account acc2 = new Account("Tony", 100);
    assertEquals(acc2.getName(), "Tony");
    }
}
