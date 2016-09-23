package br.com.quesito.bean;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EVENTOS")
public class Evento {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="OBM")
	private Long obm;
	
	@Column(name="DT_EVENTO")
	private Calendar dataEvento = Calendar.getInstance();
	
	@Embedded
	private Endereco endereco = new Endereco();
	
	@Column(name="ESPECIE_BEM")
	private String especie;
	
	@Column(name="FINALIDADE")
	private String finalidade;
	
	@Column(name="RESPONSABILIDADE_CONINENTE")
	private String responsabilidadeQuantoAoContinente;
	
	@Column(name="RESPONSABILIDADE_CONTEUDO")
	private String responsabilidadeQuantoAoConteudo;
	
	@Column(name="TRIPULACAO")
	private String tripulacao;
	
	@Column(name="ORIGEM")
	private String comoSeOriginou;
	
	@Column(name="LOCAL_ORIGEM")
	private String ondeSeOriginou;
	
	@Column(name="SITUACAO_CHEGADA_SOCORRO")
	private String situacaoDoEventoChegada;
	
	@Column(name="ESTABELECIMENTO_MATERIAL")
	private String estabelecimentoDeMaterial;
	
	@Column(name="SALVAMENTO")
	private String salvamento;
	
	@Column(name="RETIRADA_CADAVER")
	private String retiradaDeCadaver;
	
	@Column(name="PROTECAO_BEM")
	private String protecaoDeBens;
	
	@Column(name="ILUMINACAO")
	private String iluminacao;
	
	/*private String arrombamento;
	private String bensMoveisEimoveisAtingidos;
	private String prejuizoQuantoAoContinente;
	private String prejuizoQuantoAoConteudo;
	private String materialEmpregadoDoCorpo;
	private String materialEmpregadoOutros;
	private String materialDoCorpoDestruidoOuAvariado;
	private String valoresRecolhidos;
	private String suprimentoDeAgua;
	private String acidente;
	private String atendimentoMedico;
	private String auxiliosEstranhosAoCorpo;
	private String pessoalQueTomouParteDosTrabalhos;
	private String comparecimentoDeAutoridades;
	private String aQuemFoiEntregueLocal;
	private String outrosEsclarecimentos;*/
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Calendar dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getObm() {
		return obm;
	}

	public void setObm(Long obm) {
		this.obm = obm;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getResponsabilidadeQuantoAoContinente() {
		return responsabilidadeQuantoAoContinente;
	}

	public void setResponsabilidadeQuantoAoContinente(
			String responsabilidadeQuantoAoContinente) {
		this.responsabilidadeQuantoAoContinente = responsabilidadeQuantoAoContinente;
	}

	public String getResponsabilidadeQuantoAoConteudo() {
		return responsabilidadeQuantoAoConteudo;
	}

	public void setResponsabilidadeQuantoAoConteudo(
			String responsabilidadeQuantoAoConteudo) {
		this.responsabilidadeQuantoAoConteudo = responsabilidadeQuantoAoConteudo;
	}

	public String getTripulacao() {
		return tripulacao;
	}

	public void setTripulacao(String tripulacao) {
		this.tripulacao = tripulacao;
	}

	public String getComoSeOriginou() {
		return comoSeOriginou;
	}

	public void setComoSeOriginou(String comoSeOriginou) {
		this.comoSeOriginou = comoSeOriginou;
	}

	public String getOndeSeOriginou() {
		return ondeSeOriginou;
	}

	public void setOndeSeOriginou(String ondeSeOriginou) {
		this.ondeSeOriginou = ondeSeOriginou;
	}

	public String getSituacaoDoEventoChegada() {
		return situacaoDoEventoChegada;
	}

	public void setSituacaoDoEventoChegada(String situacaoDoEventoChegada) {
		this.situacaoDoEventoChegada = situacaoDoEventoChegada;
	}

	public String getEstabelecimentoDeMaterial() {
		return estabelecimentoDeMaterial;
	}

	public void setEstabelecimentoDeMaterial(String estabelecimentoDeMaterial) {
		this.estabelecimentoDeMaterial = estabelecimentoDeMaterial;
	}

	public String getSalvamento() {
		return salvamento;
	}

	public void setSalvamento(String salvamento) {
		this.salvamento = salvamento;
	}

	public String getRetiradaDeCadaver() {
		return retiradaDeCadaver;
	}

	public void setRetiradaDeCadaver(String retiradaDeCadaver) {
		this.retiradaDeCadaver = retiradaDeCadaver;
	}

	public String getProtecaoDeBens() {
		return protecaoDeBens;
	}

	public void setProtecaoDeBens(String protecaoDeBens) {
		this.protecaoDeBens = protecaoDeBens;
	}

	public String getIluminacao() {
		return iluminacao;
	}

	public void setIluminacao(String iluminacao) {
		this.iluminacao = iluminacao;
	}
}
