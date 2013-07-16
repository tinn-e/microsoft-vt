<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="cart" class="menu.CartBean" scope="session" />
<%@page import="menu.Item"%>
<html>
  <head><title>Корзина</title></head>
  <body>

      <c:forEach items="${cart.cartShop}" var="item">
          <span>${item}</span> <br />
      </c:forEach>

          

  </body>
</html>