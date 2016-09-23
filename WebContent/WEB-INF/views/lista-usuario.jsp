<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<title>Lista Usuário</title>
		<link href=<c:url value="/resources/bootstrap/css/bootstrap.min.css"/> rel="stylesheet"/>
		<link href=<c:url value="/resources/css/listaUsuario.css"/> rel="stylesheet"/>
		<script src=<c:url value="/resources/jquery/jquery-2.2.2.min.js"/>></script>
		<script src=<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>></script>
		<script src=<c:url value="/resources/datatable/datatables.min.js"/>></script>
		<script src=<c:url value="/resources/js/listaUsuario.js"/>></script>
	</head>
	<body>
		<div class="container-fluid">
			<form id="frm" name="frm" method="post">
				<div class="page-header">
				  <h1>Lista de Usuários</h1>
				</div>
				 <div class="row">
			  		<div class="form-group col-sm-12">
			  			<button id="btnIncluir" name="btnIncluir" type="button" class="btn btn-success btn-lg btn-block">Incluir</button>
			  		</div>
			  	</div>
			  	 
				<div class="table-responsive">          
					 <table id="tabelaUsuario" class="table table-striped table-hover">
						 <thead>
							 <tr>
								 <th>Nome</th>
								 <th>RG</th>
								 <th>CPF</th>
								 <th>Email</th>
								 <th>Perfil</th>
								 <th></th>
								 <th></th>
							 </tr>
						 </thead>
						 <tbody>
						 	<c:forEach items="${usuarios}" var="usuario">
						 		<tr>
						 			<td>${usuario.nome}</td>
						 			<td>${usuario.rg}</td>
						 			<td>${usuario.cpf}</td>
						 			<td>${usuario.email}</td>
						 			<td>${usuario.perfil.descricao}</td>
						 			<td class="botoesTabela">
						 				<a href="carregarUsuario?id=${usuario.id}" class="btn btn-success">
									    	<span class="glyphicon glyphicon-edit"></span>
				     					</a>
						 			</td>
						 			<td class="botoesTabela">
						 				<a href="removerUsuario?id=${usuario.id}" class="btn btn-danger">
									    	<span class="glyphicon glyphicon-trash"></span>
				     					</a>
						 			</td>
						 		</tr>
						 	</c:forEach>
						 </tbody>
					 </table>
				 </div>
				 <div class="modal fade" id="myModal" role="dialog">
			    	<div class="modal-dialog  modal-sm">
			    		<div class="modal-content alert">
			        		<div class="modal-body">
			          			<p id="msgModal"></p>
			        		</div>
			        		<div class="modal-footer">
							  <button type="button" class="btn btn-success" data-dismiss="modal">
								Ok <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
							  </button>
							</div>
			      		</div>
			    	</div>
			  	</div>	
				<input type="hidden" id="msg" name="msg" value="${msg}">		  	
			</form>
		</div>
	</body>
</html>
