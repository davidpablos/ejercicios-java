package com.davidpablos.validator;

import com.davidpablos.exceptions.NumberNotValidException;

public class Mozz extends Validador {
	
	private static final String msg = "Mozz";
	
	public Mozz(){
		super(msg);
	}
	
	public boolean validar(int num) throws NumberNotValidException {
		super.validateException(num);
		return num % 7 == 0;
	}
}
