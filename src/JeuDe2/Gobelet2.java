package JeuDe2;

public class Gobelet2 {
	private De d1;
	private De d2;

	public Gobelet2() {
		d1 = new De();
		d2 = new De();

	}

	public void lancer() {
		d1.lancer();
		d2.lancer();

	}

	public De getD1() {
		return d1;
	}

	public void setD1(De d1) {
		this.d1 = d1;
	}

	public int getScoreDe() {
		return d1.getValue() + d2.getValue();
	}

	public De getD2() {
		return d2;
	}

	public void setD2(De d2) {
		this.d2 = d2;
	}

}
