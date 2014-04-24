package com.davidpablos.validadores;

import com.davidpablos.interfaces.IValidacion;

public abstract class Validador implements IValidacion{
	private String texto;

	public abstract boolean esMultiplo(int num);
	
	public String devolverTexto(){
		return this.texto;
	}
}
