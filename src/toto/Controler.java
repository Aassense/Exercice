package toto;

public class Controler {

	public static void main(String[] args) {
		lancer();
	}

	public static void lancer() {
		PartieBean pB = new PartieBean("Toto", "Tata");
		// on lance la partie en entier
		for (int i = 0; i < PartieBean.NBR_TOUR; i++) {
			pB.getJ1().lancer();

			if (pB.getJ1().getGobelet().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
				pB.getJ1().ajouter1Pts();
			}

			pB.getJ2().lancer();
			if (pB.getJ2().getGobelet().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
				pB.getJ2().ajouter1Pts();
			}

			pB.ajouter1Tour();
		}
		// L'affichage du résulat

		if (pB.getJ1().getScorePartie() > pB.getJ2().getScorePartie()) {
			System.out.println("J1 a gagné");
		} else if (pB.getJ1().getScorePartie() < pB.getJ2().getScorePartie()) {
			System.out.println("J2 a gagné");
		} else {
			System.out.println("Egalité");
		}

		System.out.println("Score  : " + pB.getJ1().getScorePartie() + " - " + pB.getJ2().getScorePartie());

	}

}