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
import menu.Pack;

@WebServlet(name = "DemoListPack", urlPatterns = {"/DemoListPack"})
public class DemoListPack extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HibernateUtils.getSessionFactoryInstance();

        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DemoListPack</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h2>Ваша корзина:</h2>");
            
            out.println("<br><a href=\"http://localhost:8080/HB_2.0/DemoClearPack\">"
                    + "Очистить корзину</a><br> ");
            
            if (!menu.Pack.ListPack.isEmpty()) {
                for (Item i : menu.Pack.ListPack) {
                    out.println("<br>" + i.toStringItem(i) + "<br><br>");
                }
            } else {
                out.println("<b> В данном разделе блюд нет </b>");
            }
            out.println("<br><b>Сумма заказа: </b>" + Pack.SummPack(Pack.ListPack) + "<b> руб</b>") ;
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
