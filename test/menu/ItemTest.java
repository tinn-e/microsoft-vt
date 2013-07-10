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
    public void testSetAndGetItemCategory(){
        Item instance = new Item();
        String category = "Горячее";
        instance.setItemCategory(category);
        String expResult = "Горячее";
        String result = instance.getItemCategory();
        assertEquals(expResult, result);
    }
    @Test
        public void testPrintItemCategory(){
        Item instance = new Item("Картошка жареная", "Картошка, собранная в самых плодородных полях Белоруссии, отличающаяся своими исключительными вкусовыи качествами", 200, "Горячее");
        String expResult = "<b>Категория:<b> Горячее";
        String result = instance.printItemCategory(instance);
        assertEquals(expResult, result);
    }
    @Test
        public void testPrintItemTitle(){
        Item instance = new Item("Картошка жареная", "Картошка, собранная в самых плодородных полях Белоруссии, отличающаяся своими исключительными вкусовыи качествами", 200, "Горячее");
        String expResult = "<b>Название:</b> Картошка жареная";
        String result = instance.printItemTitle(instance);
        assertEquals(expResult, result);
    }
    @Test
        public void testPrintItemDesc(){
        Item instance = new Item("Картошка жареная", "Картошка, собранная в самых плодородных полях Белоруссии, отличающаяся своими исключительными вкусовыи качествами", 200, "Горячее");
        String expResult = "<b>Описание:</b> Картошка, собранная в самых плодородных полях Белоруссии, отличающаяся своими исключительными вкусовыи качествами";
        String result = instance.printItemDesc(instance);
        assertEquals(expResult, result);
    }
    @Test
        public void testPrintItemCost(){
        Item instance = new Item("Картошка жареная", "Картошка, собранная в самых плодородных полях Белоруссии, отличающаяся своими исключительными вкусовыи качестваи", 200, "Горячее");
        String expResult = "<b>Цена:</b> 200 руб";
        String result = instance.printItemCost(instance);
        assertEquals(expResult, result);
    }
    @Test
        public void testToStringItem(){
        Item instance = new Item("Картошка жареная", "Картошка, собранная в самых плодородных полях Белоруссии, отличающаяся своими исключительными вкусовыи качествами", 200, "Горячее");
        String expResult = "<b>Название:</b> Картошка жареная<br><b>Описание:</b> Картошка, собранная в самых плодородных полях Белоруссии, отличающаяся своими исключительными вкусовыи качествами<br><b>Цена:</b> 200 руб<br><b>Категория:<b> Горячее";
        String result = instance.toStringItem(instance);
        assertEquals(expResult, result);
    }
    
    @Test
     public void testSetMark(){
        Item instanse = new Item("pirog", "sladkiy", 400, "desert");
        instanse.setMark(5);
        instanse.setMark(5);
        instanse.setMark(5);
        int expResult = 15;
        int result = instanse.getMarkOfUser();
        assertEquals(expResult,result);
        
        int expValueOfMarks = 3;
        int resValueOfMarks = instanse.getValueOfMarks();
        assertEquals(expValueOfMarks,expValueOfMarks);
        
        instanse.setRatingOfItem((double)instanse.getMarkOfUser()/(double)instanse.getValueOfMarks());
        Double expResultRate = 5.0;
        Double resultRate = instanse.getRatingOfItem();
        assertEquals(expResultRate,resultRate);
            }

}
