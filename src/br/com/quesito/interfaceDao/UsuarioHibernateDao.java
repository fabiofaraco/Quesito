package br.com.quesito.interfaceDao;

import br.com.quesito.bean.Usuario;

public interface UsuarioHibernateDao extends Dao<Usuario> {
	public Usuario realizaLogin(String email, String senha);
	
	public boolean validarCpf(Long cpf);
	
	public boolean validarIdFuncional(int idFuncional);
	
	public boolean validarRg(Long rg);
}
