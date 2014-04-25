package com.davidpablos.factories;

import com.davidpablos.validadores.Buzz;
import com.davidpablos.validadores.Fizz;
import com.davidpablos.validadores.Mozz;

public abstract class ValidadorFactory {

	public static final Fizz getFizzValidador(){
		Fizz f = new Fizz();
		return f;
	}
	
	public static final Buzz getBuzzValidador(){
		Buzz b = new Buzz();
		return b;
	}
	
	public static final Mozz getMozzValidador(){
		Mozz m = new Mozz();
		return m;
	}
	
}
