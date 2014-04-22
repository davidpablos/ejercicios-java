package com.davidpablos.bucles;

import java.util.Scanner;

public class EJ06_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x  = (int) (100*Math.random()+1);
		int intentos = 0;
		int entradaUsuario;
		boolean acierto = false;
		
		System.out.println(x);
		
		while (intentos < 5 && !acierto){
			System.out.println("Introduzca un nœmero entero: ");
			Scanner entrada = new Scanner(System.in);
			entradaUsuario = entrada.nextInt();
			
			if (entradaUsuario == x){
				acierto = true;
			}else{
				intentos++;
			}
		}
		
		if (acierto){
			System.out.println("Has ganado!");
		}else{
			System.out.println("Has perdido!");
		}
		
	}

}
