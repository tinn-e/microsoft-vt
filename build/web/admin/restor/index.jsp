<%-- 
    Document   : index
    Created on : 10.07.2013, 10:43:35
    Author     : User
--%>

<%@page import="java.util.List"%>
<%@page import="menu.Item"%>
<%@page import="menu.HibernateUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ресторан "Бобр-Мобр!"</h1><br>
        <p>Microsoft-vt©</p>
        <form action="RestorServlet" method = "GET">
        <h2>Добавить блюдо:</h2>
        <p>Название<br>
        <input type="text" name="itemTitle" value=""><br>
        Описание<br>
        <input type="text" name="itemDesc" value=""><br>
        Цена<br>
        <input type="text" name="itemCost" value=""><br>
        Категория<br>
        <input type="text" name="itemCategory" value=""><br>
        <input type="submit" value="Добавить!">   
        </p>
        </form>
        <h2>Список меню:</h2>
        <%
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
        %>
    </body>
</html>
