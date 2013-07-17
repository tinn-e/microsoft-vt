<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   <link rel="stylesheet" href="css/style.css">

  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>

<body>
  <div class="container">
    <section class="login">
      <h1>Панель адинистратора</h1>
      <form method="GET" action="../AuthorizationServlet">
        <p><input type="text" name="login" placeholder="Введите логин"></p>
        <p><input type="password" name="password" placeholder="Введите пароль"></p>
        <p class="remember_me">
          <label>
           <!-- <input type="checkbox" name="remember_me" id="remember_me"><!--
           -->
            Запомнить меня
          </label>
        </p>
        <p class="submit"><input type="submit" onclick="send();" value="Вход"></p>
        <div id="result"></div>
      </form>
    </section>

    <section class="login-help">
      <p>Забыли пароль? <a href="#">Восстановить</a>.</p>
    </section>
  </div>
    </body>
    
</html>