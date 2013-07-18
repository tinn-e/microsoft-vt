<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Панель администратора</title>
        <link rel="stylesheet" href="css/style.css">
        <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js' type='text/javascript'></script>
        <script type="text/javascript" src="ajax.js"></script>
        <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
    </head>

    <body>
        <div class="container">
            <section class="login">
                <h1>Панель адинистратора</h1>
                <form action="" id="myform">
                    <p><input type="text" name="login" id="login" placeholder="Input LOGIN"/></p>
                    <p><input type="password" name="password" id="password" placeholder="Input PASSWORD"/></p>

                    <div id="result"></div>
                    <!--
                   <p class="remember_me">
                     <label>
                      <input type="checkbox" name="remember_me" id="remember_me"><!--
                       Запомнить меня
                     </label>
                   </p>           -->

                    <p class="button"><input type="button" onclick="send();" value="Войти" /></p>
                </form>
            </section>

            <section class="login-help">
                <p>Забыли пароль? <a href="#">Восстановить</a>.</p>
            </section>
        </div>

    </body>
</html>