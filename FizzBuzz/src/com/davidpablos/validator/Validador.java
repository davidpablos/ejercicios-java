package com.davidpablos.validator;

import com.davidpablos.exceptions.NumberNotValidException;
import com.davidpablos.interfaces.IValidador;

public abstract class Validador implements IValidador {
	
	private String output;
	
	public Validador(String msg) {
		this.output = msg;
	}
	
	public abstract boolean validar(int num) throws NumberNotValidException;
	
	protected void validateException(int num) throws NumberNotValidException {
		if(num < 1) {
			throw new NumberNotValidException("Nœmero no v‡lido: es menor que 1");
		}
	}
	
	@Override
	public String getOutput() {
		return output;
	}

}
