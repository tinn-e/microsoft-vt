
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавление | Удаление | Получение списка</title>
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
                    <td> <input type="text" name="prodTitle">
                </tr>
                <tr>
                    <td> Описание: </td>
                    <td> <input type="text" name="prodDesc">
                </tr>
                <tr>
                    <td> Цена: </td>
                    <td>  <input type="text" name="prodCost">     
                </tr>
                <tr> 
                    <td colspan="2"> <input type="submit" value="Добавить">
                </tr>                
            </table>
        </form>

        <form action="DemoDelete" method = "GET">
            <h1>Удаление</h1>
            <table>
                <tr>
                    <td>Номер товара: </td>
                    <td> <input type="text" name="ID">   
                </tr>
                <tr> 
                    <td colspan="2"> <input type="submit" value="Удалить">
                </tr>                
            </table>
        </form>

        <form action="DemoList" method = "GET">
            <h1>Вывод списка</h1>
            <table>
                <td colspan="2"> <input type="submit" value="Вывести список">             
            </table>
        </form>
    </body>
</html>
