$(document).ready(function() {

	let table = $('#tablaPersona').DataTable({
		"ajax": {
			"url": "http://localhost:8080/api/usuarios",
			"type": "GET",
			"dataSrc": "",
		},
		"pagingType": "full_numbers",
		"columns": [
			{ "data": "id" },
			{ "data": "nombre" },
			{ "data": "apellido" },
			{ "data": "nick" },
			{ "data": "sexo" },
			{ "data": "email" },
			{ "data": "edad" },
			{ "data": "banco" },
			{ "data": "pelis" },
			{ "defaultContent": "<button type='submit' id='borrar' class='btn-transparent'><i class='fas fa-edit'></i></button>" },
			{ "defaultContent": "<button type='submit' class='btn-transparent'><i class='fas fa-edit'></i></button>" }
		]
	});


	$('#tablaPersona tbody').on('click', 'button', function() {
		let data = table.row($(this).parents('tr')).data();
		let n = Number(data.id)

		var objeto = {
			id: data.id,
			nombre: data.nombre,
			apellido: data.apellido,
			nick: data.nick,
			sexo: data.sexo,
			email: data.email,
			edad: data.edad,
			banco: data.banco,
			pelis: data.pelis
		};
		if (this.id == "borrar") {
			var json = JSON.stringify(objeto);
			$.ajax(
				{
					url: "http://localhost:8080/api/borrar",
					type: "POST",
					success: function() {
						location.reload();
					},
					data: json,
					contentType: "application/json"
				});


		} else {
	
       
   
            $("#myModal").modal('show');
    
  
		}
	});
});





