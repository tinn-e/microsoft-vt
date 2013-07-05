package qq.servlet;

import java.util.Iterator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Hashtable;
import qq.DB;
import qq.Item;

public class MenuServlet extends HttpServlet {

    public Hashtable CategoryMenu = new Hashtable();
    public Hashtable<Integer, Item> CategoryMenuOne = new Hashtable<Integer, Item>();

    public Object PutDish(Integer Id, Object Dish) {
        return CategoryMenu.put(Id, Dish);
    }

    public Object GetDish(Integer Id) {
        return CategoryMenu.get(Id);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        MenuServlet ME = new MenuServlet();
        
        String prodTitle = request.getParameter("prodTitle");
        String prodDesc = request.getParameter("prodDesc");
        Integer Id = Integer.parseInt(request.getParameter("Id"));
        Integer prodCost = Integer.parseInt(request.getParameter("prodCost"));
        Item prod = new Item(prodTitle, prodDesc, prodCost);

        ME.CategoryMenuOne.put(Id, prod);

        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
                        
            if (!ME.CategoryMenuOne.isEmpty()) {
                for (Iterator<Integer> it = ME.CategoryMenuOne.keySet().iterator(); it.hasNext();) {
                    Integer key = it.next();
                    
                     out.println(ME.CategoryMenuOne.get(key).getProdTitle() +"<br>");
                     out.println(ME.CategoryMenuOne.get(key).getProdDesc() +"<br>");
                     out.println(ME.CategoryMenuOne.get(key).getProdCost() +"<br><hr>");
                   // out.println("<META HTTP-EQUIV=\"REFRESH\" CONTENT=\"0; URL=main.jsp" + "\">");
                }
            } else {
                out.println("<b> В данном разделе блюд нет </b>");
            }
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
