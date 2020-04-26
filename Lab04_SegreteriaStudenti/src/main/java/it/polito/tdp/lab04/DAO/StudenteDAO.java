package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {
	
	// PUNTO 5
	
	public boolean StudenteEsiste(int matricola) {

		final String sql = "SELECT * FROM studente WHERE matricola= ? ";
		boolean presente = false;

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, matricola);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				
				presente = true;
				conn.close();
				return presente;
			}
			else {
				presente = false;
				conn.close();
				return presente;
			}

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
	}
	
	public Studente CompletamentoAutomatico(int matricola) {

		final String sql = "SELECT nome, cognome FROM studente WHERE matricola = ? ";
		

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, matricola);
			ResultSet rs = st.executeQuery();

			while(rs.next()) {
				
				
			}
			

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
	}


}
