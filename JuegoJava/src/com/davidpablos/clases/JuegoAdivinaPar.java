package com.davidpablos.clases;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
	
	public JuegoAdivinaPar(int vidas) {
		super(vidas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validaNumero(int numUsuario) {
		// TODO Auto-generated method stub
		if(numUsuario % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void muestraNombre() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un nœmero par");
	}

	@Override
	public void muestraInfo() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un nœmero par entre 1 y 10. Tienes " + this.getVidas() + " intentos");
	}
	
	@Override
	public void reiniciaPartida() {
		// TODO Auto-generated method stub
		this.setVidas(this.getVidasIniciales());
		this.setNumAAdivinar(this.genNumAleatorio());
	}

}
