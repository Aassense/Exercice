package toto;

import java.util.Random;

public class DeBean {
	protected int value;
	protected static final Random RANDOM = new Random();

	public DeBean() {
		this(1);
	}

	public DeBean(int value) {
		this.value = value;
	}

	public void lancer() {
		value = RANDOM.nextInt(6) + 1;
	}

	// -------------------
	// GETTER / SETTER
	// -------------------

	public int getValue() {
		return value;
	}
}