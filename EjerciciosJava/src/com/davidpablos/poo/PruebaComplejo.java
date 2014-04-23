package com.davidpablos.poo;

import com.davidpablos.poo.Complejo;

public class PruebaComplejo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo c = new Complejo();
		c.imprimir();
		
		c.asignar(1, -2);
		c.imprimir();
		
		Complejo c2 = new Complejo(4, 2);
		c2.imprimir();
		
		c.suma(c2);
		c.imprimir();
		
		Complejo c3 = new Complejo();
		c3 = Complejo.sumar(c, c2);
		c3.imprimir();
		System.out.println(c3.isEqual(c));
		
		Complejo c4 = new Complejo(4, 2);
		System.out.println(c4.isEqual(c2));
		System.out.println(Complejo.getInstancias());
	}

}
