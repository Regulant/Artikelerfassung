package de.clearit.Artikelerfassung;

import javax.swing.SwingUtilities;

public class ArtikelerfassungsApp {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
		});	
	}

}
