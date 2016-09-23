$(document).ready(function() {
	
	if($('#msg').val() != '') {
		$('#msgModal').html($('#msg').val());
        $('#myModal').modal('show');
	}
	
	$('#btnIncluir').on("click", function(){
	   $('#frm').attr('action', 'cadastroUsuario');
	   $('#frm').submit();
	   
	});
});