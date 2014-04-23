package com.davidpablos.funciones;

import java.util.ArrayList;
import java.util.Scanner;
import com.davidpablos.funciones.CalcularPrimos;

public class EJ08_22 {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num;
//		ArrayList<Integer> divPrimos = new ArrayList<Integer>();
//		System.out.print("Introduzca el nœmero: ");
//
//		Scanner entrada = new Scanner(System.in);
//		num = entrada.nextInt();
//
//		
//		for (int i = 2; i <= num; i++) {
//			boolean primo = true;
//			for (int j=2; j<i; j++){
//				if (i % j == 0){
//					primo = false;
//				}
//			}
//			
//			if (primo){
//				divPrimos.add(new Integer(i));
//			}
//		}
//		
//		divPrimos.toArray();
//		System.out.println("Array:" + divPrimos);
//	}
	
//	public static ArrayList<Integer> calcularPrimos(int num){
//		ArrayList<Integer> v = new ArrayList<Integer>();
//		
//		for (int i = 2; i <= num; i++) {
//			boolean primo = true;
//			for (int j=2; j<i; j++){
//				if (i % j == 0){
//					primo = false;
//				}
//			}
//			
//			if (primo){
//				v.add(new Integer(i));
//			}
//		}
//		
//		return v;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num;
//		ArrayList<Integer> divPrimos = new ArrayList<Integer>();
//		System.out.print("Introduzca el nœmero: ");
//
//		Scanner entrada = new Scanner(System.in);
//		num = entrada.nextInt();
//		divPrimos = calcularPrimos(num);
//		
//		divPrimos.toArray();
//		System.out.println("Array:" + divPrimos);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		ArrayList<Integer> divPrimos = new ArrayList<Integer>();
		System.out.print("Introduzca el nœmero: ");

		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
//		CalcularPrimos cp = new CalcularPrimos(num);
		divPrimos = CalcularPrimos.calcularPrimos(num);
		
		divPrimos.toArray();
		System.out.println("Array:" + divPrimos);
	}
}
