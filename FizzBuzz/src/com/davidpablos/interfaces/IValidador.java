package com.davidpablos.interfaces;

import com.davidpablos.exceptions.NumberNotValidException;

public interface IValidador {
	
	public boolean validar(int num) throws NumberNotValidException;
	public String getOutput();
}
