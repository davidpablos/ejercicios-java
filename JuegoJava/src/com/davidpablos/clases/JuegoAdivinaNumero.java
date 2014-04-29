package com.davidpablos.clases;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.davidpablos.interfaces.IJuegoAdivinaNumero;
import com.davidpablos.interfaces.IJugable;

public class JuegoAdivinaNumero extends Juego implements IJuegoAdivinaNumero, IJugable {
	
	private int numAAdivinar;
	private Random random;

	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
		// TODO Auto-generated constructor stub
		this.numAAdivinar = genNumAleatorio();
	}
	
	public int getNumAAdivinar() {
		return this.numAAdivinar;
	}
	
	public Random getRandom() {
		return this.random;
	}
	
	public void setRandom(Random random) {
		this.random = random;
	}
	
	public void setNumAAdivinar(int numAAdivinar) {
		this.numAAdivinar = numAAdivinar;
	}

	@Override
	public void juega() {
		// TODO Auto-generated method stub
		int entradaUsuario;
		boolean continuar = true;
		this.reiniciaPartida();
		while(continuar) {
			System.out.print("Introduzca un nœmero entre el 1 y el 10: ");
			Scanner entrada = new Scanner(System.in);
			entradaUsuario = entrada.nextInt();
			
			if(this.validaNumero(entradaUsuario)) {
				if(entradaUsuario == this.numAAdivinar) {
					System.out.println("Acertaste!");
					this.actualizaRecord();
					continuar = false;
				} else if(entradaUsuario > this.numAAdivinar) {
					continuar = continuaJuego("El nœmero es menor que " + entradaUsuario);

				} else {
					continuar = continuaJuego("El nœmero es mayor que " + entradaUsuario);
				}			
			} else {
				continuar = continuaJuego("El nœmero " + entradaUsuario + " es incorrecto");
			}
			

		}
		
		if(this.getVidas() == 0) {
			System.out.println("Has perdido");
		}
	}
	
	public boolean continuaJuego(String msg){
		boolean result = true;
		
		if(this.quitaVida()) {
			System.out.println(msg);
		} else {
			result = false;
		}
		
		return result;
	}
	
	@Override
	public void reiniciaPartida() {
		// TODO Auto-generated method stub
		this.setVidas(this.getVidasIniciales());
		this.numAAdivinar = genNumAleatorio();
	}

	@Override
	public void muestraNombre() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un nœmero");
	}

	@Override
	public void muestraInfo() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un nœmero entre 1 y 10. Tienes " + this.getVidas() + " intentos");
	}

	@Override
	public boolean validaNumero(int numUsuario) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public int genNumAleatorio() {
		this.setRandom(new Random((new Date()).getTime()));
		int aleatorio = this.getRandom().nextInt(10);
		while(!this.validaNumero(aleatorio)){
			aleatorio = this.getRandom().nextInt(10);
		}
		return aleatorio;
		
	}

}
