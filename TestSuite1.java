/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MTests;

import classes.Havka;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Elka
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MTests.JUnitTest3.class, MTests.JUnitTest1.class, MTests.JUnitTest2.class})
public class TestSuite1 {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void Test1 () {
        HashMap map1 = new HashMap();
        Havka dish = new Havka();
        dish.SetName("sup");
        dish.SetCost(50.50);
        dish.SetID(1);
        map1.put(dish.GetID(), dish);
        dish.SetName("borsch");
        dish.SetCost(60.60);
        dish.SetID(2);
        map1.put(dish.GetID(), dish);
        dish.SetName("solyanka");
        dish.SetCost(70.70);
        dish.SetID(3);
        map1.put(dish.GetID(), dish);
        
        map1.remove(3);
        Object expResult = "sup";
        Havka obj1 = new Havka();
        obj1 = (Havka) map1.get(2);
        Object result = obj1.GetName();
        assertEquals (expResult, result);
        
        
    }
}