package com.davidpablos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.davidpablos.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {
	
	FizzBuzz fb;

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}
	
	@Test
	public void testCalcularNumero() {
		assertEquals("FizzBuzz 1", "1", fb.calcularFizzBuzzNumero(1));
		assertEquals("FizzBuzz 2", "2", fb.calcularFizzBuzzNumero(2));
		assertEquals("FizzBuzz 3", "Fizz", fb.calcularFizzBuzzNumero(3));
		assertEquals("FizzBuzz 4", "4", fb.calcularFizzBuzzNumero(4));
		assertEquals("FizzBuzz 5", "Buzz", fb.calcularFizzBuzzNumero(5));
		assertEquals("FizzBuzz 6", "Fizz", fb.calcularFizzBuzzNumero(6));
		assertEquals("FizzBuzz 7", "7", fb.calcularFizzBuzzNumero(7));
		assertEquals("FizzBuzz 8", "8", fb.calcularFizzBuzzNumero(8));
		assertEquals("FizzBuzz 9", "Fizz", fb.calcularFizzBuzzNumero(9));
		assertEquals("FizzBuzz 10", "Buzz", fb.calcularFizzBuzzNumero(10));
		assertEquals("FizzBuzz 15", "FizzBuzz", fb.calcularFizzBuzzNumero(15));
	}

	@Test
	public void testFizzBuzz() {
		assertEquals("FizzBuzz 1", "1", fb.print(1));
		assertEquals("FizzBuzz 3", "1 2 Fizz", fb.print(3));
		assertEquals("FizzBuzz 5", "1 2 Fizz 4 Buzz", fb.print(5));
		assertEquals("FizzBuzz 15", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", fb.print(15));
	}

}
