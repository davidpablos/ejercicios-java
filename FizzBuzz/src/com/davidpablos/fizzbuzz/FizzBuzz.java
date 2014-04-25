package com.davidpablos.fizzbuzz;

import java.util.ArrayList;

import com.davidpablos.factories.ValidadorFactory;
import com.davidpablos.interfaces.IValidador;

public class FizzBuzz {
	private ArrayList<IValidador> validadores;
	
	public FizzBuzz() {
		validadores = new ArrayList<IValidador>();
		validadores.add(ValidadorFactory.getFizzValidador());
		validadores.add(ValidadorFactory.getBuzzValidador());
		validadores.add(ValidadorFactory.getMozzValidador());
	}
	
	public String calcular(int num) {
		String res="";
		
		for(int i=1; i<=num; i++) {
			if (i != 1) {
				res += " ";
			}
			res += obtenerTexto(i);	
		}
		
		return res;
		
	}
	
	public String obtenerTexto(int num){
		String pal = "";
		
		for (IValidador validador : validadores){
			if (validador.validar(num)){
				pal += validador.getOutput();
			}
		}
		
		if (pal.length() == 0){
			pal += String.valueOf(num);
		}
		
		
		return pal;
	}
	
}