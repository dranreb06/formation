package com.formation.poo.interfaces;

import java.awt.Point;
import java.io.Serializable;

public class Carre implements Figure, Serializable {
	
	private int cote;
	private Point position;
	
	@Override
	public void dessineToi() {
		System.out.println(
				"Je suis un carre de cote "+cote);

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
