package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import menu.HibernateUtils;
import menu.User;

@WebServlet(name = "AuthorizationServlet", urlPatterns = {"/AuthorizationServlet"})
public class AuthorizationServlet extends HttpServlet {

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
        HibernateUtils hibernateUtils = new HibernateUtils();
        
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            String userLogin = null;
            String userPassword = null;           
            List<User> list = hibernateUtils.getUserList();
            for (User i : list) {
                userLogin = i.getLogin();
                userPassword = i.getPassword();

                if (userLogin.equals(login) == true && userPassword.equals(password) == true) {
                    response.sendRedirect(request.getContextPath() + "/root-panel/bobr-mobr/index.jsp");
                    //response.sendRedirect("http://localhost:8084/MENU/root-panel/bobr-mobr/index.jsp");
                    return;
                } else {
                    response.sendRedirect(request.getContextPath() + "/root-panel/error.jsp");
                    //response.sendRedirect("http://localhost:8084/MENU/root-panel/error.jsp");
                   return;
                }
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
