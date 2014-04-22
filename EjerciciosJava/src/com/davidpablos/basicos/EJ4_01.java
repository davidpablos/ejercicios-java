package com.davidpablos.basicos;

import java.util.Scanner;

public class EJ4_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio, volumen, superficie;
		
		System.out.print("Introduzca el radio de la esfera: ");
		Scanner entrada = new Scanner(System.in);
		radio = entrada.nextDouble();
		
		volumen = (4/3) * Math.PI * Math.pow(radio, 3);
		superficie = 4 * Math.PI * Math.pow(radio, 2);
		
		System.out.println("El volumen de la esfera de radio "+ radio + " es: "+ volumen);
		System.out.println("La superficie de la esfera de radio "+ radio + " es: "+ superficie);
	}

}
