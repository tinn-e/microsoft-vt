package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import menu.HibernateUtils;
import menu.Item;
import org.json.simple.JSONValue;

public class PrintItems extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        try {
            HibernateUtils.getSessionFactoryInstance();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        HibernateUtils hbUtils = new HibernateUtils();               

        Map obj = null;
        LinkedList list = new LinkedList();

        try {

            List<Item> listItems__2 = null;
            listItems__2 = hbUtils.getItemList();

            for (Item i2 : listItems__2) {
                obj = new LinkedHashMap();
                obj.put("itemID", i2.getItemID());
                obj.put("itemTitle", i2.getItemTitle());
                obj.put("itemDesc", i2.getItemDesc());
                obj.put("itemCategory", i2.getItemCategory());
                obj.put("itemCost", i2.getItemCost());
                list.add(obj);
            }
            String jsonText = JSONValue.toJSONString(list);
            out.print(jsonText);

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
