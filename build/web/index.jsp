<%@page import="java.util.List"%>
<%@page import="menu.Item"%>
<%@page import="menu.HibernateUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Меню</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
        %>

        
        <h2>Ваше меню:</h2>
        <%
         try{
        HibernateUtils.getSessionFactoryInstance();
        
      }catch (Throwable ex) { 
         out.println ("Фабрика не создана!");
         throw new ExceptionInInitializerError(ex); 
      }
            HibernateUtils hbUtils = new HibernateUtils();
            %>
 <h2>Ваше меню:</h2>
         <%
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
%>
    </body>
</html>
