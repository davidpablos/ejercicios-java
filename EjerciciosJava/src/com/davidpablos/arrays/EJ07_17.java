package com.davidpablos.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EJ07_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int posiciones, entradaUsuario;
		boolean capicua = true;
		int[] array;
		
		
		/**
		 * Inicializamos el array
		 */
		
		System.out.print("Introduzca el nœmero de posiciones que tiene el array: ");
		
		Scanner entrada = new Scanner(System.in);
		posiciones = entrada.nextInt();
		array = new int[posiciones];

		
		for (int i=0; i<array.length; i++){
			System.out.print("Introduzca el elemento "+ (i+1) +" del array: ");
			entrada = new Scanner(System.in);
			entradaUsuario = entrada.nextInt();
			array[i]  = entradaUsuario;
		}
		
		System.out.println("Array:" + Arrays.toString(array));
		
		
		/**
		 * Comprobamos si el array es capicua
		 */
		
		int primero = 0;
		int ultimo = array.length - 1;
		
		while (capicua && primero <= ultimo){
			if (array[primero] != array[ultimo]){
				capicua = false;
			}
			
			primero++;
			ultimo--;
		}
		
		if (capicua){
			System.out.println("El array es capicua");
		}else{
			System.out.println("El array no es capicua");
		}
	}

}
