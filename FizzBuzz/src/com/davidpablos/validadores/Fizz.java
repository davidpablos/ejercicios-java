package com.davidpablos.validadores;

public class Fizz extends Validador{

	private static final String msg = "Fizz";
	
	public Fizz(){
		super(msg);
	}
	
	public boolean validar(int num){
		return num % 3 == 0;
	}
	
}
