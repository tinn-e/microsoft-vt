function send()
{
//�������� ���������
var login = $('#mylogin').val()
var password = $("#mypas").val()
  // �������� �������
       $.ajax({
                type: "GET",
                url: "http://localhost:8084/AjavExamp/ajaxserv",
                data: "login="+login+"&password"+password,
                // ������� �� ��� ������ PHP
                success: function(html) {
 //�������������� ������� ������ ������� ��������
                        $("#result").empty();
//� ������� ����� php �������
                        $("#result").append(html);
                }
        });

}