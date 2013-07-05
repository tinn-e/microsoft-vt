<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC  "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
        <%
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html");        
        %>    
<title>Меню</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="style.css" type="text/css">
<script language='JavaScript' src="script.js"></script>
</head>
<body> 

<div id="header">
</div>  
<div id="main"> 
   <div id="scroll">

<form action="MenuServlet" method = "GET">
     <h1>Добавление блюда </h1>
<table>
            <tr>
               <td> Введите название блюда: </td>
               <td> <input type="text" name="prodTitle">
            </tr>
            <tr>
               <td> Введите описание: </td>
               <td> <input type="text" name="prodDesc">
            </tr>
            <tr>      
                <td> Введите цену: </td>
               <td> <input type="text" name="prodCost">
            </tr>
            <tr>
               <td colspan="2"> <input type="submit" value="Добавить">
            </tr>                
</table>
</form>
</div>
</ul>
</div>
</span>


</div>
</div>
<div id="footer">

</div> 
</body>
</html>
