package com.davidpablos.validator;

import com.davidpablos.exceptions.NumberNotValidException;

public class Buzz extends Validador{
	
	private static final String msg = "Buzz";
	
	public Buzz(){
		super(msg);
	}
	
	public boolean validar(int num) throws NumberNotValidException {
		super.validateException(num);
		return num % 5 == 0;
	}
}
