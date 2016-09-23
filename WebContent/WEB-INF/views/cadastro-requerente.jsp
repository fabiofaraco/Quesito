<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<title>Cadastro Requerente</title>
		
		<link href=<c:url value="/resources/css/sb-admin-2.css"/> rel="stylesheet"/>
		<link href=<c:url value="/resources/font-awesome/css/font-awesome.min.css"/> rel="stylesheet"/>
		<link href=<c:url value="/resources/bootstrap/css/bootstrap.min.css"/> rel="stylesheet"/>
		<link href=<c:url value="/resources/css/requerente.css"/> rel="stylesheet"/>
		
		<script src=<c:url value="/resources/jquery/jquery-2.2.2.min.js"/>></script>
		<script src=<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>></script>
		<script src=<c:url value="/resources/js/sb-admin-2.js"/>></script>
		<script src=<c:url value="/resources/js/menuBase.js"/>></script>
		<script src=<c:url value="/resources/jquery/jquery.mask.min.js"/>></script>
		<script src=<c:url value="/resources/js/requerente.js"/>></script>
		
	</head>
	<body>
		<div id="wrapper">
			<form id="frm" name="frm" method="post">
				<c:import url="menuBase.jsp" />
				<div id="page-wrapper">
					<div class="row">
						<div class="form-group col-sm-offset-2 col-sm-7">
					    	<label for="nome">Nome:</label>
						   	<input type="text" class="form-control" id="nome" name="nome" value="${requerente.nome}">
					  	</div>
				  	</div>
				  	
				  	<div class="row">
					  	<div class="form-group col-sm-offset-2 col-sm-3">
					    	<label for="rg">RG:</label>
						   	<input type="text" class="form-control" id="rg" name="rg" value="${requerente.rg}">
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="form-group col-sm-offset-2 col-sm-4">
					    	<label for="cpf">CPF:</label>
						   	<input type="text" class="form-control" id="cpf" name="cpf" value="${requerente.cpf}">
					  	</div>
				  	</div>
					
					<div class="row">
					  	<div class="form-group col-sm-offset-2 col-sm-4">
					    	<label for="dataNascimento">Data de Nascimento</label>
						   	<input type="text" class="form-control" id="dataNascimento" name="dataNascimento" value="${requerente.dataNascimento}">
					  	</div>
				  	</div>
					
					<div class="row">
					  	<div class="form-group col-sm-offset-2 col-sm-5">
					    	<label for="email">Email:</label>
						   	<input type="email" class="form-control" id="email" name="email" value="${usuario.email}">
					  	</div>
				  	</div>
				  	
				  	<div class="row">
				  		<div class="form-group col-sm-offset-2 col-sm-2">
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
