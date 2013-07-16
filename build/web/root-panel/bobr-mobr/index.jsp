<%@page import="menu.Category"%>
<%@page import="java.util.List"%>
<%@page import="menu.Item"%>
<%@page import="menu.HibernateUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <%
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html");

            try {
                HibernateUtils.getSessionFactoryInstance();

            } catch (Throwable ex) {
                System.err.println("Failed to create sessionFactory object." + ex);
                throw new ExceptionInInitializerError(ex);
            }
            HibernateUtils hbUtils = new HibernateUtils();
%>

<html lang="en" class="no-js">
    <head> 
        <title>Панель администратора | Ресторан "Бобо-Мобр"</title>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">           
	<link rel="stylesheet" type="text/css" href="css/default.css" />
	<link rel="stylesheet" type="text/css" href="css/component.css" />
	<script src="js/modernizr.custom.js"></script>
        
<script type='text/javascript'>
function start(){
   var x=document.getElementById('itemTitle').value;
   var y=document.getElementById('itemDesc').value;
   var z=document.getElementById('itemCost').value;  
   var z2=document.getElementById('itemCategory').value;  
  
   xhttp=new XMLHttpRequest();
   xhttp.onreadystatechange=function(){
      if (xhttp.readyState==4 && xhttp.status==200)
         document.getElementById('q').innerHTML=xhttp.responseText;
   }
   xhttp.open('GET','../AddItemServlet?itemTitle='+x+'&itemDesc='
       +y+'&itemCost='+z+'&itemCategory='+z2,true);
   xhttp.send();
}
</script>
    </head>

    <body>
  
        <div class="md-modal md-effect-7" id="q">
            <div class="md-content">
                <h3>Добавить блюдо</h3>
                <div>

                        <table>
                            <tr>
                                <td> Название: </td>
                                <td> <input type="text" name="itemTitle" id='itemTitle'>
                            </tr>
                            <tr>
                                <td> Описание: </td>
                                <td> <input type="text" name="itemDesc" id='itemDesc'>
                            </tr>
                            <tr>
                                <td> Цена: </td>
                                <td>  <input type="text" name="itemCost" id='itemCost'>     
                            </tr>
                            <tr> 
                                <td> Категория: </td>
                                <td>  
                                    <select name="itemCategory"  id='itemCategory'/>
                                    <%
                                        List<Category> listCat = hbUtils.getCategoryList();
                                        for (Category i : listCat) {
                                            out.println("<option value=\"" + i.getCategoryName() + "\">"
                                                    + i.getCategoryName() + "</option>");
                                        }
                                    %>
                                    </select>
                            </tr>
                            <tr> 
                                <td colspan="2"> <input type='button' value='Добавить' onclick='start()'/>
                            </tr>                
                        </table>
<br /><br />

                    <button class="md-close">Close me!</button>
                </div>
            </div>
        </div>
                    
<div class="md-modal md-effect-7" id="modal-77">
            <div class="md-content">
                <h3>Добавить блюдо</h3>

        </div>        
</div>
                    
                    
                    
        <div class="container">		
            <div class="main clearfix">
                <button class="md-trigger" data-modal="q">Добавить блюда</button>
                <button class="md-trigger" data-modal="modal-7">Добавить категорию</button>
                <button class="md-trigger" data-modal="modal-7">Сменить пароль</button>
            </div>
        </div>
                            
                            
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
                 for (Item i2 : listItems) {
                out.println (" <div id=\"container_buttons\">");
                out.println("<br>" + i2.toStringItem(i2));
                
                /*out.println("<br><a href=\"http://localhost:8080/MENU/DemoAddPack?"
                        + "&itemTitle=" + i.getItemTitle()
                        + "&itemDesc=" + i.getItemDesc()
                        + "&itemCost=" + i.getItemCost()
                        + "&itemCost=" + i.getItemCategory()
                        + "\">Добавить в корзину</a> (Эта кнопка в меню для посетителей)<br> ");*/

                out.println("<br><a href=\"http://localhost:8080/MENU/DemoUpdate.jsp?"
                        + "itemID=" + i2.getItemID()
                        + "&itemTitle=" + i2.getItemTitle()
                        + "&itemDesc=" + i2.getItemDesc()
                        + "&itemCost=" + i2.getItemCost()
                        + "&itemCategory=" + i2.getItemCategory()
                        + "\">Редактировать</a> |  ");
                
                out.println("<a href=\"http://localhost:8080/MENU/DemoDelete?"
                        + "itemID=" + i2.getItemID()
                        + "\">Удалить</a><br>");
                out.println (" </div>");
            }
                 }
 %>
		<div class="md-overlay"></div><!-- the overlay element -->
		<script src="js/classie.js"></script>
		<script src="js/modalEffects.js"></script>
		<script>
			// this is important for IEs
			var polyfilter_scriptpath = '/js/';
		</script>
		<script src="js/cssParser.js"></script>
		<script src="js/css-filters-polyfill.js"></script>
    </body>
</html>
