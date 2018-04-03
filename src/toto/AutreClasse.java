package toto;

public class AutreClasse {

	public static int multiplyAndAdd(int a, int b, int c) {
		int m1 = b + c;
		int result = m1 * a;
		return result;

		// plusieurs parametre

	}

	public static void Subject(int a, int b) {
		System.out.println("resultat:" + (a - b));// apprendre à mettre
													// plusieurs parametres
		// TODO Auto-generated method stub

	}

	public static void exo2(int parametreentier) {

		System.out.println("affichage:" + (parametreentier + 5));// apprendre à
																	// nommer un
																	// parametre

		// TODO Auto-generated method stub

	}

	static double photocopie(int nbPhoto) {
		if (nbPhoto <= 10) {
			return nbPhoto * 0.1;
		} else if (nbPhoto <= 30) {
			return 1 + (nbPhoto - 10) * 0.99;
		} else {
			return 2.8 + (nbPhoto - 30) * 0.08;
		}

	}

	static void exo1() {
		int i = 7;
		int j = 3;
		int x = i / j;
		int y = i % j;
		double z = (double) i / j;
		double v = x + y + z;

		System.out.println("la division entiere de i par j est" + x);
		System.out.println("le reste de la division de i par j est" + y);
		System.out.println("la division classique" + z);
		System.out.println("la somme des 3 est" + v);// apprendre à afficher et
														// utiliser double et
														// int

	}

	public static int max(int a, int b, int c) {
		if (a >= b && a >= c) {
			System.out.println("le plus grand est:" + a);
			return a;

		} else if (b >= a && b >= c) {
			System.out.println("le plus grand est:" + b);
			return b;

		} else {
			System.out.println("le plus grand est:" + c);
			return c;// apprendre à utiliser les if et methode dans une autre
						// classe
		}

	}

	public static void methodeFor() {
		for (int i = 1; i < 10000; i++) {
			if (i % 47 == 0) {
				System.out.print(" " + i);
			}

		}

	}

}
