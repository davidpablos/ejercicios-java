package com.davidpablos.estandar;

public class PruebaDNI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidadorDNI validadorDNI = new ValidadorDNI("80611315H");
		System.out.println(validadorDNI.validarDNI());
	}

}
