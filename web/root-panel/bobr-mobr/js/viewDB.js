function DataBaseUtil(){
    //генерация селекторов для каждой категории

    $.getJSON('../../printCats', function(data){
        $.each(data, function(key, val){
            $('<div id=0'+key+'><h3>'+val+'</h3></div>').appendTo("#cat_list")
        });
    });
    // вывод списка с категориями        
    var cats = [];
    $.getJSON('../../printCats', function(data){
        var category = [];
        $.each(data, function(key, val){
            cats.push(val);
            category.push('<option value ="'+val+'" id="'+key+'">'+val+'</option>');
                                     
        });
        $('<select/>', {
            'name': 'itemCategory',
            'id': 'itemCategory',
            html: category.join('')
        }).appendTo('#categories');
    });
    // вывод блюд в селекторы категорий                        
    $(document).ready(function(){
        $.getJSON('../../PrintItems', function(data){
            var i_id=1;
            $.each(data, function(key, val){
                i_id = cats.indexOf(val.itemCategory);
                i_id = i_id+1;
                $('<div id="container_buttons"><div id="item">\n\
                        <b>Название: </b>'+val.itemTitle+'<br>\n\
                        <b>Описание: </b>'+val.itemDesc +'<br>\n\
                        <b>Цена: </b>'+ val.itemCost+'<br>\n\
                        <b>Категория: </b>'+val.itemCategory+'<br> </div></div>').appendTo('#0'+i_id); 
        
            /* проверка на существование селектора
                 if($('#0'+i_id).length>0){
                   alert('id - #0'+i_id+' - '+val.itemTitle);
                 }else{
                   alert('id - #0'+i_id+" - FAIL");
                }
            */
            })
        }); 
    });       
}
