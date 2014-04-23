package com.davidpablos.poo;

public class Complejo {
	private double pReal;
	private double pImaginaria;
	private static int instancias = 0;
	
	public Complejo(){
		this.pReal = 0;
		this.pImaginaria = 0;
		instancias++;
	}
	
	public Complejo(double pReal, double pImaginaria){
		this();
		
		this.pReal = pReal;
		this.pImaginaria = pImaginaria;
	}
	
	public double getPReal(){
		return this.pReal;
	}
	
	public double getPImaginaria(){
		return this.pImaginaria;
	}
	
	public static int getInstancias(){
		return instancias;
	}
	
	public void asignar(double x, double y){
		this.pReal = x;
		this.pImaginaria = y;
	}
	
	public void suma(Complejo b){
		this.pReal += b.getPReal();
		this.pImaginaria += b.getPImaginaria();
	}
	
	public static Complejo sumar(Complejo a, Complejo b){
		Complejo c = new Complejo(a.getPReal()+b.getPReal(), 
							a.getPImaginaria()+b.getPImaginaria());
		return c;
	}
	
	public void imprimir(){
		String signo;
		
		if (this.pImaginaria >= 0){
			signo = "+";
		}else{
			signo = "";
		}
		
		System.out.println(this.pReal + signo + this.pImaginaria+"i");
	}

	public boolean isEqual(Complejo a){
		boolean result = false;
		
		if (this.getPReal() == a.getPReal() && 
				this.getPImaginaria() == a.getPImaginaria()){
			result = true;
		}
		
		return result;
	}
	
	@Override
	public String toString(){
		String signo;
		
		if (this.pImaginaria >= 0){
			signo = "+";
		}else{
			signo = "";
		}
		
		return this.pReal + signo + this.pImaginaria+"i";
	}

}
