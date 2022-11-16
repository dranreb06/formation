package com.formation.base.exemple;

import java.awt.event.ActionListener;

import com.formation.base.Personne;
import com.formation.base.Premier;



public class MainPersonne2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne p1 = new Personne("Lumbroso","Bernard");
		System.out.println( p1.parler() );
		p1 = null; // lumbroso bernard va être détruit par le GC
		//System.gc();
		Personne p2 = new Personne("Durand","Jean");
		System.out.println( p2.parler());	
		
	
		System.out.println("Il y a "+Personne.nbPersonne+" personnes");
		Premier.main(null);

		ActionListener al = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				System.out.println("J'ai clique");
				
			};
		};
	}

}
