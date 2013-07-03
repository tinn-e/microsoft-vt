package tinne;

import java.util.HashSet;

public class Hbdemo {
        public static void main(String[] args) {
        try {
            MenuDB.CreateSession();
        } catch (Throwable ex) {
            System.err.println("Ошибка при создании сессии" + ex);
            throw new ExceptionInInitializerError(ex);
        }
        MenuDB ME = new MenuDB();

        /* Добавление категории */
        HashSet set1 = new HashSet();
        set1.add(new Category("Закуски"));

        /* Запись продукта в базу */
        String prodTitle = "Кукуруза";
        String prodDesc = "Она офигенная";
        Float prodCost = (float)170;
        ME.addItem(prodTitle, prodDesc, prodCost, set1);

        /* Вывод базы на экран  */
        ME.listItems();
    }
}
