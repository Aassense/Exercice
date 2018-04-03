package toto;

import java.util.Random;

public class ArrayUtils {

	public static void fillTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(100);
		} // Chiffre Aléatoire de 0 à 99

	}

	public static void printTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();

	}

	public static int getMax(int[] tab) {
		int valeur = Integer.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > valeur) {
				valeur = tab[i];
			}

		}
		return valeur;
	}

	public static int exoTableausomme(int[] tab) {

		int resultat = 0;

		for (int i = 0; i < tab.length; i++) {

			resultat += tab[i];
		}
		return resultat;
	}

	public static float exoTableaumoyenne(int[] tab) {

		return (float) exoTableausomme(tab) / tab.length;

	}

	public static void exoTableaumoyennePlusGrand(int[] tab) {
		float moyenne = exoTableaumoyenne(tab);
		for (int i = 0; i < tab.length; i++) {

			if (tab[i] >= moyenne) {
				System.out.print(tab[i] + " ");

			}

		}
	}

	public static int nbMax(int[] tab) {
		int max = getMax(tab);
		int resultat = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == max) {
				resultat++;
			}
		}
		return resultat;
	}

}
