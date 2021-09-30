$(document).ready(function(){

    let table = $('#tablaPersona').DataTable({
        "ajax": {
            "url": "http://localhost:8080/api/usuarios",
            "type": "GET",
            "dataSrc": "",
        },
        "pagingType": "full_numbers",
        "columns": [
            {"data": "id"},
            {"data": "nombre"},
            {"data": "apellido"},
            {"data": "nick"},
            {"data": "sexo"},
            {"data": "email"},
            {"data": "edad"},
            {"data": "banco"},
            {"data": "pelis"},
 {"defaultContent": "<button type='submit' class='btn-transparent'><i class='fas fa-edit'></i></button>"}
 ,{"defaultContent": "<button type='submit' class='btn-transparent'><i class='fas fa-edit'></i></button>"}
     ]
    });


    $('#tablaPersona tbody').on( 'click','button', function () {
        let data = table.row($(this).parents('tr')).data();
        let n = Number(data.id)
       alert(n);

    } );

    $("#peopleAll").click(function (){
   let data = table.row($(this).parents('tr')).data();
        let n = Number(data.id)
       alert(n);    })

});