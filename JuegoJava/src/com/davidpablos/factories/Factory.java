package com.davidpablos.factories;

import com.davidpablos.clases.JuegoAdivinaImpar;
import com.davidpablos.clases.JuegoAdivinaNumero;
import com.davidpablos.clases.JuegoAdivinaPar;

public class Factory {
	public static final JuegoAdivinaNumero 
					getInstanciaJuegoAdivinaNumero(int vidas, int numAAdivinar) {
		return new JuegoAdivinaNumero(vidas);
	}
	
	public static final JuegoAdivinaPar getInstanciaJuegoAdivinaPar(int vidas, int numAAdivinar) {
		return new JuegoAdivinaPar(vidas, numAAdivinar);
	}
	
	public static final JuegoAdivinaImpar getInstanciaJuegoAdivinaImpar(int vidas, int numAAdivinar) {
		return new JuegoAdivinaImpar(vidas, numAAdivinar);
	}
	
}
