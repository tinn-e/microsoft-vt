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
        Item dish = new Item();
        dish.setItemCost(100);
        dish.setItemDesc("goroxoviy");
        dish.setItemTitle("sup");
        instanse.addItem(dish);
        List <Item> a = instanse.getItemList();
        a.get(a.size()-1); //получает последний элемент из базы
        if(dish.equals(a.get(a.size()-1)))
            System.out.println("True");
        else System.out.println("False");
    }

    /**
     * Test of deleteItem method, of class HibernateUtils.
     */
    @Test
    public void testDeleteItem() {
        HibernateUtils instanse2 = new HibernateUtils();
        Item dish2 = new Item();
        dish2.setItemID(70);
        dish2.setItemCost(100);
        dish2.setItemDesc("goroxoviy");
        dish2.setItemTitle("sup");
        instanse2.addItem(dish2);
        List<Item> b = instanse2.getItemList();
        int ListSize = b.size();
        
        instanse2.deleteItem(dish2.getItemID());
        b = instanse2.getItemList();
        int ListSize2 = b.size()+1;
        
        if(ListSize==ListSize2)
            System.out.println("True");
        else System.out.println("False");
    }

    /**
     * Test of updateItem method, of class HibernateUtils.
     */
    @Test
    public void testUpdateItem() {
        HibernateUtils instanse3 = new HibernateUtils();
        Item dish3 = new Item("sup","solyanka",300);
        instanse3.addItem(dish3);  
        instanse3.updateItem(dish3.getItemID(),"varenei","makaroni",400);
        List <Item> c = instanse3.getItemList();
        Item dish4 = new Item();
        dish4 = c.get(c.size()-1);
        if(dish4.getItemCost() == 400 
                ||"varenie".equals(dish4.getItemDesc())
                || "makaroni".equals(dish4.getItemTitle()))
        System.out.println("True");
        else System.out.println("False");
    }
}