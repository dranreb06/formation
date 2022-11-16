package com.formation.poo;

public class Tandem extends Velo{
	public Tandem() {
		nbPlaces = 2;
	}
	@Override
	public void pedaler() {
		System.out.println("Je pédale à deux");
	}
	@Override
	public void avancer() {
		System.out.println("J'avance comme un tandem");
	}
}

