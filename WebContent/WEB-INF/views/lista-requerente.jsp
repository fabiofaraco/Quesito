<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<title>Lista Requerente</title>
		<link href=<c:url value="/resources/bootstrap/css/bootstrap.min.css"/> rel="stylesheet"/>
		<link href=<c:url value="/resources/css/requerente.css"/> rel="stylesheet"/>
		<script src=<c:url value="/resources/jquery/jquery-2.2.2.min.js"/>></script>
		<script src=<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>></script>
		<script src=<c:url value="/resources/datatable/datatables.min.js"/>></script>
		<script src=<c:url value="/resources/js/requerente.js"/>></script>
	</head>
	<body>
		<div class="container-fluid">
			<form id="frm" name="frm" method="post">
				<div class="page-header">
				  <h1>Lista de Requerentes</h1>
				</div>
				 <div class="row">
			  		<div class="form-group col-sm-12">
			  			<button id="btnIncluir" name="btnIncluir" type="button" class="btn btn-success btn-lg btn-block">Incluir</button>
			  		</div>
			  	</div>
			  	 
				<div class="table-responsive">          
					 <table id="tabelaRequerente" class="table table-striped table-hover">
						 <thead>
							 <tr>
								 <th>Nome</th>
								 <th>RG</th>
								 <th>CPF</th>
								 <th>Email</th>
								 <th></th>
								 <th></th>
							 </tr>
						 </thead>
						 <tbody>
						 	<c:forEach items="${requerentes}" var="requerente">
						 		<tr>
						 			<td>${requerente.nome}</td>
						 			<td>${requerente.rg}</td>
						 			<td>${requerente.cpf}</td>
						 			<td>${requerente.email}</td>
						 			<td class="botoesTabela">
						 				<a href="carregarRequerente?id=${requerente.id}" class="btn btn-success">
									    	<span class="glyphicon glyphicon-edit"></span>
				     					</a>
						 			</td>
						 			<td class="botoesTabela">
						 				<a href="removerRequerente?id=${requerente.id}" class="btn btn-danger">
									    	<span class="glyphicon glyphicon-trash"></span>
				     					</a>
						 			</td>
						 		</tr>
						 	</c:forEach>
						 </tbody>
					 </table>
				 </div>
				 <c:import url="mensagem.jsp" />
				<input type="hidden" id="msg" name="msg" value="${msg}">		  	
			</form>
		</div>
	</body>
</html>
