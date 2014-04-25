package com.davidpablos.factories;

import com.davidpablos.validator.Buzz;
import com.davidpablos.validator.Fizz;
import com.davidpablos.validator.Mozz;

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
