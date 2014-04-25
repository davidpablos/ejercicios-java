package com.davidpablos.validadores;

public class Mozz extends Validador {
	
	private static final String msg = "Mozz";
	
	public Mozz(){
		super(msg);
	}
	
	public boolean validar(int num){
		return num % 7 == 0;
	}
}
