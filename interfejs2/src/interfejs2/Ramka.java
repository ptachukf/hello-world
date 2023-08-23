package interfejs2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Ramka extends JFrame implements ActionListener {
	public ArrayList<Dokument> dokumenty;
	public ArrayList<JTextField> polaTekstoweTytuly;
	public ArrayList<JTextField> polaTekstoweTresci;
	public ArrayList<JButton> przyciski;
	public JPanel mojPanel;
	public JButton przyciskDodaj;

	public Ramka(ArrayList<Dokument> lista) {
		this.dokumenty = lista;
		mojPanel = new JPanel();
		add(mojPanel);
		wypelnijPanel();
	}

	public void wypelnijPanel() {
		mojPanel.removeAll();

		GridLayout uklad = new GridLayout(dokumenty.size() + 1, 3);

		polaTekstoweTytuly = new ArrayList<>();
		polaTekstoweTresci = new ArrayList<>();
		przyciski = new ArrayList<>();
		przyciskDodaj = new JButton("Dodaj ");

		mojPanel.setLayout(uklad);


		for (Dokument i : dokumenty) {
			JTextField poleTextowe = new JTextField();
			poleTextowe.setText(i.getTytul());
			mojPanel.add(poleTextowe);
			polaTekstoweTytuly.add(poleTextowe);


			JTextField poleTextowe2 = new JTextField();
			poleTextowe2.setText(i.getTresc());
			mojPanel.add(poleTextowe2);
			polaTekstoweTresci.add(poleTextowe2);


			JButton przycisk = new JButton("usun");
			mojPanel.add(przycisk);
			przyciski.add(przycisk);
			przycisk.addActionListener(this);

		}
		mojPanel.add(przyciskDodaj);
		przyciskDodaj.addActionListener(this);

		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource();

		if (zrodlo.equals(przyciskDodaj)) {
			//dodanie dokumentu
			String poleTutul = JOptionPane.showInputDialog(null, "Nazwa dokumentu",
					"Nowy dokument", JOptionPane.OK_CANCEL_OPTION);
			String poleTresc = JOptionPane.showInputDialog(null, "Tresc dokumentu",
					"Nowy dokument", JOptionPane.OK_CANCEL_OPTION);
			Dokument dok = new Dokument(poleTutul,poleTresc);
			dokumenty.add(dok);
		} else {
			int index = przyciski.indexOf(zrodlo);
			dokumenty.remove(index);
		}
		wypelnijPanel();
	}
}