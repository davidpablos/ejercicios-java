package com.davidpablos.clases;

import java.util.ArrayList;
import java.util.Scanner;

import com.davidpablos.excepciones.JuegoException;
import com.davidpablos.factories.Factory;
import com.davidpablos.interfaces.IJugable;
import com.davidpablos.profesor.Teclado;

public class Application {
	
	private static int NUMJUEGOS = 3;
	private static int VIDAS = 5;
	private static JuegoAdivinaNumero juegoNumero;
	private static JuegoAdivinaPar juegoPar;
	private static JuegoAdivinaImpar juegoImpar;
	
	public static IJugable eligeJuego() throws JuegoException {
		juegoNumero = Factory.getInstanciaJuegoAdivinaNumero(VIDAS);
		juegoPar = Factory.getInstanciaJuegoAdivinaPar(VIDAS);
		juegoImpar = Factory.getInstanciaJuegoAdivinaImpar(VIDAS);
		ArrayList<IJugable> listaJuegos = new ArrayList<IJugable>(NUMJUEGOS);
		listaJuegos.add(juegoNumero);
		listaJuegos.add(juegoPar);
		listaJuegos.add(juegoImpar);
		
		System.out.println("Elija juego");
		int i = 0;
		for(IJugable j : listaJuegos){
			System.out.print(i + ": ");
			j.muestraNombre();
			i++;
		}
		
		boolean continuar = true;
		int entradaUsuario = 0;
		
		while(continuar) {
			System.out.print("Introduzca un nœmero entre el 0 y el 2: ");
//			Scanner entrada = new Scanner(System.in);
//			entradaUsuario = entrada.nextInt();
			
			entradaUsuario = Teclado.leeNumero();
			
			if(entradaUsuario >= 0 && entradaUsuario <= 2) {
				continuar = false;
			} else {
				System.out.println("Nœmero no v‡lido");
			}
		}
		
		return listaJuegos.get(entradaUsuario);
	}

}
