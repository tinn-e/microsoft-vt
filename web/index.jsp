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

    </body>
</html>
