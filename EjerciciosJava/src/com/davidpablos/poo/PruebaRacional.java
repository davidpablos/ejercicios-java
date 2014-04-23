package com.davidpablos.poo;

public class PruebaRacional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racional r = new Racional(2, 4);
		
		System.out.println(r.toString());
		r.asignaNumerador(1);
		r.asignaDenominador(3);
		System.out.println(r.toString());
		
		Racional r2 = new Racional(2, 4);
		Racional suma = new Racional();
		suma = r2.suma(r);
		System.out.println(suma.toString());
	}

}
