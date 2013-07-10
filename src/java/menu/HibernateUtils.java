package menu;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    public static SessionFactory factory;
    public static Session session;

    public static SessionFactory getSessionFactoryInstance() {
        if (factory == null) {
            factory = new Configuration().configure().buildSessionFactory();
        }
        return factory;
    }

      public Integer addItem(Item item){
      HibernateUtils.session = HibernateUtils.factory.openSession();
      Transaction tx = null;
      Integer itemID = null;
      try{
         tx = HibernateUtils.session.beginTransaction();
         itemID = (Integer)HibernateUtils.session.save(item); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         HibernateUtils.session.close(); 
      }
      return itemID;
   }
      
      public List <Item> getItemList(){
      HibernateUtils.session = HibernateUtils.factory.openSession();
      Transaction tx = null;
      List ListItems = null;
      try{
         tx = HibernateUtils.session.beginTransaction();
         ListItems = HibernateUtils.session.createQuery("FROM Item").list(); 
         for (Iterator iterator = 
                           ListItems.iterator(); iterator.hasNext();){
            Item prod = (Item) iterator.next(); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         HibernateUtils.session.close(); 
      }
        return ListItems;
   }
      
      public List <Item> getItemCategoryList(String cat){
      HibernateUtils.session = HibernateUtils.factory.openSession();
      Transaction tx = null;
      List listItems = null;
      try{
         tx = HibernateUtils.session.beginTransaction();
         
         String hql = "FROM Item E WHERE E.itemCategory = '" + cat + "'";
         listItems = HibernateUtils.session.createQuery(hql).list(); 
         for (Iterator iterator = 
                           listItems.iterator(); iterator.hasNext();){
            Item prod = (Item) iterator.next(); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         HibernateUtils.session.close(); 
      }
        return listItems;
   }      
      
      public String deleteItem(int ItemID){
      HibernateUtils.session = HibernateUtils.factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Item prod = 
                   (Item)session.get(Item.class, ItemID); 
         session.delete(prod); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
        return "Успешно удален!";
   }
      
       /*
       метод для добавления категории в базу данных
       */
      public Integer addCategory(Category category) {
        HibernateUtils.session = HibernateUtils.factory.openSession();
        Transaction tx = null;
        Integer catID = null;        
        try {
            tx = tx = HibernateUtils.session.beginTransaction();
            catID = (Integer) HibernateUtils.session.save(category);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            HibernateUtils.session.close();
        }
          return catID;
      }      
      /*
       Метод для получения коллекции категорий
       */
      public List <Item> getCategoryList(){
      HibernateUtils.session = HibernateUtils.factory.openSession();
      Transaction tx = null;
      List ListItems = null;
      try{
         tx = HibernateUtils.session.beginTransaction();
         ListItems = HibernateUtils.session.createQuery("FROM Category").list(); 
         for (Iterator iterator = 
                           ListItems.iterator(); iterator.hasNext();){
            Category cat = (Category) iterator.next(); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         HibernateUtils.session.close(); 
      }
        return ListItems;
   }
      /*
       Метод удаления категории
       */
      public String deleteCategory (int catID){
          HibernateUtils.session = HibernateUtils.factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Category cat = 
                   (Category)session.get(Item.class, catID); 
         session.delete(cat); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
        return "Категория успешно удалена.";
      }
      
      
      public String deleteAllItem(){
      HibernateUtils.session = HibernateUtils.factory.openSession();
      try{
        HibernateUtils instanse = new HibernateUtils();
        List<Item> list = instanse.getItemList();
        int ID = 0;
        for (Item i : list){
            ID = i.getItemID();
            instanse.deleteItem(ID);
    } 
      }catch (HibernateException e) {
         e.printStackTrace(); 
      }finally {
         //session.close(); 
      }
        return "ОК";
   }
      
      public String updateItem(int itemID, String itemTitle,
                             String itemDesc, int itemCost, String itemCategory){
      HibernateUtils.session = HibernateUtils.factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Item item = (Item)session.get(Item.class, itemID); 
         item.setItemTitle(itemTitle);
         item.setItemDesc(itemDesc);
         item.setItemCost(itemCost);
         item.setItemCategory(itemCategory);
		 session.update(item); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
        return "Успешно отредактировано!";
   }
      
}