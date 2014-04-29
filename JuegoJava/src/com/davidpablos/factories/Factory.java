package com.davidpablos.factories;

import com.davidpablos.clases.JuegoAdivinaImpar;
import com.davidpablos.clases.JuegoAdivinaNumero;
import com.davidpablos.clases.JuegoAdivinaPar;

public class Factory {
	public static final JuegoAdivinaNumero 
					getInstanciaJuegoAdivinaNumero(int vidas) {
		return new JuegoAdivinaNumero(vidas);
	}
	
	public static final JuegoAdivinaPar getInstanciaJuegoAdivinaPar(int vidas) {
		return new JuegoAdivinaPar(vidas);
	}
	
	public static final JuegoAdivinaImpar getInstanciaJuegoAdivinaImpar(int vidas) {
		return new JuegoAdivinaImpar(vidas);
	}
	
}
