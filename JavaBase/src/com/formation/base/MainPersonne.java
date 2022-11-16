package com.formation.base;

public class MainPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne("Lumbroso","Bernard");
		System.out.println( p1.parler() );
		p1 = null; // lumbroso bernard va être détruit par le GC
		//System.gc();
		Personne p2 = new Personne("Durand","Jean");
		System.out.println( p2.parler());	
		
	
		System.out.println("Il y a "+Personne.nbPersonne+" personnes");
	}

}


