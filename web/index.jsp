
<%@page import="java.util.List"%>
<%@page import="menu.Item"%>
<%@page import="menu.HibernateUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
            <%
         try{
        HibernateUtils.getSessionFactoryInstance();
        
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
            HibernateUtils hbUtils = new HibernateUtils();%>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>Категории</title>

		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<script src="js/modernizr.custom.js"></script>
                <script src="js/jquery.js"></script>
                <script src="js/popup.js"></script>



	</head>
	<body>
		<div class="container">	
                    <div id="dialog-overlay"></div>
                    <div id="dialog-box">
                        <div class="dialog-content">
                            <div id="closepop" style="float:right;" ><span class="bl-icon bl-icon-close"></span></div>
                            <div id="dialog-message"></div>
                            
                        </div>
                    </div>
			<div id="bl-main" class="bl-main">
				<section>
					<div class="bl-box">
						<h2 class="bl-icon bl-icon-about">Закуски</h2>
					</div>
    <div class="bl-content">
         <div id='basic-modal'>
         <%   
            String cat = "Закуски";
            String ololo = "77";
            List<Item> listItems = hbUtils.getItemCategoryList(cat);
            for (Item i : listItems) {
                out.println ("<a class=\"basic\" href=\"javascript:popup('"+ i.toStringItem(i)+"<br><br><a href="+"javascript:addpack("+ololo+")"+">Заказать</a>"+"')\"><div class =\"item\">");
                out.println("<br>" + i.toStringItem(i)+"<br>");
                out.println("<img style=\"border-radius:10px;\" src=\"http://localhost:8080/microsoft-vt/images/1.jpg\" />");
                out.println ("</div></a>");
                 
            }
            
%>     
         </div>

    </div>
					<span class="bl-icon bl-icon-close"></span>
				</section>
				<section id="bl-work-section">
					<div class="bl-box">
						<h2 class="bl-icon bl-icon-works">Выпечка</h2>
					</div>
    <div class="bl-content">

         <%   
            String cat2 = "Выпечка";
            List<Item> listItems2 = hbUtils.getItemCategoryList(cat2);
            for (Item i : listItems2) {
                out.println ("<a class=\"basic\" href=\"javascript:popup('"+ i.toStringItem(i)+"')\"><div class =\"item\">");
                out.println("<br>" + i.toStringItem(i));
              
                out.println ("</div></a>");
                 
            }
            
%>
    </div>
					<span class="bl-icon bl-icon-close"></span>
				</section>
				<section>
					<div class="bl-box">
						<h2 class="bl-icon bl-icon-blog">Первые блюда</h2>
					</div>
    <div class="bl-content">
             <%   
            String cat3 = "Первые блюда";
            List<Item> listItems3 = hbUtils.getItemCategoryList(cat3);
            for (Item i : listItems3) {
                out.println ("<a class=\"basic\" href=\"javascript:popup('"+ i.toStringItem(i)+"')\"><div class =\"item\">");
                out.println("<br>" + i.toStringItem(i));
              
                out.println ("</div></a>");
                 
            }
            
%>
    </div>
					<span class="bl-icon bl-icon-close"></span>
				</section>
				<section>
					<div class="bl-box">
						<h2 class="bl-icon bl-icon-contact">Contact</h2>
					</div>
     <div class="bl-content">
    
     </div>
					<span class="bl-icon bl-icon-close"></span>
				</section>
				<section>
					<div class="bl-box">
						<h2 class="bl-icon bl-icon-contact">EmptyBox</h2>
					</div>
     <div class="bl-content">
    
     </div>
					<span class="bl-icon bl-icon-close"></span>
				</section>
				<section>
					<div class="bl-box">
						<h2 class="bl-icon bl-icon-contact">EmptyBox</h2>
					</div>
     <div class="bl-content">
    
     </div>
					<span class="bl-icon bl-icon-close"></span>
				</section>
		
			</div>
		</div><!-- /container -->
		<script src="js/jquery.min.js"></script>
		<script src="js/boxlayout.js"></script>
		<script>
			$(function() {
				Boxlayout.init();
			});
		</script>
	</body>
</html>
