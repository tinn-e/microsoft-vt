package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import menu.Item;
import menu.HibernateUtils;
import menu.Pack;

@WebServlet(name = "DemoList", urlPatterns = {"/DemoList"})
public class DemoList extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try{
        HibernateUtils.getSessionFactoryInstance();
        
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DemoList</title>");            
            out.println("</head>");
            out.println("<body>");
            
            HibernateUtils hbUtils = new HibernateUtils();
            
        Item expResult = new Item("Суп гороховый", "вкусный", 100, "Супы");
        Item expResult2 = new Item("Суп гороховый2", "вкусный2", 100, "Супы2");
        hbUtils.addItem(expResult);
        hbUtils.addItem(expResult2);
            List<Item> listItems = hbUtils.getItemList();
             for (Item i2 : listItems) {
                 out.println("<br>" + i2.toStringItem(i2));
             }
            out.println(listItems.size());
           
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
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
