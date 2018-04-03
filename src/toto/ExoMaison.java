package toto;

import java.util.Random;

public class ExoMaison {

	public static void printMaison(MaisonBean m) {

		System.out.println("la longeur:" + "  " + m.largeur + "et la largeur est" + "  " + m.longueur);
	}

	public static void doubleMaison(MaisonBean m) {
		m.largeur = m.largeur * 2;
		m.longueur = m.longueur * 2;
	}

	public static MaisonBean bigMaison(MaisonBean m1, MaisonBean m2) {
		if (m1 == null && m2 == null) {
			return null;
		} else if (m1 == null) {
			return m2;
		} else if (m2 == null) {
			return m1;
		} else if (m1.largeur * m1.longueur > m2.largeur * m2.longueur) {
			return m1;
		} else if (m1.largeur * m1.longueur < m2.largeur * m2.longueur) {
			return m2;
		}

		return null;
	}

	public static void createMaisons(MaisonBean[] tab) {

		for (int i = 0; i < tab.length; i++) {
			MaisonBean maison = new MaisonBean();
			maison.largeur = new Random().nextInt(100);
			maison.longueur = new Random().nextInt(100);

			tab[i] = maison;
		}
	}

	public static void printMaisons(MaisonBean[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i] + ":" + tab[i].largeur + "x" + tab[i].longueur);
		}

	}

	public static MaisonBean bigMaison(MaisonBean[] tab) {
		if (tab == null) {
			return null;
		}
		MaisonBean maisonMax = null;
		for (int i = 0; i < tab.length; i++) {
			if (maisonMax == null) {
				maisonMax = tab[i];
			}
			// Action
			else if (tab[i].largeur * tab[i].longueur > maisonMax.largeur * maisonMax.longueur) {
				maisonMax = tab[i];
			}
		}
		return maisonMax;
	}

}
