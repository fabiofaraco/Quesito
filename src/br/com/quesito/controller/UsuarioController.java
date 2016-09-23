package br.com.quesito.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.quesito.bean.Perfil;
import br.com.quesito.bean.Usuario;
import br.com.quesito.dao.GenericDao;
import br.com.quesito.dao.UsuarioDao;
import br.com.quesito.interfaceDao.Dao;
import br.com.quesito.interfaceDao.UsuarioHibernateDao;
import br.com.quesito.propertyEditor.PerfilPropertyEditor;

@Controller
public class UsuarioController {
	
	@InitBinder
	public void customizeBinding(WebDataBinder binder) {
		binder.registerCustomEditor(Perfil.class,  new PerfilPropertyEditor());
	}
	
	@RequestMapping("cadastroUsuario")
	public String getFormCadastro(Usuario usuario, Model model) {
		Dao<Perfil> dao = new GenericDao<Perfil>(Perfil.class);
		List<Perfil> perfis = dao.getLista("select p from Perfil p");
		
		model.addAttribute("perfis", perfis);		
		return "cadastro-usuario";
	}
	
	@RequestMapping("listaUsuario")
	public String getFormLista(Model model) {
		Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
		List<Usuario> usuarios = dao.getLista("select u from Usuario u");
		
		model.addAttribute("usuarios", usuarios);
		
		return "lista-usuario";
	}
	
	@RequestMapping("carregarUsuario")
	public String carregarUsuario(Usuario usuario, Model model) {
		Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
		
		Dao<Perfil> daoPerfil = new GenericDao<Perfil>(Perfil.class);
		List<Perfil> perfis = daoPerfil.getLista("select p from Perfil p");
		
		model.addAttribute("usuario", dao.buscar(usuario.getId()));
		model.addAttribute("perfis", perfis);
		
		return "cadastro-usuario";
	}
	
	@RequestMapping("salvarUsuario")
	public String salvarUsuario(Usuario usuario, RedirectAttributes redirectAttributes) {
		Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
		String msg = "";
		
		if(usuario.getId() == 0) {
			dao.incluir(usuario);
			msg = "O usuário "+usuario.getNome()+" foi incluído com sucesso";
		} else {
			dao.alterar(usuario);
			msg = "O usuário "+usuario.getNome()+" foi alterado com sucesso";
		}
		
		redirectAttributes.addFlashAttribute("msg", msg);
		return "redirect:listaUsuario";
	}
	
	@RequestMapping("removerUsuario")
	public String removerUsuario(Usuario usuario, RedirectAttributes redirectAttributes) {
		Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
		dao.remover(usuario.getId());
		
		redirectAttributes.addFlashAttribute("msg", "Usuário removido com sucesso");
		return "redirect:listaUsuario";
	}
	
	@RequestMapping("validaCpf")
	public @ResponseBody String validarCpf(Long cpf) {
		UsuarioHibernateDao dao = new UsuarioDao();
		
		if(!dao.validarCpf(cpf)) {
			return "O CPF digitado já está cadastrado no sistema";
		} 
		return "";
	}
	
	@RequestMapping("validaIdFuncional")
	public @ResponseBody String validarIdFuncional(int idFuncional) {
		UsuarioHibernateDao dao = new UsuarioDao();
		
		if(!dao.validarIdFuncional(idFuncional)) {
			return "O ID funcional digitado já está cadastrado no sistema";
		} 
		return "";
	}
	
	@RequestMapping("validaRg")
	public @ResponseBody String validarRg(Long rg) {
		UsuarioHibernateDao dao = new UsuarioDao();
		
		if(!dao.validarRg(rg)) {
			return "O RG digitado já está cadastrado no sistema";
		} 
		return "";
	}
}
