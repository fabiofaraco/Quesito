package br.com.quesito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequerenteController {
	
	@RequestMapping("listarRequerentes")
	public String getFormLista() {
		return "lista-requerente";
	}
	
	@RequestMapping("cadastrarRequerente")
	public String getCadastrarRequerente() {
		return "cadastro-requerente";
	}
}
