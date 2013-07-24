function send(){
var login = $('#login').val()
var password = $('#password').val()
       $.ajax({
                type: "GET",
                url: "../AuthServlet",
                data: "login="+login+"&password="+password,
                success: function(html) {
                        $("#result").empty();
                        $("#result").append(html);
                }
        });
}