package menu;

import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    
    public ItemTest() {
    }
    
//    =====================================================================
//    || Во все тесты надо добавить к объектам поле itemCategory
//    || Пример: 
//    || Было:  obj.AddToListPack(title, desc, cost);
//    || Стало:  obj.AddToListPack(title, desc, cost, cat);
//    || И все протестировать после изменений
//    =====================================================================
    
@Test
    public void testSetAndGetItemID() {
        Item instance = new Item();
        int id = 100;
        instance.setItemID(id);
        int expResult = 100;
        int result = instance.getItemID();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAndGetItemTitle() {
        Item instance = new Item();
        String title = "Борщ";
        instance.setItemTitle(title);
        String expResult = "Борщ";
        String result = instance.getItemTitle();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAndGetItemDesc() {
        Item instance = new Item();
        String desc = "Свекла, овощи другие, мясо";
        instance.setItemDesc(desc);
        String expResult = "Свекла, овощи другие, мясо";
        String result = instance.getItemDesc();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAndGetItemCost() {
        Item instance = new Item();
        int cost = 1000;
        instance.setItemCost(cost);
        int expResult = 1000;
        int result = instance.getItemCost();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetAndGetc(){
        Item instance = new Item();
        String category = "Горячее";
        instance.setItemCategory(category);
        String expResult = "Горячее";
        String result = instance.getItemCategory();
        assertEquals(expResult, result);
    }
}
