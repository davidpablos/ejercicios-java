package com.davidpablos.profesor;

import java.util.Scanner;

public class Teclado {
	
	public static int leeNumero() {
		String entradaUsuario;;
		int resultado = 0;
		boolean correcto = false;

		while(!correcto) {
			try {
				Scanner entrada = new Scanner(System.in);
				entradaUsuario = entrada.next();
				resultado = Integer.parseInt(entradaUsuario);
				correcto = true;
			} catch (NumberFormatException e) {
				System.out.println("Nœmero con formato incorrecto. Introduzca de nuevo");
			} catch (Exception e) {
				break;
			}
		}
		
		return resultado;
	}

}
