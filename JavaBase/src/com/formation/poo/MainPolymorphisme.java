package com.formation.poo;

public class MainPolymorphisme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Velo v1 =  new Velo();
		v1.setNom("v1");
		v1.avancer();
		
		Vehicule vehicule1 = v1;
		vehicule1.avancer();
		
		((Velo) vehicule1).pedaler();
		
		Velo v2 = new Velo();
		v2.setNom("v1");
	
		if (v1 == v2) {
			System.out.println("v1==v2");
		} else {
			System.out.println("v1!=v2");
		}
		
		if (v1.equals(v2)) {
			System.out.println("v1.equals(v2)");
		} else {
			System.out.println("! v1.equals(v2");
		}
		
		Vehicule[] vehicules = new Vehicule[3];
		vehicules[0] = new Velo();
		vehicules[1] = new Tandem();
		vehicules[2] = new Voiture(5,"audi");
		
		for (int i = 0; i < vehicules.length; i++) {
			vehicules[i].avancer();
		}
		

	}

}
