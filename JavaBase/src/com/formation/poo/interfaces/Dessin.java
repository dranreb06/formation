package com.formation.poo.interfaces;

public class Dessin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Figure mesFigures[] = new Figure[2];
		mesFigures[0] = new Carre();
		mesFigures[1] = new Rectangle(12,14);
		
		for (int i = 0; i < mesFigures.length; i++) {
			mesFigures[i].dessineToi();
		}
		

	}

}
