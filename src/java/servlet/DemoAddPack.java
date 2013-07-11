package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import menu.Item;
import menu.Pack;

public class DemoAddPack extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();

//        String itemTitle = request.getParameter("itemTitle");
//        String itemDesc = request.getParameter("itemDesc");
//        Integer itemCost = Integer.parseInt(request.getParameter("itemCost"));
//        String itemCategory = request.getParameter("itemCategory");
//        Pack.AddToListPack(itemTitle, itemDesc, itemCost, itemCategory);
//        HttpSession session = request.getSession(true);      
//session.setAttribute("cart", Pack.ListPack);   
//response.sendRedirect("DemoListPack");
       try {
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<br><a href=\"http://localhost:8080/microsoft-vt-master/DemoClearPack\">"
//                    + "Очистить корзину</a><br> ");
//
//
//            if (!Pack.ListPack.isEmpty()) {
//                for (Item i : Pack.ListPack) {
//                    out.println("<br>" + i.toStringItem(i) + "<br><br>");
//                }
//            } else {
//                out.println("<b> В данном разделе блюд нет </b>");
//            }
//            out.println("</body>");
//            out.println("</html>");
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
