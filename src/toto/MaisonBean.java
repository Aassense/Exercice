package toto;

import java.util.Random;

//A quoi ressemble une maison
public class MaisonBean {
	int largeur, longueur;

	public MaisonBean() {
		// TODO Auto-generated constructor stub
	}

	public MaisonBean(boolean random) {
		if (random) {
			largeur = new Random().nextInt(100);
			longueur = new Random().nextInt(100);
		}
	}

	public int getSurface() {
		return largeur * longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

}