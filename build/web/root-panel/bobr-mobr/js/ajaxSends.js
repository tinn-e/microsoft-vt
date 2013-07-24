function AddItemSend(){
var itemTitle = $('#itemTitle').val()
var itemDesc = $('#itemDesc').val()
var itemCost = $('#itemCost').val()
var itemCategory = $('#itemCategory').val()
       $.ajax({
                type: "GET",
                url: "../../AddItemServlet",
                data: "itemTitle="+itemTitle+"&itemDesc="+itemDesc+"&itemCost="+itemCost+"&itemCategory="+itemCategory,
                success: function(html) {
                        $("#result").empty();
                        $("#result").append("Успешно добавлено!");
                        setTimeout('location.replace("index.html")',2200); 
                }
        });
}

function AddCategorySend(){
var catName = $('#catName').val()
       $.ajax({
                type: "GET",
                url: "../../AddCategory",
                data: "catName="+catName,
                success: function(html) {
                        $("#result_cat").empty();
                        $("#result_cat").append("Успешно добавлено!");
                        setTimeout('location.replace("index.html")',2200); 
                }
        });
}