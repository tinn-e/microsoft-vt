package tinne;

import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MenuDB  {

    private static SessionFactory factory;

    /* Создание сессии */
    public static void CreateSession() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    /* Добавление в базу */
    public Integer addItem(String name, String desc,
            float cost, Set cat) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer prodID = null;
        try {
            tx = session.beginTransaction();
            Item prod = new Item(name, desc, cost);
            prod.setMenuContainer(cat);
            prodID = (Integer) session.save(prod);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return prodID;
    }

    /* Вывод базы на экран */
    public void listItems() {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            List ItemCont = session.createQuery("FROM Item").list();
            for (Iterator iterator1 =
                    ItemCont.iterator(); iterator1.hasNext();) {
                Item product = (Item) iterator1.next();
                
                System.out.println("Название: " + product.getTitle());
                System.out.println("Описание: " + product.getDescription());
                System.out.println("Цена: " + product.getCost() + " руб");
                Set cat = product.getMenuContainer();
                for (Iterator iterator2 =
                        cat.iterator(); iterator2.hasNext();) {
                    Category certName = (Category) iterator2.next();
                    System.out.println("Категория " + certName.getCategoryName());
                }
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
