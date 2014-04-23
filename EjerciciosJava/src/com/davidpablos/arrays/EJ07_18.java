package com.davidpablos.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EJ07_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int posiciones, entradaUsuario;
		int[] array1, array2, array3;
		
		System.out.print("Introduzca el número de posiciones que tiene el array 1: ");
		
		Scanner entrada = new Scanner(System.in);
		posiciones = entrada.nextInt();
		array1 = new int[posiciones];
		
		for (int i=0; i<array1.length; i++){
			System.out.print("Introduzca el elemento "+ (i+1) +" del array: ");
			entrada = new Scanner(System.in);
			entradaUsuario = entrada.nextInt();
			array1[i]  = entradaUsuario;
		}
		
		System.out.print("Introduzca el número de posiciones que tiene el array 2: ");
		
		entrada = new Scanner(System.in);
		posiciones = entrada.nextInt();
		array2 = new int[posiciones];
		
		for (int i=0; i<array2.length; i++){
			System.out.print("Introduzca el elemento "+ (i+1) +" del array: ");
			entrada = new Scanner(System.in);
			entradaUsuario = entrada.nextInt();
			array2[i]  = entradaUsuario;
		}
		
		if(array1.length > array2.length) {
			array3 = new int[array1.length];
			// Sumar los dos arrays
			for (int i = 0; i < array2.length; i++) {
				array3[i] = array1[i] + array2[i];
			}
			
			// Añadir los elementos restantes
			for (int i = array2.length; i < array3.length; i++) {
				array3[i] = array1[i];
			}
		} else {
			array3 = new int[array2.length];
			// Sumar los dos arrays
			for (int i = 0; i < array1.length; i++) {
				array3[i] = array1[i] + array2[i];
			}
			
			// Añadir los elementos restantes
			for (int i = array1.length; i < array3.length; i++) {
				array3[i] = array2[i];
			}
		}
		
		System.out.println("Array:" + Arrays.toString(array3));
	}

}
