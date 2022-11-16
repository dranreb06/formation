package com.formation.poo.interfaces;

public class MonAfficheur<T extends Figure> {

	private T figure;
	
	public MonAfficheur(T figure) {
		this.figure = figure;
	}
	
	public void afficher() {
		figure.dessineToi();
	}

}
