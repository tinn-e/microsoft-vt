/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import menu.HibernateUtils;
import menu.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class HbSession extends HttpServlet {

    protected String processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

      try{
        HibernateUtils.getSessionFactoryInstance();
        
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
            HibernateUtils hbUtils = new HibernateUtils();
 JSONArray ar = new JSONArray();
JSONObject obj = new JSONObject();
JSONObject resultJson = new JSONObject();

ar.add("first");
ar.add(new Integer(100));

obj.put("title", "two");
obj.put("cost", "four");

resultJson.put("paramsArray", ar);
resultJson.put("paramsObj", obj);
resultJson.put("paramsStr", "some string");
out.println(obj.toString());          

    String cat = "Закуски";
    List<Item> listItems = hbUtils.getItemCategoryList(cat);
    for (Item i : listItems) {
      ar.add(i.getItemTitle());
      ar.add(i.getItemCost());  
      ar.add(i.getItemDesc());  
      ar.add(i.getItemCategory());  
      ar.add(i.getItemImage());  
    }
            

       return "";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(HbSession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(HbSession.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
