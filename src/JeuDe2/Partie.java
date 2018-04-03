package JeuDe2;

public class Partie {

	public static final int SCORE_A_ATTEINDRE = 7;

	private Joueur j1, j2;
	private int tourEnCours;
	private Joueur joueurActif;

	public Partie(String nomJ1, String nomJ2) {
		j1 = new Joueur(nomJ1);
		j2 = new Joueur(nomJ2);

		joueurActif = j1;
		tourEnCours = 1;
	}

	public void ajouter1Tour() {
		tourEnCours++;
	}

	public void changerJoueurActif() {
		if (joueurActif == j1) {
			joueurActif = j2;
		} else {
			joueurActif = j1;
		}
	}

	public Joueur getJ1() {
		return j1;
	}

	public void setJ1(Joueur j1) {
		this.j1 = j1;
	}

	public Joueur getJ2() {
		return j2;
	}

	public void setJ2(Joueur j2) {
		this.j2 = j2;
	}

	public int getTourEnCours() {
		return tourEnCours;
	}

	public void setTourEnCours(int tourEnCours) {
		this.tourEnCours = tourEnCours;
	}

	public Joueur getJoueurActif() {
		return joueurActif;
	}

	public void setJoueurActif(Joueur joueurActif) {
		this.joueurActif = joueurActif;
	}

	public static int getScoreAAtteindre() {
		return SCORE_A_ATTEINDRE;
	}

}
