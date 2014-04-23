package com.davidpablos.basicos;

import java.util.Scanner;

public class EJ4_03 {

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
		
		IMS = Math.rint(IMS * 100) / 100;
		
		System.out.print("Su IMS es " + IMS +": ");
		
		if (IMS < 16){
			System.out.println("Criterio de ingreso en hospital");
		}else if (16 <= IMS && IMS < 17){
			System.out.println("Infrapeso");
		}else if (17 <= IMS && IMS < 18){
			System.out.println("Bajo peso");
		}else if (18 <= IMS && IMS < 25){
			System.out.println("Peso normal (saludable)");
		}else if (25 <= IMS && IMS < 30){
			System.out.println("Sobrepeso");
		}else if (30 <= IMS && IMS < 35){
			System.out.println("Sobrepeso cr—nico");
		}else if (35 <= IMS && IMS < 40){
			System.out.println("Obesidad prem—rbida");
		}else{
			System.out.println("Obesidad m—rbida");
		}
	}

}
