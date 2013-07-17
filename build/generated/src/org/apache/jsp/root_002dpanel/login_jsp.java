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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("   <script src=\"jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#login_link\").click(function(e){\r\n");
      out.write("\t\tvar overlay = $(\"#overlay\");\r\n");
      out.write("\t\tvar w = $(window).width();\r\n");
      out.write("\t\tvar h = $(window).height();\r\n");
      out.write("\t\toverlay.css('width', w);\r\n");
      out.write("\t\toverlay.css('height', h);\r\n");
      out.write("\t\toverlay.css('display','block');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#login_result\").html('').removeClass();\r\n");
      out.write("\t\t$(\"#login_box\").css('display','block');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#close_btn\").click(function(e){\r\n");
      out.write("\t\t$(\"#overlay\").css('display','none');\r\n");
      out.write("\t\t$(\"#login_box\").css('display','none');\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#login_form\").submit(function() {\r\n");
      out.write("\t        // указываем класс process для div-а сообщений и плавно показываем его\r\n");
      out.write("\t        $(\"#login_result\").removeClass().addClass('process').text('Проверка....').fadeIn(1000);\r\n");
      out.write("\t        // проверяем через AJAX имя пользователя пароль\r\n");
      out.write("\t        $.post($(\"#login_form\").attr('action'), { username:$('#username').val(),password:$('#password').val(),rand:Math.random() } ,function(data) {\r\n");
      out.write("\t\t\t\tif(data==1) {\r\n");
      out.write("\t\t\t\t\t// логин верный\r\n");
      out.write("\t\t\t\t\t$(\"#login_result\").fadeTo(200,0.1,function() {\r\n");
      out.write("\t\t\t\t\t$(this).html('Редирект.....').removeClass().addClass('success').fadeTo(900,1,\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.location='secure.php';\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t// логин неверный\r\n");
      out.write("\t\t\t\t\t$(\"#login_result\").fadeTo(200,0.1,function(){\r\n");
      out.write("\t\t\t\t\t\t$(this).html('Логин неверен ...').removeClass().addClass('error').fadeTo(900,1);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn false;// отмена отправки формы (действие по умолчанию)\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#login_form {\r\n");
      out.write("\tmargin:16px;\r\n");
      out.write("}\r\n");
      out.write("#login_box {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\theight:200px;\r\n");
      out.write("\twidth:400px;\r\n");
      out.write("\tmargin:-100px 0px 0px -200px;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tbackground-color: #f5f5f5;\r\n");
      out.write("\tborder: 1px dotted #000000;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("\tdisplay:none;\r\n");
      out.write("}\r\n");
      out.write("#overlay{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tdisplay:none;\r\n");
      out.write("\tbackground:#000;\r\n");
      out.write("\topacity:.8;\r\n");
      out.write("\tfilter:alpha(opacity=80);\r\n");
      out.write("\tleft:0;\r\n");
      out.write("\ttop:0;\r\n");
      out.write("}\r\n");
      out.write("label {\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\twidth:140px;\r\n");
      out.write("\tpadding:0 6px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\ttext-align:right;\r\n");
      out.write("}\r\n");
      out.write("input {\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("}\r\n");
      out.write("form br {\r\n");
      out.write("\tclear:both;\r\n");
      out.write("}\r\n");
      out.write("#submit {margin-left: 150px;}\r\n");
      out.write("#close_btn {\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\theight:26px;\r\n");
      out.write("\ttext-align:right;\r\n");
      out.write("}\r\n");
      out.write("#login_result {\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tmargin:10px;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\ttext-indent: 5px;\r\n");
      out.write("\theight:22px;\r\n");
      out.write("\tline-height:22px;\r\n");
      out.write("}\r\n");
      out.write(".error {\r\n");
      out.write("\tbackground:#f9caca;\r\n");
      out.write("\tborder: 1px solid #f00;\r\n");
      out.write("}\r\n");
      out.write(".success {\r\n");
      out.write("\tbackground:#caf9ca;\r\n");
      out.write("\tborder: 1px solid #0f0;\r\n");
      out.write("}\r\n");
      out.write(".process {\r\n");
      out.write("\tbackground:#cacaf9;\r\n");
      out.write("\tborder: 1px solid #00f;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("  <!--[if lt IE 9]><script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"overlay\"></div>\r\n");
      out.write("<div id=\"login_box\">\r\n");
      out.write("\t<a href=\"#\" id=\"close_btn\">Закрыть</a>\r\n");
      out.write("\t<div id=\"login_result\"></div>\r\n");
      out.write("\t<form method=\"post\" action=\"login.php\" id=\"login_form\">\r\n");
      out.write("\t\t<label for=\"login\">Логин:</label>\r\n");
      out.write("\t\t<input name=\"login\" type=\"text\" id=\"login\" value=\"\" maxlength=\"20\" /><br/>\r\n");
      out.write("\t\t<label for=\"password\">Пароль:</label>\r\n");
      out.write("\t\t<input name=\"password\" type=\"password\" id=\"password\" value=\"\" maxlength=\"20\" /><br/>\r\n");
      out.write("\t\t<input name=\"Submit\" type=\"submit\" id=\"submit\" value=\"Login\" /><br/>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("   <!-- \r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <section class=\"login\">\r\n");
      out.write("      <h1>Панель адинистратора</h1>\r\n");
      out.write("      <form method=\"GET\" action=\"../AuthorizationServlet\">\r\n");
      out.write("        <p><input type=\"text\" name=\"login\" placeholder=\"Введите логин\"></p>\r\n");
      out.write("        <p><input type=\"password\" name=\"password\" placeholder=\"Введите пароль\"></p>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"/MENU/AuthorizationServlet\",\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                data:{\r\n");
      out.write("                    \"login\": \"login\",\r\n");
      out.write("                    \"password\": \"password\"\r\n");
      out.write("                    },\r\n");
      out.write("                type:\"post\"                   \r\n");
      out.write("            });\r\n");
      out.write("            })\r\n");
      out.write("        </script>\r\n");
      out.write("        <p class=\"remember_me\">\r\n");
      out.write("          <label>\r\n");
      out.write("           <!-- \r\n");
      out.write("           <input type=\"checkbox\" name=\"remember_me\" id=\"remember_me\">\r\n");
      out.write("           -- >\r\n");
      out.write("            Запомнить меня\r\n");
      out.write("          </label>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p class=\"submit\"><input type=\"submit\" value=\"Вход\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"login-help\">\r\n");
      out.write("      <p>Забыли пароль? <a href=\"#\">Восстановить</a>.</p>\r\n");
      out.write("    </section>\r\n");
      out.write("  </div>-->\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
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
