package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import menu.HibernateUtils;
import menu.Item;

@WebServlet(name = "DemoAdd", urlPatterns = {"/DemoAdd"})
public class DemoAdd extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              try{
        HibernateUtils.getSessionFactoryInstance();
        
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String itemTitle = request.getParameter("itemTitle");
        String itemDesc = request.getParameter("itemDesc");        
        String itemCost = request.getParameter("itemCost"); 
        int i_itemCost = Integer.parseInt(itemCost);
        
        HibernateUtils hbUtils = new HibernateUtils();
        Item item = new Item(itemTitle, itemDesc, i_itemCost);
        hbUtils.addItem(item);

        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DemoAdd</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Добавлено!</h1>");
            out.println(item.toStringItem(item));
            
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
