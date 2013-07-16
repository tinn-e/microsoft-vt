package menu;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class CategoryTest {
    
    public CategoryTest() {
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
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void test_Set_get_CategoryID() {
        System.out.println("setCategoryIDTest");
        Integer categoryID = 12345;
        Category instanceCat = new Category();
        Integer expResult = 12345;
        instanceCat.setCategoryID(categoryID);
        Integer result = instanceCat.getCategoryID();
        assertEquals(expResult, result);
    }
    
    @Test
    public void test_Set_get_CategoryName() {
        System.out.println("setCategoryNameTest");
        String categoryName = "Категория";
        Category instanceCat = new Category();
        String expResult = "Категория";
        instanceCat.setCategoryName(categoryName);
        String result = instanceCat.getCategoryName();
        assertEquals(expResult, result);
    } 
}
