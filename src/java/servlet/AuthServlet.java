package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import menu.HibernateUtils;
import menu.User;

public class AuthServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");

        try {
            HibernateUtils.getSessionFactoryInstance();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        HibernateUtils hibernateUtils = new HibernateUtils();
        
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            String userLogin,userPassword = null;  
            int fail = 0;
            
        try {
            List<User> list = hibernateUtils.getUserList();
                for (User i : list) {
                    userLogin = i.getLogin();
                    userPassword = i.getPassword();

                    if (userLogin.equals(login) == true && userPassword.equals(password) == true) {
                        fail = 10;
                        out.println("<script language = 'javascript'>var delay = 0;"
                                + " setTimeout(\"document.location.href='/microsoft-vt/root-panel/bobr-mobr/index.jsp'\", delay);</script>");
                        break;
                    } else {
                        fail=fail +0;
                    }
                }

            if (fail == 0) {
                out.println("<center><font color=\"#FF0000\">Неправильная пара логин-пароль!<br>"
                        + "Авторизоваться не удалось.</font></center>");
            }

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
