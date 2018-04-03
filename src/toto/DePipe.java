package toto;

public class DePipe extends DeBean {

	@Override
	public void lancer() {
		if (RANDOM.nextBoolean()) {
			super.lancer();
		} else {
			value = 6;
		}

	}

}