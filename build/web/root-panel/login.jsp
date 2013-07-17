<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   <link rel="stylesheet" href="css/style.css">
   <script type="text/javascript" src="js/ajaxFrmSbmt.js"></script>

  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>

<body>
    <!--
  <div class="container">
    <section class="login">
      <h1>Панель адинистратора</h1>
      <form method="GET" action="../AuthorizationServlet">
        <p><input type="text" name="login" placeholder="Введите логин"></p>
        <p><input type="password" name="password" placeholder="Введите пароль"></p>
        <p class="remember_me">
          <label>
           <!-- <input type="checkbox" name="remember_me" id="remember_me"><!--
           - ->
            Запомнить меня
          </label>
        </p>
        <p class="submit"><input type="submit" value="Вход"></p>
      </form>
    </section>

    <section class="login-help">
      <p>Забыли пароль? <a href="#">Восстановить</a>.</p>
    </section>
  </div>
  -->
  <form name="form1" method="post" onsubmit="getxmlHttpRequest('LoginServlet', 'form1', 'message', 'please wait...'); return false;">
      Login <input type="text" name="username"/><br>
      Password <input type="password" name="password"/>
      <input type="submit" value="submit"/>
  </form>
  <div id="message"></div>
  
    </body>
    
</html>