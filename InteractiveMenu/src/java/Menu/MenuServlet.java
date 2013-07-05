/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Menu;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import Menu.Item;

public class MenuServlet extends HttpServlet {
public static HashMap CategoryMenu = new HashMap();
public static HashMap<Integer, Item> CategoryMenuOne = new HashMap<Integer, Item>();
    public Object PutDish(Integer Id, Object Dish) {
        return CategoryMenu.put(Id, Dish);
    }
    public Object GetMess(Integer Id) {
        return CategoryMenu.get(Id);
    }
}