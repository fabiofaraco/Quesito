<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<title>Cadastro Usuário</title>
		<link href=<c:url value="/resources/bootstrap/css/bootstrap.min.css"/> rel="stylesheet"/>
		<link href=<c:url value="/resources/css/cadastroUsuario.css"/> rel="stylesheet"/>
		<link href=<c:url value="/resources/css/sb-admin-2.css"/> rel="stylesheet"/>
		<link href=<c:url value="/resources/font-awesome/css/font-awesome.min.css"/> rel="stylesheet"/>
		<script src=<c:url value="/resources/jquery/jquery-2.2.2.min.js"/>></script>
		<script src=<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>></script>
		<script src=<c:url value="/resources/js/sb-admin-2.js"/>></script>
		<script src=<c:url value="/resources/js/menuBase.js"/>></script>
		<script src=<c:url value="/resources/js/cadastroUsuario.js"/>></script>
	</head>
	<body>
		<div id="wrapper">
			<form id="frm" name="frm" method="post">
			<c:import url="menuBase.jsp" />
			<div id="page-wrapper">
					<div class="row">
						<div class="form-group col-md-12">
							<h3><label>Cadastro de Usuários</label></h3>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-sm-9 col-md-7">
					    	<label for="nome">Nome:</label>
						   	<input type="text" class="form-control" id="nome" name="nome" value="${usuario.nome}">
					  	</div>
				  	</div>
				  	
				  	<div class="row">
					  	<div class="form-group col-sm-5 col-md-3">
					    	<label for="rg">RG:</label>
						   	<input type="text" class="form-control" id="rg" name="rg" value="${usuario.rg}">
					  	</div>
					  	
					  	<div class="form-group col-sm-6 col-md-4">
					    	<label for="cpf">CPF:</label>
						   	<input type="text" class="form-control" id="cpf" name="cpf" value="${usuario.cpf}">
					  	</div>
					</div>
					
				  	<div class="row">
					  	<div class="form-group col-sm-5 col-md-3">
					    	<label for="idFuncional">ID Funcional:</label>
						   	<input type="text" class="form-control" id="idFuncional" name="idFuncional" value="${usuario.idFuncional}">
					  	</div>
				  	</div>
				  	
				  	<div class="row">
				  		<div class="form-group col-sm-7 col-md-5">
						 	<label for="perfil">Perfil:</label>
						  	<select class="form-control" id="perfil" name="perfil">
						  		<option value=""><c:out value="Selecione..." /></option>
						    	<c:forEach items="${perfis}" var="p">
							    	<option value="${p.id}"><c:out value="${p.descricao}" /></option>
							 	</c:forEach>
						  	</select>
						</div>
				  	</div>
				  	
				  	<div class="row">
					  	<div class="form-group col-sm-7 col-md-5">
					    	<label for="email">Email:</label>
						   	<input type="email" class="form-control" id="email" name="email" value="${usuario.email}">
					  	</div>
				  	</div>
				  	
				  	<div class="row">
					  	<div class="form-group col-sm-5 col-md-3">
					    	<label for="Senha">Senha:</label>
						   	<input type="password" class="form-control" id="senha" name="senha" value="${usuario.senha}">
					  	</div>
					  	
					  	<div class="form-group col-sm-5 col-md-3">
					    	<label for="confirmaSenha">Confirmar Senha:</label>
						   	<input type="password" class="form-control" id="confirmaSenha" name="confirmaSenha">
					  	</div>
					</div>
				  	
				  	<div class="row">
				  		<div class="form-group col-md-2">
				  			<button id="btnSalvar" name="btnSalvar" type="button" class="btn btn-success btn-lg btn-block">Salvar</button>
				  		</div>
				  	</div>
				  	
				  	<input type="hidden" id="id" name="id" value="${usuario.id}">
				  	
				  	<c:import url="mensagem.jsp" />
				
			</div>
			</form>
		</div>
	</body>
</html>
