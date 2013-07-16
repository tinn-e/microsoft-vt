package org.apache.jsp.root_002dpanel.bobr_002dmobr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import menu.Category;
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
      out.write(" ");

            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html");

            try {
                HibernateUtils.getSessionFactoryInstance();

            } catch (Throwable ex) {
                System.err.println("Failed to create sessionFactory object." + ex);
                throw new ExceptionInInitializerError(ex);
            }
            HibernateUtils hbUtils = new HibernateUtils();

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("    <head> \n");
      out.write("        <title>Панель администратора | Ресторан \"Бобо-Мобр\"</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">           \n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/default.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\n");
      out.write("\t<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("        \n");
      out.write("<script type='text/javascript'>\n");
      out.write("function start(){\n");
      out.write("   var x=document.getElementById('itemTitle').value;\n");
      out.write("   var y=document.getElementById('itemDesc').value;\n");
      out.write("   var z=document.getElementById('itemCost').value;  \n");
      out.write("   var z2=document.getElementById('itemCategory').value;  \n");
      out.write("  \n");
      out.write("   xhttp=new XMLHttpRequest();\n");
      out.write("   xhttp.onreadystatechange=function(){\n");
      out.write("      if (xhttp.readyState==4 && xhttp.status==200)\n");
      out.write("         document.getElementById('q').innerHTML=xhttp.responseText;\n");
      out.write("   }\n");
      out.write("   xhttp.open('GET','/microsoft-vt/DemoAdd?itemTitle='+x+'&itemDesc='\n");
      out.write("       +y+'&itemCost='+z+'&itemCategory='+z2,true);\n");
      out.write("   xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("  \n");
      out.write("        <div class=\"md-modal md-effect-7\" id=\"q\">\n");
      out.write("            <div class=\"md-content\">\n");
      out.write("                <h3>Добавить блюдо</h3>\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td> Название: </td>\n");
      out.write("                                <td> <input type=\"text\" name=\"itemTitle\" id='itemTitle'>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td> Описание: </td>\n");
      out.write("                                <td> <input type=\"text\" name=\"itemDesc\" id='itemDesc'>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td> Цена: </td>\n");
      out.write("                                <td>  <input type=\"text\" name=\"itemCost\" id='itemCost'>     \n");
      out.write("                            </tr>\n");
      out.write("                            <tr> \n");
      out.write("                                <td> Категория: </td>\n");
      out.write("                                <td>  \n");
      out.write("                                    <select name=\"itemCategory\"  id='itemCategory'/>\n");
      out.write("                                    ");

                                        List<Category> listCat = hbUtils.getCategoryList();
                                        for (Category i : listCat) {
                                            out.println("<option value=\"" + i.getCategoryName() + "\">"
                                                    + i.getCategoryName() + "</option>");
                                        }
                                    
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr> \n");
      out.write("                                <td colspan=\"2\"> <input type='button' value='Добавить' onclick='start()'/>\n");
      out.write("                            </tr>                \n");
      out.write("                        </table>\n");
      out.write("<br /><br />\n");
      out.write("\n");
      out.write("                    <button class=\"md-close\">Close me!</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("<div class=\"md-modal md-effect-7\" id=\"modal-77\">\n");
      out.write("            <div class=\"md-content\">\n");
      out.write("                <h3>Добавить блюдо</h3>\n");
      out.write("\n");
      out.write("        </div>        \n");
      out.write("</div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("        <div class=\"container\">\t\t\n");
      out.write("            <div class=\"main clearfix\">\n");
      out.write("                <button class=\"md-trigger\" data-modal=\"q\">Добавить блюда</button>\n");
      out.write("                <button class=\"md-trigger\" data-modal=\"modal-7\">Добавить категорию</button>\n");
      out.write("                <button class=\"md-trigger\" data-modal=\"modal-7\">Сменить пароль</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("        <h2>Ваше меню:</h2>\n");
      out.write("         ");

  List <Category> listCat2 = hbUtils.getCategoryList();
  List <Item> listItems = null;
  String cat = "";
   for (Category i : listCat2) {
               cat = i.getCategoryName();
               out.println("<h3>"+cat+"</h3>");
               listItems = hbUtils.getItemCategoryList(cat);
               if(listItems .size()==0){
                   out.println ("Тут пусто :(");
               }
                 for (Item i2 : listItems) {
                out.println (" <div id=\"container_buttons\">");
                out.println("<br>" + i2.toStringItem(i2));
                
                /*out.println("<br><a href=\"http://localhost:8080/microsoft-vt/DemoAddPack?"
                        + "&itemTitle=" + i.getItemTitle()
                        + "&itemDesc=" + i.getItemDesc()
                        + "&itemCost=" + i.getItemCost()
                        + "&itemCost=" + i.getItemCategory()
                        + "\">Добавить в корзину</a> (Эта кнопка в меню для посетителей)<br> ");*/

                out.println("<br><a href=\"http://localhost:8080/microsoft-vt/DemoUpdate.jsp?"
                        + "itemID=" + i2.getItemID()
                        + "&itemTitle=" + i2.getItemTitle()
                        + "&itemDesc=" + i2.getItemDesc()
                        + "&itemCost=" + i2.getItemCost()
                        + "&itemCategory=" + i2.getItemCategory()
                        + "\">Редактировать</a> |  ");
                
                out.println("<a href=\"http://localhost:8080/microsoft-vt/DemoDelete?"
                        + "itemID=" + i2.getItemID()
                        + "\">Удалить</a><br>");
                out.println (" </div>");
            }
                 }
 
      out.write("\n");
      out.write("\t\t<div class=\"md-overlay\"></div><!-- the overlay element -->\n");
      out.write("\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t<script src=\"js/modalEffects.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t// this is important for IEs\n");
      out.write("\t\t\tvar polyfilter_scriptpath = '/js/';\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script src=\"js/cssParser.js\"></script>\n");
      out.write("\t\t<script src=\"js/css-filters-polyfill.js\"></script>\n");
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
