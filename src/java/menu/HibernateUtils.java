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
    
    public static Session getSessionInstance() {
        if (session == null) {
            session = HibernateUtils.getSessionFactoryInstance().openSession();
        }
        return session;
    }

      public Integer addItem(Item item){
      Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
      Transaction tx = null;
      Integer itemID = null;
      try{
         tx = session2.beginTransaction();
         itemID = (Integer)session2.save(item); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session2.close(); 
      }
      return itemID;
   }
      
      public List <Item> getItemList(){
      Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
      Transaction tx = null;
      List ListItems = null;
      try{
         tx = session2.beginTransaction();
         ListItems = session2.createQuery("FROM Item").list(); 
         for (Iterator iterator = 
                           ListItems.iterator(); iterator.hasNext();){
            Item prod = (Item) iterator.next(); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
        session2.close(); 
      }
        return ListItems;
   }
         
      
      public String deleteItem(int ItemID){
      Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
      Transaction tx = null;
      try{
         tx = session2.beginTransaction();
         Item prod = 
                   (Item)session2.get(Item.class, ItemID); 
         session2.delete(prod); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session2.close(); 
      }
        return "Успешно удален!";
   }
 
      
      public String deleteAllItem(){
      HibernateUtils instanse = new HibernateUtils();
      Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
      try{
        List<Item> list = instanse.getItemList();
        int ID = 0;
        for (Item i : list){
            ID = i.getItemID();
            instanse.deleteItem(ID);
    } 
      }catch (HibernateException e) {
         e.printStackTrace(); 
      }finally {
         session2.close(); 
      }
        return "ОК";
   }
      
      public String updateItem(int itemID, String itemTitle,
                             String itemDesc, int itemCost, String itemCategory){
      Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
      Transaction tx = null;
      try{
         tx = session2.beginTransaction();
         Item item = (Item)session2.get(Item.class, itemID); 
         item.setItemTitle(itemTitle);
         item.setItemDesc(itemDesc);
         item.setItemCost(itemCost);
         item.setItemCategory(itemCategory);
		 session2.update(item); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session2.close(); 
      }
        return "Успешно отредактировано!";
   }
      /////////////////////////////////////////////////////////////
      /////////////////////////////////////////////////////////////
      

       //Метод для добавления категории в базу данных

      public Integer addCategory(Category category) {
        Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
        Transaction tx = null;
        Integer catID = null;        
        try {
            tx= session2.beginTransaction();
            catID = (Integer)session2.save(category);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session2.close();
        }
          return catID;
      }      
      
       // Метод для получения коллекции категорий
      
      public List <Category> getCategoryList(){
      Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
      Transaction tx = null;
      List ListItems = null;
      try{
         tx = session2.beginTransaction();
         ListItems = session2.createQuery("FROM Category").list(); 
         for (Iterator iterator = 
                           ListItems.iterator(); iterator.hasNext();){
            Category cat = (Category) iterator.next(); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session2.close(); 
      }
        return ListItems;
   }
    
       //Метод удаления категории
 
      public String deleteCategory (int catID){
      Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
      Transaction tx = null;
      try{
         tx = session2.beginTransaction();
         Category cat = 
                   (Category)session2.get(Category.class, catID); 
         session2.delete(cat); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session2.close(); 
      }
        return "Категория успешно удалена.";
      }
      
      
      public String deleteAllCategories() {
        HibernateUtils instanse = new HibernateUtils();
        Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
        try {
            List<Category> list = instanse.getCategoryList();
            int ID = 0;
            for (Category i : list) {
                ID = i.getCategoryID();
                instanse.deleteCategory(ID);
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session2.close(); 
        }
        return "ОК";
    }
      
      //Получения списка всех категорий
      public List <Item> getItemCategoryList(String cat){
      Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
      Transaction tx = null;
      List listItems = null;
      try{
         tx = session2.beginTransaction();
         
         String hql = "FROM Item E WHERE E.itemCategory = '" + cat + "'";
         listItems = session2.createQuery(hql).list(); 
         for (Iterator iterator = 
                           listItems.iterator(); iterator.hasNext();){
            Item prod = (Item) iterator.next(); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session2.close(); 
      }
        return listItems;
   }   
      
            public Integer addUser(User user) {
        Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
        Transaction tx = null;
        Integer userID = null;        
        try {
            tx = session2.beginTransaction();
            userID = (Integer)session2.save(user);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session2.close();
        }
          return userID;
      }      
      
      public List <User> getUserList(){
      Session session2 = HibernateUtils.getSessionFactoryInstance().openSession();
      Transaction transaction = null;
      List ListUsers = null;
      try{
         transaction = session2.beginTransaction();
         ListUsers = session2.createQuery("FROM User").list(); 
         for (Iterator iterator = 
                           ListUsers.iterator(); iterator.hasNext();){
            User prod = (User) iterator.next(); 
         }
         transaction.commit();
      }catch (HibernateException e) {
         if (transaction!=null) transaction.rollback();
         e.printStackTrace(); 
      }finally {
         session2.close(); 
      }
        return ListUsers;
   }
     
    public String deleteUser(int userID){
      HibernateUtils.session = HibernateUtils.factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         User user = 
                   (User)session.get(User.class, userID); 
         session.delete(user); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
        return "Пользователь успешно удален!";
   } 
}