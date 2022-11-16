package com.formation.poo;

public class Velo extends Vehicule{
	public Velo() {
		super();
		nbPlaces = 1;
	}
	public void pedaler(){
		System.out.println("Je pedale seul");
	}
	@Override
	public void avancer() {
		super.avancer();
		System.out.println("comme un velo");
	}
	@Override
	public void tomberEnPanne() {
		// TODO Auto-generated method stub
		
	}
}
