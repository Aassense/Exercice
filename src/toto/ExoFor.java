package toto;

public class ExoFor {

	public static String testFor(String maChaine) {
		String resultat = "";

		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			resultat = resultat + c + '\n';
		}

		return resultat;
	}

	public static int testA(String maChaine) {
		int compteur = 0;

		for (int i = 0; i < maChaine.length(); i++) {

			char c = maChaine.charAt(i);
			if (c == 'a') {
				compteur += 1;

			}

		}

		return compteur;

	}

	public static char testPetit(String maChaine) {
		char resultat = 'z';

		for (int i = 0; i < maChaine.length(); i++) {

			char c = maChaine.charAt(i);
			if (c < resultat) {
				resultat = c;

			}

		}

		return resultat;

	}

	public static char testGrand(String maChaine) {
		char resultat = 'a';

		for (int i = 0; i < maChaine.length(); i++) {

			char c = maChaine.charAt(i);
			if (c > resultat) {
				resultat = c;

			}

		}

		return resultat;

	}

	public static int testNombrelettrePlusGrande(String maChaine) {
		char lettreLaPlusGrande = testGrand(maChaine);
		int resultat = 0;
		for (int i = 0; i < maChaine.length(); i++) {

			char c = maChaine.charAt(i);
			if (c == lettreLaPlusGrande) {
				resultat++;

			}

		}
		return resultat;
	}

	public static String sansVoyelle(String maChaine) {
		String resultat = "";
		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
				resultat += c;
			}
		}

		return resultat;
	}

	public static String reverse(String maChaine) {
		String resultat = "";
		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			resultat = c + resultat;
		}

		return resultat;
	}

	public static String reverseEnPartantDeLaFin(String maChaine) {
		String resultat = "";
		// maChaine.length() -> la taille de la liste
		for (int i = maChaine.length() - 1; i >= 0; i--) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			resultat += c;
		}

		return resultat;
	}

	public static boolean isTrier(String maChaine) {
		char resultat = 'a';
		boolean verif = false;

		for (int i = 0; i < maChaine.length(); i++) {

			char c = maChaine.charAt(i);
			if (c >= resultat) {
				resultat = c;
				verif = true;

			} else {
				verif = false;

			}

		}

		return verif;

	}

	public static boolean minuscule(String maChaine) {
		// maChaine.length() -> la taille de la liste
		for (int i = 1; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			if (c < 'a' || c > 'z') {
				return false;
			}
		}

		return true;
	}

	public static int somme(String maChaine) {
		int compteur = 0;

		for (int i = 0; i < maChaine.length(); i++) {

			int c = maChaine.charAt(i);
			compteur = c + compteur;
		}

		return compteur;

	}

	public static char moyenne(String maChaine) {
		return (char) (somme(maChaine) / maChaine.length());
	}
}
