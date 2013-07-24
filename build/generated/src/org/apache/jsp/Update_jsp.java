package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Редактировать</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("         ");

            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            
            String itemID = request.getParameter("itemID");
            String itemTitle = request.getParameter("itemTitle");
            String itemDesc = request.getParameter("itemDesc");        
            String itemCost = request.getParameter("itemCost"); 
            String itemCategory = request.getParameter("itemCategory");

       
      out.write("\n");
      out.write("        <form action=\"DemoUpdate\" method = \"GET\">\n");
      out.write("            <input value =\"");
      out.print( itemID );
      out.write("\" type=\"hidden\" name=\"itemID\">\n");
      out.write("            <h1>Редактировать  </h1>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Название: </td>\n");
      out.write("                    <td> <input value =\"");
      out.print( itemTitle );
      out.write("\" type=\"text\" name=\"itemTitle\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Описание: </td>\n");
      out.write("                    <td> <input value =\"");
      out.print( itemDesc );
      out.write("\" type=\"text\" name=\"itemDesc\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Цена: </td>\n");
      out.write("                    <td>  <input value =\"");
      out.print( itemCost );
      out.write("\" type=\"text\" name=\"itemCost\">     \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Цена: </td>\n");
      out.write("                    <td>  <input value =\"");
      out.print( itemCategory );
      out.write("\" type=\"text\" name=\"itemCategory\">     \n");
      out.write("                </tr>\n");
      out.write("                <tr> \n");
      out.write("                    <td colspan=\"2\"> <input type=\"submit\" value=\"Редактировать\">\n");
      out.write("                </tr>                \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
