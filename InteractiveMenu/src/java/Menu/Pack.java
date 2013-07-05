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
       
    HashMap<Integer,Item> HashPack = new HashMap<Integer,Item>();
    private Integer summ = 0;


    public HashMap<Integer,Item> AddTO (Integer ID,Item dish){
        HashPack.put(ID, dish);
        return HashPack;
    }
    
    public HashMap<Integer,Item> RemoveFROM (Integer ID){
        HashPack.remove(ID);
        return HashPack;
    }
    
    public HashMap<Integer, Item> CLEAR (){
        if(HashPack!=null){
            HashPack.clear();
        } 
        return null;
    }
    
    public Integer Summ() {
        if (!HashPack.isEmpty()) {
            for (Iterator<Integer> cost = HashPack.keySet().iterator(); cost.hasNext();) {
                Integer summ = 0;
                summ += cost.next();
            }
        }
        return summ;
    }
}