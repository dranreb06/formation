package com.formation.poo.interfaces;

import java.awt.Point;

public class Rectangle implements Figure {

	private int longeur, largeur;
	private Point position;

	public Rectangle(int longeur, int largeur) {
		super();
		this.longeur = longeur;
		this.largeur = largeur;
	}

	@Override
	public void dessineToi() {
		System.out.println(
				"Je suis un carre de longeur "+longeur
				+" et largeur "+largeur);
	}
	
	@Override
	public void setPosition(Point p) {
		this.position = p;
		
	}

	@Override
	public Point getPosition() {
		return position;
	}

}
