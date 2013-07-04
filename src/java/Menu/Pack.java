/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Menu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;



public class Pack {
    //public static HashMap PackMenu = new HashMap();

 // public static HashMap<Integer, Dish> PackMenuOne = new HashMap<Integer, Dish>();
    private Integer summ;
    HashMap<Integer,Item> HashPack = new HashMap<Integer,Item>();

   /* public Integer Summ() {
        if (Pack.PackMenuOne.size() != 0) {
            for (Iterator<Integer> cost = Pack.PackMenuOne.keySet().iterator(); cost.hasNext();) {
                Integer summ = 0;
                summ += cost.next();
            }
        }
        return summ;
    }*/
    public HashMap<Integer, Item> AddToPack(Integer ID, Item dish){
        HashPack.put(ID, dish);
        return HashPack;
    }
    public HashMap<Integer, Item> DelFromPack(Integer ID){
        HashPack.remove(ID);
        return HashPack;
    }
    public HashMap<Integer, Item> ClearPack(){
        HashPack.clear();
        return HashPack;
    }
   public Integer Summa() {
        if (!HashPack.isEmpty()) {
            for (Iterator<Integer> cost = HashPack.keySet().iterator(); cost.hasNext();) {
                Integer summ = 0;
                summ += cost.next();
            }
        }
        return summ;
    }
}