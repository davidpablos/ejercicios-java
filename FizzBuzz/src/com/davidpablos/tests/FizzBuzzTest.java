package com.davidpablos.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.davidpablos.fizzbuzz.FizzBuzz;
import com.davidpablos.validator.Buzz;
import com.davidpablos.validator.Fizz;
import com.davidpablos.validator.Mozz;

public class FizzBuzzTest {
	
	FizzBuzz fb;
	Fizz fizz;
	Buzz buzz;
	Mozz mozz;

	@Before
	public void setUp() throws Exception {
		
		fb = new FizzBuzz();
		fizz = new Fizz();
		buzz = new Buzz();
		mozz = new Mozz();
	}

//	@Test
//	public void testDivisores() {
//		assertEquals("1",false,fb.divisor3(1));
//		assertEquals("3",true,fb.divisor3(3));
//		assertEquals("1",false,fb.divisor5(1));
//		assertEquals("5",true,fb.divisor5(5));
//		
//	}
	
	@Test
	public void testFizz() {
		assertEquals("Fizz", "Fizz", fizz.getOutput());
		
		assertFalse("Fizz: 1", fizz.validar(1));
		assertTrue("Fizz: 3", fizz.validar(3));
		assertFalse("Fizz: 4", fizz.validar(4));
		assertFalse("Fizz: 5", fizz.validar(5));
		assertTrue("Fizz: 6", fizz.validar(6));
		assertTrue("Fizz: 15", fizz.validar(15));
		
	}
	
	@Test
	public void testBuzz() {
		assertEquals("Buzz", "Buzz", buzz.getOutput());
		
		assertFalse("Buzz: 1", buzz.validar(1));
		assertTrue("Buzz: 5", buzz.validar(5));
		assertFalse("Buzz: 7", buzz.validar(7));
		assertTrue("Buzz: 10", buzz.validar(10));
		assertTrue("Buzz: 15", buzz.validar(15));
	}
	
	@Test
	public void testMozz() {
		assertEquals("Mozz", "Mozz", mozz.getOutput());
		
		assertFalse("Mozz: 1", mozz.validar(1));
		assertFalse("Mozz: 5", mozz.validar(5));
		assertTrue("Mozz: 7", mozz.validar(7));
		assertFalse("Mozz: 10", mozz.validar(10));
		assertTrue("Mozz: 14", mozz.validar(14));
	}
	
	@Test
	public void testObtener() {
		assertEquals("1","1",fb.obtenerTexto(1));
		assertEquals("3","Fizz",fb.obtenerTexto(3));
		assertEquals("5","Buzz",fb.obtenerTexto(5));
		assertEquals("15","FizzBuzz",fb.obtenerTexto(15));
		assertEquals("105","FizzBuzzMozz",fb.obtenerTexto(105));
	}
	
	
	@Test
	public void testFizzBuzz() {
		assertEquals("1","1",fb.calcular(1));
		assertEquals("2","1 2",fb.calcular(2));
		assertEquals("3","1 2 Fizz",fb.calcular(3));
		assertEquals("4","1 2 Fizz 4",fb.calcular(4));
		assertEquals("5","1 2 Fizz 4 Buzz",fb.calcular(5));
		assertEquals("6","1 2 Fizz 4 Buzz Fizz",fb.calcular(6));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz",fb.calcular(7));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz 8",fb.calcular(8));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz",fb.calcular(9));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz",fb.calcular(10));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11",fb.calcular(11));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz",fb.calcular(12));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13",fb.calcular(13));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz",fb.calcular(14));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz",fb.calcular(15));
		assertEquals("7","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz 16",fb.calcular(16));
		
	}

}
