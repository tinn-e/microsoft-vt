package org.apache.jsp.root_002dpanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("  <!--[if lt IE 9]><script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <section class=\"login\">\n");
      out.write("      <h1>Панель адинистратора</h1>\n");
      out.write("      <form method=\"GET\" action=\"http://localhost:8084/MENU/AuthorizationServlet\">\n");
      out.write("        <p><input type=\"text\" name=\"login\" placeholder=\"Введите логин\"></p>\n");
      out.write("        <p><input type=\"password\" name=\"password\" placeholder=\"Введите пароль\"></p>\n");
      out.write("        <p class=\"remember_me\">\n");
      out.write("          <label>\n");
      out.write("           <!-- <input type=\"checkbox\" name=\"remember_me\" id=\"remember_me\"><!--\n");
      out.write("           -->\n");
      out.write("            Запомнить меня\n");
      out.write("          </label>\n");
      out.write("        </p>\n");
      out.write("        <p class=\"submit\"><input type=\"submit\" value=\"Вход\"></p>\n");
      out.write("      </form>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"login-help\">\n");
      out.write("      <p>Забыли пароль? <a href=\"#\">Восстановить</a>.</p>\n");
      out.write("    </section>\n");
      out.write("  </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
