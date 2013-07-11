package menu;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Сергей
 */
public class CategoryTest {
    
    public CategoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
//        try{
//        HibernateUtils.getSessionFactoryInstance();
//      }catch (Throwable ex) { 
//         System.err.println("Failed to create sessionFactory object." + ex);
//         throw new ExceptionInInitializerError(ex); 
//      }
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setID method, of class Category.
     */
    @Test
    public void testtest_Set_get_CategoryID() {
        System.out.println("setCategoryIDTest");
        Integer categoryID = 12345;
        Category instanceCat = new Category();
        Integer expResult = 12345;
        instanceCat.setID(categoryID);
        Integer result = instanceCat.getID();
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