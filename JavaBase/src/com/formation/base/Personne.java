package com.formation.base;

public class Personne {
	
	private String nom;
	private String prenom;
	public static final int NOMBRE_PARENT = 2;
	public static int nbPersonne;
	
		
	public Personne() {
		nbPersonne++;
	}
	public Personne(String nom, String prenom) {
		this();
		this.nom = nom;
		this.prenom = prenom;
		double x = nbPersonne;
				
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		if (nom.equals("rien")) {
			// impossible on ne change pas le nom
			return;
		}
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
//...
	


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	//...
	
	

	public String parler() {
		String s =  "Je suis "+this.prenom+" "+this.nom+".";
		return s;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("c'est la fin de "+nom);
	}
	
}


