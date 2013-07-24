<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Редактировать</title>
    </head>
    <body>

         <%
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            
            String itemID = request.getParameter("itemID");
            String itemTitle = request.getParameter("itemTitle");
            String itemDesc = request.getParameter("itemDesc");        
            String itemCost = request.getParameter("itemCost"); 
            String itemCategory = request.getParameter("itemCategory");

       %>
        <form action="UpdateServlet" method = "GET">
            <input value ="<%= itemID %>" type="hidden" name="itemID">
            <h1>Редактировать  </h1>
            <table>
                <tr>
                    <td> Название: </td>
                    <td> <input value ="<%= itemTitle %>" type="text" name="itemTitle">
                </tr>
                <tr>
                    <td> Описание: </td>
                    <td> <input value ="<%= itemDesc %>" type="text" name="itemDesc">
                </tr>
                <tr>
                    <td> Цена: </td>
                    <td>  <input value ="<%= itemCost %>" type="text" name="itemCost">     
                </tr>
                <tr>
                    <td> Категория: </td>
                    <td>  <input value ="<%= itemCategory %>" type="text" name="itemCategory">     
                </tr>
                <tr> 
                    <td colspan="2"> <input type="submit" value="Редактировать">
                </tr>                
            </table>
        </form>
    </body>
</html>