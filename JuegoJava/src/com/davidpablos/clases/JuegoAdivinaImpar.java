package com.davidpablos.clases;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int vidas) {
		super(vidas);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean validaNumero(int numUsuario) {
		// TODO Auto-generated method stub
		if(numUsuario % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void muestraNombre() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un nœmero impar");
	}

	@Override
	public void muestraInfo() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un nœmero impar entre 1 y 10. Tienes " + this.getVidas() + " intentos");
	}
	
	@Override
	public void reiniciaPartida() {
		// TODO Auto-generated method stub
		this.setVidas(this.getVidasIniciales());
		this.setNumAAdivinar(this.genNumAleatorio());
	}

}
