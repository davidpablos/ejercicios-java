package com.davidpablos.validator;

import com.davidpablos.exceptions.NumberNotValidException;

public class Fizz extends Validador{

	private static final String msg = "Fizz";
	
	public Fizz(){
		super(msg);
	}
	
	public boolean validar(int num) throws NumberNotValidException {
		super.validateException(num);
		return num % 3 == 0;
	}
	
}
