
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
                            <div style="float:right;" ><span class="bl-icon bl-icon-close"></span></div>
                            <div id="dialog-message"></div>
                            
                        </div>
                    </div>
			<div id="bl-main" class="bl-main">
                            <section>
                                <div class="bl-box">
                                   <h2 class="bl-icon bl-icon-about">ЗАКУСКИ</h2> 
                                    
                                </div>
                                <div class="bl-content">
<%
    String cat = "Закуски";
    List<Item> listItems = hbUtils.getItemCategoryList(cat);
    for (Item i : listItems) {
        out.println("<a class=\"basic\" href=\"javascript:popup('" + i.toStringItem(i) + "')\"><div class =\"item\">");
        out.println("<br>" + i.toStringItem(i));
        out.println("</div></a>");
    }
%>     
                                </div>
                                <span class="bl-icon bl-icon-close"></span>
                            </section>
                            <section id="bl-work-section">
                                <div class="bl-box">
                                   
                                   <h2 class="bl-icon bl-icon-about">ДЕСЕРТЫ</h2> 
                                </div>
                                <div class="bl-content">
<%
    String cat2 = "Десерты";
    List<Item> listItems2 = hbUtils.getItemCategoryList(cat2);
    for (Item i : listItems2) {
        out.println("<a class=\"basic\" href=\"javascript:popup('" + i.toStringItem(i) + "')\"><div class =\"item\">");
        out.println("<br>" + i.toStringItem(i));
        out.println("</div></a>");
    }
%>
                                </div>
                                <span class="bl-icon bl-icon-close"></span>
                            </section>
                            <section>
                                <div class="bl-box">
                                   
                                    <h2 class="bl-icon bl-icon-about">ПЕРВЫЕ БЛЮДА</h2>
                                </div>
                                <div class="bl-content">
<%
    String cat3 = "Первые блюда";
    List<Item> listItems3 = hbUtils.getItemCategoryList(cat3);
    for (Item i : listItems3) {
        out.println("<a class=\"basic\" href=\"javascript:popup('" + i.toStringItem(i) + "')\"><div class =\"item\">");
        out.println("<br>" + i.toStringItem(i));
        out.println("</div></a>");
    }
%>
                                </div>
                                <span class="bl-icon bl-icon-close"></span>
                            </section>
                            <section>
                                <div class="bl-box">
                                    
                                    <h2 class="bl-icon bl-icon-about">ВТОРЫЕ БЛЮДА</h2>
                                </div>
                                <div class="bl-content">
<%
    String cat4 = "Вторые блюда";
    List<Item> listItems4 = hbUtils.getItemCategoryList(cat4);
    for (Item i : listItems4) {
        out.println("<a class=\"basic\" href=\"javascript:popup('" + i.toStringItem(i) + "')\"><div class =\"item\">");
        out.println("<br>" + i.toStringItem(i));
        out.println("</div></a>");
    }
%>
                                </div>
                                <span class="bl-icon bl-icon-close"></span>
                            </section>
                            <section>
                                <div class="bl-box">
                                   
                                    <h2 class="bl-icon bl-icon-about">НАПИТКИ</h2>
                                </div>
                                <div class="bl-content">
<%
    String cat5 = "Напитки";
    List<Item> listItems5 = hbUtils.getItemCategoryList(cat5);
    for (Item i : listItems5) {
        out.println("<a class=\"basic\" href=\"javascript:popup('" + i.toStringItem(i) + "')\"><div class =\"item\">");
        out.println("<br>" + i.toStringItem(i));
        out.println("</div></a>");
    }
%>
                                </div>
                                <span class="bl-icon bl-icon-close"></span>
                            </section>
                            <section>
                                <div class="bl-box">
                                    
                                    <h2 class="bl-icon bl-icon-about">ВЫПЕЧКА</h2>
                                </div>
                                <div class="bl-content">
<%
    String cat6 = "Выпечка";
    List<Item> listItems6 = hbUtils.getItemCategoryList(cat6);
    for (Item i : listItems6) {
        out.println("<a class=\"basic\" href=\"javascript:popup('" + i.toStringItem(i) + "')\"><div class =\"item\">");
        out.println("<br>" + i.toStringItem(i));
        out.println("</div></a>");
    }
%>
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
