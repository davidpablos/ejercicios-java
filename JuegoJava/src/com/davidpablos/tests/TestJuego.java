package com.davidpablos.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.davidpablos.clases.Application;
import com.davidpablos.clases.JuegoAdivinaImpar;
import com.davidpablos.clases.JuegoAdivinaNumero;
import com.davidpablos.clases.JuegoAdivinaPar;
import com.davidpablos.excepciones.JuegoException;
import com.davidpablos.interfaces.IJugable;

public class TestJuego {

	int VIDAS = 5;
	int NUMAADIVINAR = 3;
	int NUMPAR = 6;
	int NUMIMPAR = 7;
	JuegoAdivinaNumero juego;
	JuegoAdivinaNumero juego2;
	JuegoAdivinaPar juegoPar;
	JuegoAdivinaImpar juegoImpar;
	
	@Test
	public void testJuego1() {
//		juego = Factory.getInstanciaJuego(VIDAS);
//		
//		assertEquals("Get vidas juego1", 5, juego.getVidas());
//		juego.setVidas(juego.getVidas() - 1);
//		assertEquals("Get vidas juego1 restar", 4, juego.getVidas());
//		
//		juego2 = Factory.getInstanciaJuego(VIDAS);
//		assertEquals("Get vidas juego2", 5, juego2.getVidas());
//		assertEquals("Get vidas juego1", 4, juego.getVidas());
	}
	
	@Test
	public void testJuego2() {
		
//		juego = Factory.getInstanciaJuegoAdivinaNumero(VIDAS, NUMAADIVINAR);
//		
//		assertEquals("Get vidas juego1", 5, juego.getVidas());
//		assertEquals("quitaVida juego1", true, juego.quitaVida());
//		juego.reiniciaPartida();
//		assertEquals("Get vidas reiniciadas juego1", 5, juego.getVidas());
//		juego.actualizaRecord();
//		juego.actualizaRecord();
//		assertEquals("ActualizaRecord juego1", 5, juego.getRecord());
	}
	
	@Test
	public void testJuega() {
		
//		juego = Factory.getInstanciaJuegoAdivinaNumero(VIDAS, NUMAADIVINAR);
//		juego.juega();
	}
	
//	@Test
//	public void testJuegos() {
//		
//		juego = Factory.getInstanciaJuegoAdivinaNumero(VIDAS, NUMAADIVINAR);
//		juegoPar = Factory.getInstanciaJuegoAdivinaPar(VIDAS, NUMPAR);
//		juegoImpar = Factory.getInstanciaJuegoAdivinaImpar(VIDAS, NUMIMPAR);
//		
////		juegoPar.juega();
//		
////		juegoImpar.juega();
//		
//		juego.muestraNombre();
//		juego.muestraInfo();
//		
//		juegoPar.muestraNombre();
//		juegoPar.muestraInfo();
//		
//		juegoImpar.muestraNombre();
//		juegoImpar.muestraInfo();
//	}
	
	@Test
	public void testJugable() {

		IJugable juego;
		try {
			juego = Application.eligeJuego();
			System.out.print("Juego elegido:");
			juego.muestraNombre();
			System.out.print("Instrucciones del juego:");
			juego.muestraInfo();
			juego.juega();
		} catch (JuegoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
