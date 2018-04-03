package toto;

import java.util.ArrayList;

public class CollectionUtils {

	public static void main(String[] args) {
		ArrayList<MaisonBean> mArrayList = new ArrayList<>();
		fillList(mArrayList, 10);
		printList(mArrayList);
		MaisonBean max = getMax(mArrayList);
		if (max != null) {
			System.out.println("max = " + max.largeur + "x" + max.longueur);
		} else {
			System.out.println("max à nulle");
		}

		printList(mArrayList);
	}

	/** Remplis la liste de maison de largeur et longueur aléatoires */
	public static void fillList(ArrayList<MaisonBean> maisonArrayList, int nbMaison) {
		for (int i = 0; i < nbMaison; i++) {
			MaisonBean maisonBean = new MaisonBean(true);
			maisonArrayList.add(maisonBean);
		}
	}

	/** Affiche la liste dans la console */
	public static void printList(ArrayList<MaisonBean> maisonArrayList) {
		for (int i = 0; i < maisonArrayList.size(); i++) {
			MaisonBean maisonBean = maisonArrayList.get(i);
			System.out.print(maisonBean.largeur + "x" + maisonBean.longueur + " ");
		}
		System.out.println();
	}

	// ** Affiche et retourne la maison la plus grande */
	public static MaisonBean getMax(ArrayList<MaisonBean> maisonArrayList) {
		MaisonBean resultat = null;
		for (int i = 0; i < maisonArrayList.size(); i++) {
			MaisonBean maisonBean = maisonArrayList.get(i);
			if (resultat == null || resultat.getSurface() < maisonBean.getSurface()) {
				resultat = maisonBean;
			}
		}
		return resultat;
	}

}