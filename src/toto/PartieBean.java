package toto;

public class PartieBean {
	public static final int NBR_TOUR = 10;
	public static final int SCORE_A_ATTEINDRE = 7;

	private JoueurBean j1, j2;
	private int tourEnCours;
	private JoueurBean joueurActif;

	public PartieBean(String nomJ1, String nomJ2) {
		j1 = new JoueurBean(nomJ1);
		j2 = new JoueurBean(nomJ2);

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

	public boolean isTermine() {
		return NBR_TOUR < tourEnCours;
	}

	// ----GETTER / SETTER

	public JoueurBean getJ1() {
		return j1;
	}

	public void setJ1(JoueurBean j1) {
		this.j1 = j1;
	}

	public JoueurBean getJ2() {
		return j2;
	}

	public void setJ2(JoueurBean j2) {
		this.j2 = j2;
	}

	public int getTourEnCours() {
		return tourEnCours;
	}

	public void setTourEnCours(int tourEnCours) {
		this.tourEnCours = tourEnCours;
	}

	public JoueurBean getJoueurActif() {
		return joueurActif;
	}

	public void setJoueurActif(JoueurBean joueurActif) {
		this.joueurActif = joueurActif;
	}

}