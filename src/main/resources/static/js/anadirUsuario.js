$(document).ready(function() {

	let input = $('#inputPersona').DataTable({
		"ajax": {
			"url": "http://localhost:8080/api/usuarios",
			"type": "POST",
			"dataSrc": "",
		}
		});
		
		function enviarFormulario(){
			var objeto = {
			nombre: $( "#inputNombre" ).text(),
			apellido: $( "#inputApellidos" ).text(),
			nick: $( "#inputNick" ).text(),
			sexo: $( "#inputSexo" ).text(),
			email: $( "#inputEmail" ).text(),
			edad: $( "#inputEdad" ).text(),
			banco: $( "#inputBanco" ).text(),
					
		};
	}
});