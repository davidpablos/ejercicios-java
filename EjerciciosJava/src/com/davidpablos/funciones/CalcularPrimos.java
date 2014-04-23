package com.davidpablos.funciones;

import java.util.ArrayList;

/**
 * 
 * @author imac6
 * Clase abstract, no se puede instanciar
 */
public abstract class CalcularPrimos {

	public static ArrayList<Integer> calcularPrimos(int num){
		ArrayList<Integer> v = new ArrayList<Integer>();
		
		for (int i = 2; i <= num; i++) {
			boolean primo = true;
			for (int j=2; j<i; j++){
				if (i % j == 0){
					primo = false;
				}
			}
			
			if (primo){
				v.add(new Integer(i));
			}
		}
		
		return v;
	}
}
