/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MTests;

import Havka;
import Havka;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Сергей
 */
public class JUnitTest1 {
    
    public JUnitTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void TestAdd () {
        ArrayList NewList1 = new ArrayList();
        Havka dish = new Havka();
        String expResult = dish.name;
        NewList1.add(dish);
        String result = NewList1.get(dish);
        assertEquals(expResult, result); 
    }
    @Test
    public void TestAdd2() throws Exception {
        ArrayList NewList1 = new ArrayList();
        Havka dish = new Havka();
        dish.name = null;
        try {
        NewList1.add(dish);
        if (dish.name==null)throw new Exception();}
        catch (Exception e) {
            System.out.println("Exception 1");
        }               
    }
    @Test
    public void TestAmount () {
        double x = 15.1;
        double sum = 24.0;
        double amount = x+sum;
        double expResult = 39.1;
        String result = String.valueOf(amount);
        assertEquals(expResult, result); 
    }
    @Test
    public void checkTime(){}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}