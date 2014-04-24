package com.davidpablos.validadores;

public class Buzz extends Validador{
	private String texto = "Buzz";

	@Override
	public boolean esMultiplo(int num) {
		return (num % 5 == 0);
	}
}
