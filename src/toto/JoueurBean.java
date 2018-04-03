package toto;

public class JoueurBean {

	private GobeletBean gobelet;
	private String nom;
	private int scorePartie;
	private boolean tricheur;

	public JoueurBean(String nom) {
		gobelet = new GobeletBean();
		this.nom = nom;
	}

	public void lancer() {
		gobelet.lancer();
	}

	public void ajouter1Pts() {
		scorePartie++;
	}

	public void setTricheur(boolean tricheur) {
		this.tricheur = tricheur;
		gobelet = new GobeletBean(tricheur);
	}

	// GETTER / SETTER

	public boolean isTricheur() {
		return tricheur;
	}

	public GobeletBean getGobelet() {
		return gobelet;
	}

	public void setGobelet(GobeletBean gobelet) {
		this.gobelet = gobelet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScorePartie() {
		return scorePartie;
	}

	public void setScorePartie(int scorePartie) {
		this.scorePartie = scorePartie;
	}

}