
package menu;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

public class CartBean {

    private List<Item> cartShop = new ArrayList<Item>();

    public synchronized void addItem(String itemTitle, String itemDesc, int itemCost, String itemCategory, String itemImage) {
        Item item = new Item(itemTitle, itemDesc, itemCost, itemCategory, itemImage);
        cartShop.add(item);
    }

    public synchronized List<Item> getCartShop() {
        return new ArrayList<Item>(cartShop);
    }

    public static CartBean get(HttpSession session) {
        CartBean cart = (CartBean) session.getAttribute("cart");
        if (cart == null) {
            cart = new CartBean();
            session.setAttribute("cart", cart);
        }

        return cart;
    }
}
