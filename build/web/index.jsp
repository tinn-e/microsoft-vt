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
        <form action="DemoAdd" method = "GET">
            <h1>Добавить </h1>
            <table>
                <tr>
                    <td> Название: </td>
                    <td> <input type="text" name="itemTitle">
                </tr>
                <tr>
                    <td> Описание: </td>
                    <td> <input type="text" name="itemDesc">
                </tr>
                <tr>
                    <td> Цена: </td>
                    <td>  <input type="text" name="itemCost">     
                </tr>
                <tr> 
                    <td> Категория: </td>
                    <td>  <input type="text" name="itemCategoty">     
                </tr>
                <tr> 
                    <td colspan="2"> <input type="submit" value="Добавить">
                </tr>                
            </table>
        </form>
        <a href="http://localhost:8080/HB_2.0/DemoListPack">Посмотреть корзину</a> 
        
        <h2>Ваше меню:</h2>
        <%
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
                out.println("<br><a href=\"http://localhost:8080/HB_2.0/DemoAddPack?"
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
