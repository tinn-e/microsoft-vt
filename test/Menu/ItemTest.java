/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elka
 */
public class ItemTest {
    
    public ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Item instance = new Item();
        String expResult = "sup";
        instance.setName("sup");
        String result = instance.getName();
        assertEquals(expResult, result);
      //  fail("Test1.");
    }
  

     /**
     * Test of getConsistance method, of class Item.
     */
    @Test
    public void testGetConsistance() {
        System.out.println("getConsistance");
        Item instance = new Item();
        String expResult = "yellow color";
        instance.setConsistance("yellow color");
        String result = instance.getConsistance();
        assertEquals(expResult, result);
        //fail("Test2.");
    }
     
   
    /**
     * Test of getCost method, of class Item.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Item instance = new Item();
        Double expResult = 150.50;
        instance.setCost(150.50);
        Double result = instance.getCost();
        assertEquals(expResult, result);
        //fail("Test3.");
    }
      
}