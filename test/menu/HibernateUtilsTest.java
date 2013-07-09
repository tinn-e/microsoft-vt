package menu;

import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elka
 */
public class HibernateUtilsTest {
    
    public HibernateUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        try{
        HibernateUtils.getSessionFactoryInstance();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
    }

    /**
     * Test of addItem method, of class HibernateUtils.
     */
    @Test //тестируем сразу 2 метода add и get.
    public void testAddItem() {
        HibernateUtils instanse = new HibernateUtils();
        instanse.deleteAllItem();
        Item expResult = new Item("Суп гороховый", "вкусный", 100, "Супы");
        instanse.addItem(expResult);
        List <Item> a = instanse.getItemList();
        Item result = a.get(0); //получает последний элемент из базы
        

        if(expResult.equals(result))
            System.out.println("testAddItem -- True");
        else System.out.println("testAddItem -- False");
    }

    /**
     * Test of deleteItem method, of class HibernateUtils.
     */
    @Test
    public void testDeleteItem() {
        int expResult = 0;
        HibernateUtils instanse = new HibernateUtils();       
        instanse.deleteAllItem();
        Item dish = new Item("Суп гороховый", "вкусный", 100, "Супы");
        instanse.addItem(dish);
        instanse.deleteItem(dish.getItemID());
        List<Item> list = instanse.getItemList();
        int result = list.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateItem method, of class HibernateUtils.
     */
    @Test
    public void testUpdateItem() {
        HibernateUtils instanse = new HibernateUtils();       
        instanse.deleteAllItem();
        Item dish3 = new Item("sup", "solyanka", 300, "Супы");
        instanse.addItem(dish3);  
        instanse.updateItem(dish3.getItemID(), "varenei", "makaroni", 400, "Закуска");
        List <Item> c = instanse.getItemList();
        Item dish4 = new Item();
        dish4 = c.get(c.size()-1);
        if(dish4.getItemCost() == 400 
         ||"varenie".equals(dish4.getItemDesc())
         ||"makaroni".equals(dish4.getItemTitle())
         ||"Закуска".equals(dish4.getItemCategory()))
        System.out.println("testUpdateItem -- True");
        else System.out.println("testUpdateItem -- False");
    }
    
    @Test
    public void testListCategoryItem() {
        HibernateUtils instanse = new HibernateUtils();       
        instanse.deleteAllItem();
        int expResult = 2;
        Item dish1 = new Item("sup1","solyanka1",300, "дно");
        Item dish2 = new Item("sup2","solyanka2",300, "дно");
        Item dish3 = new Item("sup3","solyanka3",200, "qqq");
        instanse.addItem(dish1);
        instanse.addItem(dish2);
        instanse.addItem(dish3);
        
        String cat = "дно";
        
        List<Item> list = instanse.getItemCategoryList(cat);
        int result = list.size();  
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteAllItem(){
        HibernateUtils instanse = new HibernateUtils();
        int expResult = 0;
        instanse.deleteAllItem();
        List<Item> list = instanse.getItemList();
        int result = list.size();
        assertEquals(expResult, result);
    }
}