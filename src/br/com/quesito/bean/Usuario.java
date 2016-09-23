package br.com.quesito.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="USUARIOS")
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="ID_FUNCIONAL")
	private int idFuncional;
	
	@Column(name="CPF")
	private Long cpf;
	
	@Column(name="EMAIL")
	private String email;
	
	@ManyToOne
	@JoinColumn(name="ID_PERFIL")
	private Perfil perfil = new Perfil();
	
	@Column(name="RG")
	private Long rg;
	
	@Column(name="NOME")
	private String nome;

	@Column(name="SENHA")
	private String senha;
	
	@Transient
	private String confirmaSenha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public int getIdFuncional() {
		return idFuncional;
	}

	public void setIdFuncional(int idFuncional) {
		this.idFuncional = idFuncional;
	}
}
