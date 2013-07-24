
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

public class MainServlet extends HttpServlet {

    protected String processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
                request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
String Category = request.getParameter("cat");
      try{
        HibernateUtils.getSessionFactoryInstance();
        
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
            HibernateUtils hbUtils = new HibernateUtils();
 JSONArray ar = new JSONArray();
      String cat="";
      if ("1".equals(Category)){
          cat = "Закуски";
      }
      if ("2".equals(Category)){
          cat = "Десерты";
      }
      if ("3".equals(Category)){
          cat = "Первые блюда";
      }
      if ("4".equals(Category)){
          cat = "Вторые блюда";
      }
      if ("5".equals(Category)){
          cat = "Напитки";
      }
      if ("6".equals(Category)){
          cat = "Выпечка";
      }


    List<Item> listItems = hbUtils.getItemCategoryList(cat);
    JSONObject obj = new JSONObject(); 
    
out.print("{\"items\":["); 
int n = 0;
for (Item i : listItems) {
    n++;
    
}

    for (Item i : listItems) {
n--;
out.print("{\"title"+"\":\""+ i.getItemTitle()+"\",");
out.print("\"cost"+"\":"+ i.getItemCost()+",");
out.print("\"category"+"\":\""+ i.getItemCategory()+"\",");
out.print("\"desc"+"\":\""+ i.getItemDesc()+"\"}");
if (n!=0){
    out.print(",");
}
    }          
out.print("],\"orderCompleted\": true}"); 
       return "";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(MainServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(MainServlet.class.getName()).log(Level.SEVERE, null, ex);
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
