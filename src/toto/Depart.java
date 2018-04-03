package toto;

public class Depart {

	public static void main(String[] args) {
		/*
		 * Maison maison = new Maison(); maison.largeur = 5; maison.longueur =
		 * 3; ExoMaison.printMaison(maison);
		 *
		 * }
		 *
		 * }
		 */
		// De de = new De();
		// System.out.println(de.getValue());

		// de.lancer();
		// System.out.println(de.getValue());
		DeBean toto = new DeBean();
		DeBean d2 = new DeBean();
		toto.lancer();
		d2.lancer();
		System.out.println(toto.getValue());
		System.out.println(d2.getValue());

		GobeletBean gobeletBean = new GobeletBean();
		gobeletBean.lancer();
		System.out.println(gobeletBean.getScoreDe());

	}
}