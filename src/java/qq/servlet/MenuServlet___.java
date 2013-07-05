package qq.servlet;

import java.util.Iterator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Hashtable;
import qq.Item;

public class MenuServlet___ extends HttpServlet {

    public static Hashtable CategoryMenu = new Hashtable();
    public static Hashtable<Integer, Item> CategoryMenuOne = new Hashtable<Integer, Item>();

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
//        String prodTitle = request.getParameter("prodTitle");
//        String prodDesc = request.getParameter("prodDesc");
//        Integer Id = Integer.parseInt(request.getParameter("Id"));
//        Integer prodCost = Integer.parseInt(request.getParameter("prodCost"));
        
        String prodTitle = "П  и в о";
        String prodDesc = "Днищенское";
        Integer Id = 777;
        Integer prodCost = 876;
        Item x = new Item(prodTitle, prodDesc, prodCost);
        CategoryMenuOne.put(Id, x);
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");

            out.println("</head>");
            out.println("<body>");
            if (!MenuServlet___.CategoryMenuOne.isEmpty()) {
                for (Iterator<Integer> it = MenuServlet___.CategoryMenuOne.keySet().iterator(); it.hasNext();) {
                    Integer key = it.next();
                    MenuServlet___.CategoryMenuOne.get(key).getProdTitle();
                    out.println("<a target='rig' href=messager.jsp?theme_header=" + key + "&name=" + "&pass=%3D%3DQM&subf=1>" + "<b>Тема: </b>" + key + " - "
                            + MenuServlet___.CategoryMenuOne.get(key) + "</a>   ");
                    out.println("<a target='rig' href=retalk.jsp?theme_header=" + key + "&name=" + "&pass=%3D%3DQM&subf=1>" + "<i>Ответить</i>" + "</a><br><br>");
                    out.println("<META HTTP-EQUIV=\"REFRESH\" CONTENT=\"0; URL=main.jsp" + "\">");
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
