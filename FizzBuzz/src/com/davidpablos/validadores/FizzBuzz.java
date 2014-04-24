package com.davidpablos.validadores;

import java.util.ArrayList;

import com.davidpablos.fizzbuzz.Buzz;
import com.davidpablos.fizzbuzz.Fizz;
import com.davidpablos.interfaces.IValidacion;

public class FizzBuzz {
	private String texto = "FizzBuzz";
	private ArrayList <IValidacion> listaValidadores = new  ArrayList<IValidacion>();
	Fizz f;
	Buzz b;
	
	public FizzBuzz() {
		f = new Fizz();
		b = new Buzz();
		listaValidadores.add((IValidacion) f);
		listaValidadores.add((IValidacion) b);
	}
	
	public String calcularFizzBuzzNumero(int num){
		String result = "";
//		if (f.esMultiploDe3(num) && b.esMultiploDe5(num)){
//			result += texto;
//		}else if (f.esMultiploDe3(num)){
//			result = f.devolverTexto();
//		}else if (b.esMultiploDe5(num)){
//			result = b.devolverTexto();
//		}else{
//			result = String.valueOf(num);
//		}
		

			for (IValidacion v : listaValidadores) {
				if (v.esMultiplo(num)){
					result += v.devolverTexto();
				}
				else
				{result = String.valueOf(num);
				}
			}
		
		
		return result;
	}
	
	public String print(int num){
		String result = "";
		for (int i=1; i<=num; i++){
				result += calcularFizzBuzzNumero(i);
			
			
			if (i != num) result += " ";
		}
		
		return result;
	}
	
	

}
