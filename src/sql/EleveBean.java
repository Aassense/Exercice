package sql;

public class EleveBean {
	private int note;
	private String prenom;
	private long id;

	public EleveBean() {
		super();
	}

	@Override
	public String toString() {
		return "note=" + note + ", prenom=" + prenom + ", id=" + id + "]";
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
