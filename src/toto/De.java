package toto;

import java.util.Random;

public class De {
	private int value;

	public De() {

		this(1);
	}

	public De(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void lancer() {
		value = new Random().nextInt(6) + 1;

		;
	}

}
