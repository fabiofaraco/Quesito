package br.com.quesito.interfaceDao;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.quesito.bean.Evento;
import br.com.quesito.bean.Protocolo;
import br.com.quesito.bean.Requerente;

public interface ProtocoloHibernateDao extends Dao<Protocolo> {
	public ArrayList<Evento> buscarEventoData(Calendar dataEvento);
	public Requerente buscarDadosRequerente(Long cpf);
}
