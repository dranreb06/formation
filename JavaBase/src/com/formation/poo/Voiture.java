package com.formation.poo;

public class Voiture extends Vehicule {

	private int nbChevaux;
	private String marque;
	private int nbKm;
	
	@Override
	public void avancer() {
		super.avancer();
		System.out.println("comme une voiture");
	}
	//...
	public Voiture(int nbChevaux, String marque, int nbKm) {
		this.nbChevaux = nbChevaux;
		this.marque = marque;
		this.nbKm = nbKm;
	}
	public Voiture(int nbChevaux, String marque) {
		this(nbChevaux,marque,0); // this(...) appelle le constructeur
								  // avec 3 parametres
	}
	public void avancer(int km){
		nbKm += km;
	}

	public void avancer(double forceAccelerateur) {
		nbKm += forceAccelerateur * nbChevaux;
	}
	@Override
	public void tomberEnPanne() {
		// TODO Auto-generated method stub
		
	}
}

