package com.davidpablos.validadores;

public class Buzz extends Validador{
	
	private static final String msg = "Buzz";
	
	public Buzz(){
		super(msg);
	}
	
	public boolean validar(int num){
		return num % 5 == 0;
	}
}
