$(document).ready(function () {

        // if user clicked on button, the overlay layer or the dialogbox, close the dialog	
        $('a.btn-ok, #dialog-overlay, #closepop').click(function () {		
                $('#dialog-overlay, #dialog-box').hide();		
                return false;
        });
	
        // if user resize the window, call the same function again
        // to make sure the overlay fills the screen and dialogbox aligned to center	
        $(window).resize(function () {
		
                //only do it if the dialog box is not hidden
                if (!$('#dialog-box').is(':hidden')) popup();		
        });	
	
	
});

function popup(title,cost) {
		
        // get the screen height and width  
        var maskHeight = $(document).height();
                        var maskWidth = $(window).width();

                        // calculate the values for center alignment
                        var dialogTop = (maskHeight / 3) - ($('#dialog-box').height());
                        var dialogLeft = (maskWidth / 2) - ($('#dialog-box').width() / 2);

                        // assign values to the overlay and dialog box
                        $('#dialog-overlay').css({height: maskHeight, width: maskWidth}).show();
                        $('#dialog-box').css({top: dialogTop, left: dialogLeft}).show();

                        // display the message
                        $('#dialog-message').html('Название: '+title + '<br>Цена: '+cost+'<br><a href=javascript:addpack(\''+cost+'\')>Добавить</a>');

                    }

function addpack(s) {
$.ajax({
  url: 'http://localhost:8080/microsoft-vt/AddPack?itemTitle=' + (s) +'ggggg&itemDesc=234&itemCost=234&itemCategory=4643',
  success: function(){
    alert('Добавлено!');
  }
});
}

function seepack() {
$.ajax({
  url: 'http://localhost:8080/microsoft-vt/cart.jsp',
  success: function(tt){
    document.getElementById(see).innerHTML = (tt);
  }
});
}

function openitem(cat,id) {
$.ajax({
  url: "http://localhost:8080/microsoft-vt/MainServlet?cat="+cat,

  success: function(date){
      var art = date;
var cart = JSON.parse ( art );


for (var i in cart.items) {
    document.getElementById(id).innerHTML += '<a href="javascript:popup(\''+cart.items[i].cost+'\',\''+cart.items[i].title+'\')"><div class ="item">Название: '+cart.items[i].title+'<br>Цена: '+cart.items[i].cost+'<br>Описание:'+cart.items[i].desc+'<br><img src="http://localhost:8080/microsoft-vt/images/'+cart.items[i].image+'"/></div></a>';

}
    
  }
});
}



