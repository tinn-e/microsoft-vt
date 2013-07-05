package qq;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DB {
   public static SessionFactory factory; 
   public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      DB ME = new DB();
}

   /* Создание-добавление */
   public Integer addItem(String T, String D, int C){
      factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      Transaction tx = null;
      Integer itemID = null;
      try{
         tx = session.beginTransaction();
         Item prod = new Item(T, D, C);
         itemID = (Integer) session.save(prod); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return itemID;
   }
   
   // прямое добавление
      public Integer addItem(Item a){
      factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      Transaction tx = null;
      Integer itemID = null;
      try{
         tx = session.beginTransaction();
         itemID = (Integer) session.save(a); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return itemID;
   }
   
   /* Method to  READ all the employees */
   public List <Item> getItemList(){
      factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      Transaction tx = null;
      List Items = null;
      try{
         tx = session.beginTransaction();
         Items = session.createQuery("FROM Item").list(); 
         for (Iterator iterator = 
                           Items.iterator(); iterator.hasNext();){
            Item prod = (Item) iterator.next(); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
        return Items;
   }
   /* Method to UPDATE salary for an employee */
   public void updateEmployee(Integer EmployeeID, int salary ){
      factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Item employee = 
                    (Item)session.get(Item.class, EmployeeID); 
         employee.setProdCost( salary );
		 session.update(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to DELETE an employee from the records */
   public String deleteItem(int ItemID){
      factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
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

    public String printTitle(Item a) {
        return "<b>Название:</b> " + a.getProdTitle();
    }

    public String printDesc(Item a) {
        return "<b>Описание:</b> " + a.getProdDesc();
    }

    public String printCost(Item a) {
        return ("<b>Цена:</b> " + a.getProdCost() + " руб").toString();
    }

    public String toStringItem(Item a) {
        return printTitle(a) + "<br>" + printDesc(a) + "<br>" + printCost(a)
                + "<br><br><hr>";
    }
//    public String printCat(Category a) {
//        return ("Категория: " + a.getProdTitle()).toString();
//    }
}