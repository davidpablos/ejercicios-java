package com.davidpablos.basicos;

import java.util.Scanner;

public class EJ04_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double peso, altura, IMS;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca el peso (en kg) : ");
		peso = entrada.nextDouble();
		System.out.print("Introduzca la altura (en m) : ");
		altura = entrada.nextDouble();
		
		IMS = peso / Math.pow(altura, 2);
		
		if (IMS > 25){
			System.out.println("GORDACO!");
		}else if (IMS < 18){
			System.out.println("CUERPOESCOMBRO!");
		}else{
			System.out.println("FENîMENO!");
		}
		
	}

}
