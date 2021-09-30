$(document).ready(function() {

	let table = $('#tablauser').DataTable({
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
			{ "data": "pelis" }
			]
	});


	
		

	});






