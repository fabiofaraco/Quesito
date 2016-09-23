$(document).ready(function() {
	 
	 $('#dataNascimento').mask("99/99/9999 99:99")
	
	/* EVENTOS */
	
	$('#btnIncluir').on("click", function(){
	   $('#frm').attr('action', 'cadastrarRequerente');
	   $('#frm').submit();
	});
	
	
	/* FUNÇÕES */

	
	
});