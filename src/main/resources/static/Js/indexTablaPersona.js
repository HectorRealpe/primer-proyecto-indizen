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
            {"data": "pelis"}

//{"defaultContent": "<button type='button' class='btn-transparent'><i class='fas fa-edit'></i></button>"},
//{"defaultContent": "<button type='button' class='btn-transparent'><i class='fas fa-edit'></i></button>"}
              ]
    });


  /*  $('#movieTable tbody').on( 'click','button', function () {
        let data = table.row($(this).parents('tr')).data();
        let n = Number(data.id)
        window.location.replace("http://localhost:8080/movies/m?sent="+n)

    } );

    $("#peopleAll").click(function (){
        window.open("http://localhost:8080/people")
    })*/

});