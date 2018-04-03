package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExoSQL {

	private static String URL = "jdbc:sqlite:C:/Users/JAVA/Desktop/SQLiteStudio/maBase";
	private final static String QUERY_SAVE_ELEVES = "INSERT INTO Eleve (prenom, note) VALUES (?, ?);";
	private final static String QUERY_FIND_ELEVES = "SELECT * FROM eleve ";

	public static void main(String[] args) {
		EleveBean eleveBean = new EleveBean();
		eleveBean.setNote(12);
		eleveBean.setPrenom("Luke");

		ajouterEleve(eleveBean);

		ArrayList<EleveBean> eleveBeans = getEleves();
		for (EleveBean e : eleveBeans) {
			System.out.println(e);
		}

	}

	// methode recuperation id nom et note:
	public static EleveBean rsetToEleve(final ResultSet rset) throws SQLException {
		final EleveBean eleve = new EleveBean();
		eleve.setId(rset.getInt("id"));
		eleve.setNote(rset.getInt("note"));
		eleve.setPrenom(rset.getString("prenom"));
		return eleve;
	}

	// requete update insert:
	public static void ajouterEleve(EleveBean eleveBean) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(URL); // La connexion
			stmt = con.prepareStatement(QUERY_SAVE_ELEVES);
			// Remplir la requête
			stmt.setString(1, eleveBean.getPrenom());
			stmt.setInt(2, eleveBean.getNote());
			// Lancer la requête
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// On ferme la connexion
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// TODO Ajout de l'élève en base
	// requete select:
	public static ArrayList<EleveBean> getEleves() {
		ArrayList<EleveBean> eleveBeans = new ArrayList<>();
		Connection con = null;
		Statement stmt = null;
		try {

			con = DriverManager.getConnection(URL);
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(QUERY_FIND_ELEVES);
			while (rset.next()) {
				EleveBean eleve = rsetToEleve(rset);
				eleveBeans.add(eleve);
			}
			return eleveBeans;
		} catch (final SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {// On ferme la connexion
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}

		// TODO Récupérer la liste des élèves dans la base

		return eleveBeans;
	}

}