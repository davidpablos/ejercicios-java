package com.davidpablos.clases;

import java.util.ArrayList;
import java.util.Scanner;

import com.davidpablos.factories.Factory;
import com.davidpablos.interfaces.IJugable;

public class Application {
	
	private static int VIDAS = 5;
	private static int NUMAADIVINAR = 3;
	private static int NUMPAR = 6;
	private static int NUMIMPAR = 7;
	private static JuegoAdivinaNumero juegoNumero;
	private static JuegoAdivinaPar juegoPar;
	private static JuegoAdivinaImpar juegoImpar;
	
	public static IJugable eligeJuego() {
		juegoNumero = Factory.getInstanciaJuegoAdivinaNumero(VIDAS, NUMAADIVINAR);
		juegoPar = Factory.getInstanciaJuegoAdivinaPar(VIDAS, NUMPAR);
		juegoImpar = Factory.getInstanciaJuegoAdivinaImpar(VIDAS, NUMIMPAR);
		ArrayList<IJugable> listaJuegos = new ArrayList<IJugable>();
		listaJuegos.add(juegoNumero);
		listaJuegos.add(juegoPar);
		listaJuegos.add(juegoImpar);
		
		System.out.println("Elija juego");
		for(IJugable j : listaJuegos){
			j.muestraNombre();
		}
		
		boolean continuar = true;
		int entradaUsuario = 0;
		
		while(continuar) {
			System.out.print("Introduzca un nœmero entre el 0 y el 2: ");
			Scanner entrada = new Scanner(System.in);
			entradaUsuario = entrada.nextInt();
			
			if(entradaUsuario >= 0 && entradaUsuario <= 2) {
				continuar = false;
			} else {
				System.out.println("Nœmero no v‡lido");
			}
		}
		
		return listaJuegos.get(entradaUsuario);
	}

}
