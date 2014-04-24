package com.davidpablos.fizzbuzz;

public class FizzBuzz {

	public FizzBuzz() {
	}
	
	public String calcularFizzBuzzNumero(int num){
		String result = "";
		if (num % 3 == 0 && num % 5 == 0){
			result = "FizzBuzz";
		}else if (num % 3 == 0){
			result = "Fizz";
		}else if (num % 5 == 0){
			result = "Buzz";
		}else{
			result = String.valueOf(num);
		}
		
		return result;
	}
	
	public String print(int num){
		String result = "";
		for (int i=1; i<=num; i++){
			if (i == 1){
				result = calcularFizzBuzzNumero(i);
			}else{
				result += " " + calcularFizzBuzzNumero(i);
			}
			
//			if (i != num){
//				result += " ";
//			}
		}
		
		return result;
	}
	
	

}
