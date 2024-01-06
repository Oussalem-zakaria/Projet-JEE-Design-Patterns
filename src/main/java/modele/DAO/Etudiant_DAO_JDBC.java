package modele.DAO;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modele.Beans.Etudiant;

public class Etudiant_DAO_JDBC implements Etudiant_DAO {
	
	private Connection conn;
	
	public Etudiant_DAO_JDBC() {
		this.setConn(JDBC_Connexion.getConnetion());
	}
	
	@Override
	public void insert(Etudiant etd) {
		Statement st = null;
		int i=0;
		String sql = "insert into etudiants(nom, prenom, cne)" + "values('"+ 
		             etd.getNom() + "','" + etd.getPrenom() +"','" + etd.getCNE() + "')";
		try {
			st=conn.createStatement();
			i = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i > 0) { JOptionPane.showMessageDialog(null, "Etudiant inseré...!");
		    } else { JOptionPane.showMessageDialog(null, "Etudiant non inseré...!"); }
	}
	
	@Override
	public int update(Etudiant etd, String CNE) {
		Statement st = null;
		int i=0;
		String sql = "update etudiants set nom ='" + etd.getNom() + "',prenom='" +
		             etd.getPrenom() + "',cne='" + etd.getCNE() + "'where cne='" + CNE + "'";
				     		
		try {
			st=conn.createStatement();
			i = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i > 0) { JOptionPane.showMessageDialog(null, "Etudiant modifié...!");
	    } else { JOptionPane.showMessageDialog(null, "Etudiant non modifié...!"); }
		return i;
	}

	@Override
	public void deleteByCNE(String CNE) {
		Statement st = null;
		int i=0;
		String sql = "delete from etudiants where cne='" + CNE + "'";
				     		
		try {
			st=conn.createStatement();
			i = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i > 0) { JOptionPane.showMessageDialog(null, "Etudiant suprimé...!");
	    } else { JOptionPane.showMessageDialog(null, "Etudiant non suprimé...!"); }
		
	}
	
	@Override
	public ArrayList<Etudiant> findAll() {
		Statement st = null;
		ResultSet rs = null;
		int i=0;
		ArrayList<Etudiant> listetd = new ArrayList<Etudiant>();
		String sql = "SELECT * FROM etudiants ORDER BY CNE";
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				Etudiant etd = new Etudiant();
				etd.setNom(rs.getString("nom"));
				etd.setPrenom(rs.getString("prenom"));
				etd.setCNE(rs.getString("cne"));
				listetd.add(etd);
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i > 0) { JOptionPane.showMessageDialog(null, "Recherche terminée...!");
	    } else { JOptionPane.showMessageDialog(null, "Table vide...!"); }
		
		return listetd;
	}
	
	@Override
	public Etudiant findByCNE(String CNE) {
		Statement st = null;
		ResultSet rs = null;
		int i=0;
		Etudiant etd = new Etudiant();
		String sql = "SELECT * FROM etudiants where cne='" + CNE + "'";
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				etd.setNom(rs.getString("nom"));
				etd.setPrenom(rs.getString("prenom"));
				etd.setCNE(rs.getString("cne"));
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i > 0) { JOptionPane.showMessageDialog(null, "Recherche terminée...!");
	    } else { JOptionPane.showMessageDialog(null, "CNE non valide...!"); }
		
		return etd;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}


}
