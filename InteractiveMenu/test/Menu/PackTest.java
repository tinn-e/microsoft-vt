/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PackTest {
    
    public PackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of AddTO method, of class Pack.
     */
    @Test
    public void testAddTO() {
       //System.out.println("AddTO");
        Integer ID = null;
        Item dish = null;
        Pack instance = new Pack();
        HashMap expResult = null;
        HashMap result = instance.AddTO(ID, dish);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveFROM method, of class Pack.
     */
    @Test
    public void testRemoveFROM() {
       // System.out.println("RemoveFROM");
        Integer ID = null;
        Pack instance = new Pack();
        HashMap expResult = null;
        HashMap result = instance.RemoveFROM(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CLEAR method, of class Pack.
     */
    @Test
    public void testCLEAR() {
        Pack instance = new Pack();
        Item item = new Item("Beer", "Red", (double)150);
        instance.AddTO(1, item);
        System.out.println(instance.HashPack.get(1));
        HashMap expResult = null;
        HashMap result = instance.CLEAR();
        assertEquals(expResult, result);
    }

    @Test
    public void testCLEAR2() throws Exception {
        Pack instance = new Pack();
        try{
            instance.CLEAR();
            if(instance.HashPack==null)throw new Exception();}
        catch(Exception e){
            System.out.println("Our pack is empty!");
        }
    }
    
    /**
     * Test of Summ method, of class Pack.
     */
    @Test
    public void testSumm() {
        Pack instance = new Pack();
        Integer expResult = 0;
        Integer result = instance.Summ();
        assertEquals(expResult, result);     
    }
    
    @Test
    public void testSumm2() {
        Pack instance = new Pack();
        Item item = new Item("Beer", "Red", (double)150);
        Item item2 = new Item("Beer", "Red", (double)250);
        instance.AddTO(1, item);
        instance.AddTO(2, item2);
        Double expResult = (double)400;
        Double result = (double)instance.Summ();
        assertEquals(expResult, result);     
    }
    
}
