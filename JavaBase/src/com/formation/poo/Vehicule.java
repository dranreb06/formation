package com.formation.poo;

public abstract class Vehicule {

	protected int nbPlaces;
	private String nom;

	public abstract void tomberEnPanne();
	
	public void avancer() {
		System.out.print("J'avance ");
	}
	public Vehicule() {
		System.out.println("Je contruit un vehicule");
	}
	//...
	
	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void ajouterPlace(int nbPlace) {
		this.nbPlaces += nbPlace;
	}
	
	@Override
	public boolean equals(Object obj) {
		Vehicule v2 = (Vehicule) obj;
		if (getNom().equals(v2.getNom())) {
			return true;
		} else {
			return false;
		}
	}
}
