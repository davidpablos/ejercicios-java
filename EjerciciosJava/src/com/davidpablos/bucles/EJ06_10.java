package com.davidpablos.bucles;

import java.util.Scanner;

public class EJ06_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double gradosCelsius;
		
		for(double gradosFarenheit=0; gradosFarenheit<=300; gradosFarenheit+=20){
			gradosCelsius = (5/9) * (gradosFarenheit - 32);
			System.out.println("Grados farenheit: "+ gradosFarenheit +". Grados celsius: "+ gradosCelsius);
		}

	}

}
