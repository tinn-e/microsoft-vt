/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MTests;

import ru.base.pack.*;
import java.util.ArrayList;
import java.util.Hashtable;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Сергей
 */
public class JUnitTest2 {
    
    public JUnitTest2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    public void TestAddInPack () {
        Hashtable NewTable1 = new Hashtable();
        Havka dish = new Havka();
        String expResult = dish.getName();
        NewTable1.add(dish);
        String result = (String)NewTable1.get(dish);
        assertEquals(expResult, result); 
    }
    @Test
    public void TestAdd2() throws Exception {
        Hashtable NewTable2 = new Hashtable();
        Havka dish = new Havka();
        dish.name = null;
        try {
        NewTable2.add(dish);
        if (dish.name==null)throw new Exception();}
        catch (Exception e) {
            System.out.println("Exception 2");
        }               
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}