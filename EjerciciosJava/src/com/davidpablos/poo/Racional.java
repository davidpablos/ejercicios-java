package com.davidpablos.poo;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional(){
		this.numerador = 1;
		this.denominador = 1;
	}
	
	public Racional(int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public int getNumerador(){
		return this.numerador;
	}
	
	public int getDenominador(){
		return this.denominador;
	}
	
	public void asignaNumerador(int x){
		this.numerador = x;
	}
	
	public void asignaDenominador(int y){
		if (y != 0){
			this.denominador = y;
		}else{
			System.out.println("Cuidado! El denominador no puede ser 0");
		}
	}
	
	public void imprimir(){
		
	}
	
	@Override
	public String toString(){
		return this.getNumerador() +"/"+ this.getDenominador();
	}
	
	public Racional suma(Racional b){
		Racional r = new Racional();
		
		r.asignaNumerador(this.getNumerador() * b.getDenominador() + b.getNumerador() * this.getDenominador());
		r.asignaDenominador(this.getDenominador() * b.getDenominador());
		return r;
	}
	
	public Racional resta(Racional b){
		Racional r = new Racional();
		r.asignaNumerador(this.getNumerador() * b.getDenominador() - b.getNumerador() * this.getDenominador());
		r.asignaDenominador(this.getDenominador() * b.getDenominador());
		
		return r;
	}
	
	public Racional multiplicacion(Racional b){
		Racional r = new Racional();
		r.asignaNumerador(this.getNumerador() * b.getNumerador());
		r.asignaDenominador(this.getDenominador() * b.getDenominador());
		
		return r;
	}
	
	public Racional division(Racional b){
		Racional r = new Racional();
		r.asignaNumerador(this.getNumerador() + b.getDenominador());
		r.asignaDenominador(this.getDenominador() + b.getNumerador());
		
		return r;
	}
}
