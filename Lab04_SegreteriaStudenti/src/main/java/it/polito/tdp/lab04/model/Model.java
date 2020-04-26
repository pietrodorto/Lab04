package it.polito.tdp.lab04.model;

import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

public class Model {
	
	private CorsoDAO corsodao;
	private StudenteDAO studentedao;
	
	/**
	 * @param corsodao
	 * @param studentedao
	 */
	public Model(CorsoDAO corsodao, StudenteDAO studentedao) {
		super();
		this.corsodao = corsodao;
		this.studentedao = studentedao;
	}
	
	public List<Studente> getStudentiIscrittiAlCorso(Corso corso){
		return corsodao.getStudentiIscrittiAlCorso(corso);
	}
	
	public List<Corso> getTuttiICorsi(){
		return corsodao.getTuttiICorsi();
	}
	
	public boolean StudenteEsiste(int matricola) {
		return studentedao.StudenteEsiste(matricola);
	}

}
