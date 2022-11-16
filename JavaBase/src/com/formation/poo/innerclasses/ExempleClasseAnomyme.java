package com.formation.poo.innerclasses;

import java.awt.Point;

import com.formation.poo.interfaces.Figure;

public class ExempleClasseAnomyme {

	public static void main(String[] args) {
		Figure triangle = new Figure() {
			private Point position;

			@Override
			public void dessineToi() {
				System.out.println("Je suis triangle");

			}

			@Override
			public void setPosition(Point p) {
				this.position = p;

			}

			@Override
			public Point getPosition() {
				return position;
			}

		};

	}
}
