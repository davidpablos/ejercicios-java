package com.davidpablos.clases;

import com.davidpablos.interfaces.IJuego;

public abstract class Juego implements IJuego {

	private int vidasIniciales;
	private int vidas;
	private static int record = 0;
	
	public Juego(int vidas) {
		this.vidasIniciales = vidas;
		this.vidas = vidasIniciales;
	}
	
	public int getVidas() {
		return this.vidas;
	}
	
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	public int getRecord() {
		return record;
	}
	
	public int getVidasIniciales() {
		return this.vidasIniciales;
	}

	@Override
	public void muestraVidasRestantes() {
		// TODO Auto-generated method stub
		System.out.println("El nœmero de vidas restantes es:" + this.getVidas());
	}

	@Override
	public boolean quitaVida() {
		// TODO Auto-generated method stub
		boolean quedanVidas = true;
		this.vidas -= 1;
		if(this.vidas == 0) {
			quedanVidas = false;
			System.out.println("Juego Terminado");
		}
		return quedanVidas;
	}

	@Override
	public void reiniciaPartida() {
		// TODO Auto-generated method stub
		this.vidas = this.vidasIniciales;
	}

	@Override
	public void actualizaRecord() {
		// TODO Auto-generated method stub
		if(this.vidas == record) {
			record = this.vidas;
			System.out.println("Has igualado el rŽcord!: " + this.getVidas() + " vidas");
		} else if(this.vidas > record) {
			record = this.vidas;
			System.out.println("NUEVO RECORD: " + this.getVidas() + " vidas");
		}
	}
}
