package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import menu.HibernateUtils;

@WebServlet(name = "DemoUpdate", urlPatterns = {"/DemoUpdate"})
public class DemoUpdate extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        
            String itemID = request.getParameter("itemID");
            String itemTitle = request.getParameter("itemTitle");
            String itemDesc = request.getParameter("itemDesc");        
            String itemCost = request.getParameter("itemCost"); 
        
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DemoUpdate</title>");            
            out.println("</head>");
            out.println("<body>");
            HibernateUtils hbUtils = new HibernateUtils();
            
            int i_itemCost = Integer.parseInt(itemCost);
            int i_itemID = Integer.parseInt(itemID); 
            
            out.println(hbUtils.updateItem(i_itemID, itemTitle, itemDesc, i_itemCost));
            
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
