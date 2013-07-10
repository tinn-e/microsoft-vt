package org.apache.jsp.admin.restor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import menu.Item;
import menu.HibernateUtils;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Ресторан \"Бобр-Мобр!\"</h1><br>\n");
      out.write("        <p>Microsoft-vt©</p>\n");
      out.write("        <form action=\"RestorServlet\" method = \"GET\">\n");
      out.write("        <h2>Добавить блюдо:</h2>\n");
      out.write("        <p>Название<br>\n");
      out.write("        <input type=\"text\" name=\"itemTitle\" value=\"\"><br>\n");
      out.write("        Описание<br>\n");
      out.write("        <input type=\"text\" name=\"itemDesc\" value=\"\"><br>\n");
      out.write("        Цена<br>\n");
      out.write("        <input type=\"text\" name=\"itemCost\" value=\"\"><br>\n");
      out.write("        Категория<br>\n");
      out.write("        <input type=\"text\" name=\"itemCategory\" value=\"\"><br>\n");
      out.write("        <input type=\"submit\" value=\"Добавить!\">   \n");
      out.write("        </p>\n");
      out.write("        </form>\n");
      out.write("        <h2>Список меню:</h2>\n");
      out.write("        ");

            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            
         try{
        HibernateUtils.getSessionFactoryInstance();
        
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
        
        HibernateUtils hbUtils = new HibernateUtils();
        List<Item> listItems = hbUtils.getItemList();
        for (Item i : listItems) {
                
                out.println("<br>" + i.toStringItem(i));
                out.println("<br><a href=\"http://localhost:8080/HB_2.0/DemoPack?"
                        + "&itemTitle=" + i.getItemTitle()
                        + "&itemDesc=" + i.getItemDesc()
                        + "&itemCost=" + i.getItemCost()
                        + "\">Добавить в корзину</a> (Эта кнопка в меню для посетителей)<br> ");

                out.println("<a href=\"http://localhost:8080/HB_2.0/DemoUpdate.jsp?"
                        + "itemID=" + i.getItemID()
                        + "&itemTitle=" + i.getItemTitle()
                        + "&itemDesc=" + i.getItemDesc()
                        + "&itemCost=" + i.getItemCost()
                        + "\">Редактировать</a> |  ");
                
                out.println("<a href=\"http://localhost:8080/HB_2.0/DemoDelete?"
                        + "itemID=" + i.getItemID()
                        + "\">Удалить</a> (Эти кнопки для администрации ресторана)<br><br><hr>");
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
