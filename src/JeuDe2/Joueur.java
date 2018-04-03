package JeuDe2;

public class Joueur {
	private Gobelet2 gobelet;
	private String prenom;
	private int scorePartie;

	public Joueur(String prenom) {
		gobelet = new Gobelet2();
		this.prenom = prenom;

	}

	public void lancer() {
		gobelet.lancer();
	}

	public void ajouter1Pts() {
		scorePartie++;
	}

	public Gobelet2 getGobelet() {
		return gobelet;
	}

	public void setGobelet(Gobelet2 gobelet) {
		this.gobelet = gobelet;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getScorePartie() {
		return scorePartie;
	}

	public void setScorePartie(int scorePartie) {
		this.scorePartie = scorePartie;
	}

}