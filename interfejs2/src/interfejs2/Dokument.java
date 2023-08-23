package interfejs2;

public class Dokument {
	private String tytul;
	private String tresc;
	public Dokument(String tytul, String tresc) {
		super();
		this.tytul = tytul;
		this.tresc = tresc;
	}
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getTresc() {
		return tresc;
	}
	public void setTresc(String tresc) {
		this.tresc = tresc;
	}
	
}
