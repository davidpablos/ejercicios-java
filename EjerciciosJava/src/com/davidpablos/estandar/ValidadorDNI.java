package com.davidpablos.estandar;

public class ValidadorDNI {
	public static final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";
	private String nif;
	
	public ValidadorDNI(String nif){
		this.nif = nif;
	}
	
	public boolean validarDNI(){
		boolean valido = false;
		if (validarLongitud() && validarDigitos() && validarEsLetra()){
			valido = true;
		}
		
		return valido;
	}
	
	private boolean validarLongitud(){
		boolean result = true;
		if (this.nif.length() != 9){
			result = false;
		}

		return result;
	}
	
	private boolean validarDigito(char c){
		boolean result = true;
		if (!Character.isDigit(c)){
			result = false;
		}
		
		return result;
	}
	
	private boolean validarLetra(char c){
		boolean result = true;
		if (!Character.isLetter(c)){
			result = false;
		}
		
		return result;
	}
	
	private String getDigitos(){
		String digitos = this.nif.substring(0, this.nif.length()-1);
		return digitos;
	}
	
	private boolean validarDigitos(){
		boolean result = true;
		String digitos = getDigitos();

		for (int i=0; i<digitos.length(); i++){
			if (!validarDigito(digitos.charAt(i))){
				result = false;
			}
		}
		return result;
	}
	
	private boolean validarEsLetra(){
		boolean result = true;
		if (!validarLetra(this.nif.charAt(this.nif.length()-1))){
			result = false;
		}
		return result;
	}
	
//	public boolean letraDNIValida() {
//		boolean result = false;
//		
//		int modulo = getDigitos() % 23;
//		
//		if (modulo){
//			
//		}
//		
//		return String.valueOf(getDigitos()) + NIF_STRING_ASOCIATION.charAt(getDigitos() % 23);
//	}
	
}
