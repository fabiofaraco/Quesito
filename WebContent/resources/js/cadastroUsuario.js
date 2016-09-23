$(document).ready(function() {
	
	/* Eventos */
	
	$('#btnSalvar').click(function(){
		if(validarCampos()) {
		   $('#frm').attr('action', 'salvarUsuario');
		   $('#frm').submit();
		}
	});
		
	$("#rg, #cpf, #idFuncional").keypress(function (e) {
	     if(e.which != 8 
	    		 && e.which != 0 
	    		 && (e.which < 48 || e.which > 57)) {
	    	 return false;
	    }
   });
	

	$("#cpf").focusout(function(){
		if($("#cpf").val() != "") {
			if(validaCPF($('#cpf').val())) {
				$.post("validaCpf", {'cpf' : $("#cpf").val()}, function(data) {
					if(data != "") {
						$('#msgModal').html(data);
				        $('#mensagemModal').modal('show');
					}
				});
			} else {
				$('#msgModal').html('CPF Inválido');
		        $('#mensagemModal').modal('show');
			}
		}
    });
	
	$("#rg").focusout(function(){
		if($("#rg").val() != "") {
			$.post("validaRg", {'rg' : $("#rg").val()}, function(data) {
				if(data != "") {
					$('#msgModal').html(data);
			        $('#mensagemModal').modal('show');
				}
			});
		}
    });
	
	$("#idFuncional").focusout(function(){
		if($("#idFuncional").val() != "") {
			$.post("validaIdFuncional", {'idFuncional' : $("#idFuncional").val()}, function(data) {
				if(data != "") {
					$('#msgModal').html(data);
			        $('#mensagemModal').modal('show');
				}
			});
		}
    });
	
	/* Funções JavaScript */
	
	function validarCampos() {
		if($('#nome').val() == '') {
			$('#msgModal').html('Campo Obrigatório: Nome');
	        $('#mensagemModal').modal('show');
	        $('#btnOk').focus();
	        return false;
		}
		
		if($('#rg').val() == '') {
			$('#msgModal').html('Campo Obrigatório: RG');
	        $('#mensagemModal').modal('show');
			return false;
		}
		
		if($('#cpf').val() == '') {
			$('#msgModal').html('Campo Obrigatório: CPF');
	        $('#mensagemModal').modal('show');
			return false;
		}
		
		if(!validaCPF($('#cpf').val())) {
			$('#msgModal').html('CPF Inválido');
	        $('#mensagemModal').modal('show');
			return false;
		}
		
		if($('#idFuncional').val() == '') {
			$('#msgModal').html('Campo Obrigatório: ID Funcional');
	        $('#mensagemModal').modal('show');
			return false;
		}
		
		if($('#perfil').val() == '') {
			$('#msgModal').html('Campo Obrigatório: Perfil');
	        $('#mensagemModal').modal('show');
			return false;
		}
		
		if($('#email').val() == '') {
			$('#msgModal').html('Campo Obrigatório: Email');
	        $('#mensagemModal').modal('show');
			return false;
		}
		
		if($('#senha').val() == '') {
			$('#msgModal').html('Campo Obrigatório: Senha');
	        $('#mensagemModal').modal('show');
			return false;
		}
		
		if($('#confirmaSenha').val() == '') {
			$('#msgModal').html('Campo Obrigatório: Confirmar Senha');
	        $('#mensagemModal').modal('show');
			return false;
		}
		
		if($('#confirmaSenha').val() != $('#senha').val()) {
			$('#msgModal').html('Senha digitada não confere');
	        $('#mensagemModal').modal('show');
			return false;
		}
		
		return true;
	}
	
	function validaCPF(cpf)	{
		cpf = cpf.replace('.','');
		cpf = cpf.replace('.','');
		cpf = cpf.replace('-','');
		
		erro = new String;
		if(cpf.length < 11) { 
			return false;
		}
		
		var nonNumbers = /\D/;
		if (nonNumbers.test(cpf)) {
			return false;	
		}
		
		if(cpf == "00000000000" 
				|| cpf == "11111111111" 
				|| cpf == "22222222222" 
				|| cpf == "33333333333" 
				|| cpf == "44444444444" 
				|| cpf == "55555555555" 
				|| cpf == "66666666666" 
				|| cpf == "77777777777" 
				|| cpf == "88888888888" 
				|| cpf == "99999999999") {
			return false;
		}
		
		var a = [];
		var b = new Number;
		var c = 11;
		for(i=0; i<11; i++) {
			a[i] = cpf.charAt(i);
			
			if (i <  9) {
				b += (a[i] *  --c);
			}
		}
		
		if ((x = b % 11) < 2) { 
			a[9] = 0 
		} else { 
			a[9] = 11-x 
		}
		
		b = 0;
		c = 11;
		for(y=0; y<10; y++) {
			b += (a[y] *  c--); 
		}
		
		if((x = b % 11) < 2) { 
			a[10] = 0; 
		} else { 
			a[10] = 11-x; 
		}
		
		status = a[9] + ""+ a[10]
		if((cpf.charAt(9) != a[9]) 
				|| (cpf.charAt(10) != a[10])){
			return false;	
		}
		
		return true;
	}
});
