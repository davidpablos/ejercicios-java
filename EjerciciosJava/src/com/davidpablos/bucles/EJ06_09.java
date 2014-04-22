package com.davidpablos.bucles;

import java.util.Scanner;

public class EJ06_09 {
	
	/**
	 * Construir un programa que calcule el factorial de un valor numŽrico introducido 
	 * como par‡metro o argumento en la l’nea de comandos.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double fact = 1;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca el nœmero del que se quiere calcular el factorial: ");
		n = entrada.nextInt();
		
		for(int i=n; i>=1; i--){
			fact = fact * i;
		}
		
		System.out.println("El factorial de "+ n +" es: "+ fact);
		
	}

}
