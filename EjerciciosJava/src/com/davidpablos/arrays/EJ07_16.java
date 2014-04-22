package com.davidpablos.arrays;

import java.util.Scanner;

public class EJ07_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i=1; i<=array.length; i++){
			int number = (int) (100*Math.random()+1);
			array[i]  = number;
			
			if (number <= min){
				min = number;
			}
			
			if (number >= max){
				max = number;
			}
			
			i++;
		}
		
		System.out.println("El m‡ximo del array es: "+ max);
		System.out.println("El min del array es: "+ min);
	}

}
