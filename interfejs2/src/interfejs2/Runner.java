package interfejs2;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Dokument> dokumenty = new ArrayList<Dokument>();
		Dokument doc1 = new Dokument("A", "AA");
		Dokument doc2 = new Dokument("b", "bb");
		Dokument doc3 = new Dokument("c", "cc");
		
		dokumenty.add(doc1);
		dokumenty.add(doc2);
		dokumenty.add(doc3);
		
		Ramka mojaRamka = new Ramka(dokumenty);
		mojaRamka.setVisible(true);
		
		
	}

}
