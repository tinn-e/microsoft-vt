package menu;

//﻿package
//
//import menu.Item;
//
//import menu.Pack;
//
// menu;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KRIS
 */

public class PackTest {

    public PackTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }


    
    @Test
    public void testAddToListPack() {

        String title = "tea";
        String desc = "sweet";
        Integer cost = 200;
        String cat = "Drink";
        Pack obj = new Pack();
        obj.AddToListPack(title, desc, cost,cat);
        System.out.println("Блюдо: " + (obj));

        try {
            obj.AddToListPack(null, null, 0,null);
            if (title == null || desc == null || cost == 0 || cat==null) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Fail)");
        }
        ArrayList list = new ArrayList();
        list = obj.getListPack();
        Item item = new Item();
        item = (Item) list.get(0);
        String result = item.getItemTitle();
        String expResult = title;
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAndGetListPack() throws Exception {
        Pack instance = new Pack();
        ArrayList<Item> listPack = new ArrayList<Item>();
        try {
            instance.setListPack(listPack);
            if (listPack == null) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Your List is null!");
        }
        instance.setListPack(listPack);
        ArrayList expResult = listPack;
        ArrayList result = instance.getListPack();
        assertEquals(expResult, result);
    }

    @Test
    public void testClearPack() throws Exception {
        Pack pack = new Pack();
        try {
            if (pack == null || pack.getListPack() == null) {
                throw new Exception();
            }
            pack.AddToListPack("cake", "tasty", 150, "Dessert");
            if (!pack.getListPack().isEmpty()) {
                System.out.println("An item is in a bag!");
            }
        } catch (Exception e) {
            System.out.println("Null pointer exception!");
        }
        pack.ClearPack(pack.getListPack());
        boolean expResult = true;
        boolean result = pack.getListPack().isEmpty();
        assertEquals(expResult, result);
    }
    
    

    @Test
    public void testDeleteItemFromPack() {
        Pack pack = new Pack();
        String name = "cake";
        String param = "tasty";
        int val = 150;
        String category = "Dessert";
        pack.AddToListPack(name, param, val,category);
        System.out.println("In bag is " + pack.getListPack().get(0));
        pack.DeleteItemFromPack((Item) pack.getListPack().get(0));
        boolean expResult = true;
        boolean result = pack.getListPack().isEmpty();
        assertEquals(expResult, result);
    }

    @Test
    public void testSummPack() {
        Pack bag = new Pack();
        ArrayList<Item> list = new ArrayList<Item>();
        bag.setListPack(list);
        bag.AddToListPack("cake", "sweet", 100,"Dessert");
        bag.AddToListPack("cake", "sweet", 200,"Dessert");
        bag.AddToListPack("cake", "sweet", 300,"Dessert");
        int expResult = 600;
        int result = bag.SummPack(list);
        assertEquals(expResult, result);
    }
}
