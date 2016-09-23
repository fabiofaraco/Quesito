package br.com.quesito.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.quesito.bean.Usuario;
import br.com.quesito.interfaceDao.UsuarioHibernateDao;
import br.com.quesito.util.PersistenceUtil;

public class UsuarioDao extends GenericDao<Usuario> implements UsuarioHibernateDao {
		
	public UsuarioDao() {
		super(Usuario.class);	
	}

	@Override
	public Usuario realizaLogin(String email, String senha) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try {
			Query query = manager.createQuery("select u from Usuario u where u.email = :email and u.senha = :senha");
			query.setParameter("email", email);
			query.setParameter("senha", senha);
			
			Usuario usuario = (Usuario)query.getSingleResult();
			
			return usuario;
		} catch(NoResultException e) {
			return null;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean validarCpf(Long cpf) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try {
			Query query = manager.createQuery("select u from Usuario u where u.cpf = :cpf");
			query.setParameter("cpf", cpf);
			query.getSingleResult();
			
			return false;
		} catch(NoResultException e) {
			return true;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean validarIdFuncional(int idFuncional) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try {
			Query query = manager.createQuery("select u from Usuario u where u.idFuncional = :idFuncional");
			query.setParameter("idFuncional", idFuncional);
			query.getSingleResult();
			
			return false;
		} catch(NoResultException e) {
			return true;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean validarRg(Long rg) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try {
			Query query = manager.createQuery("select u from Usuario u where u.rg = :rg");
			query.setParameter("rg", rg);
			query.getSingleResult();
			
			return false;
		} catch(NoResultException e) {
			return true;
		} finally {
			manager.close();
		}
	}
	
	
}
