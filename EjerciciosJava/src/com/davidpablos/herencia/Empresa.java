package com.davidpablos.herencia;

import java.util.ArrayList;

import com.davidpablos.herencia.exceptions.TamanoNotValidException;
import com.davidpablos.herencia.interfaces.IEmpleado;
import com.davidpablos.herencia.interfaces.IEmpresa;

public class Empresa implements IEmpresa {
	
	private String nombre;
	private int tamano;
	private ArrayList<IEmpleado> listaEmpleados;
	public int nEmpleados = 0;

	public Empresa(String nombre, int tamano){
		this.nombre = nombre;
		this.tamano = tamano;
		this.listaEmpleados = new ArrayList<IEmpleado>();
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public int getTamano() {
		// TODO Auto-generated method stub
		return this.tamano;
	}

	@Override
	public IEmpleado getEmpleado(int num) throws TamanoNotValidException {
		// TODO Auto-generated method stub
		this.comprobarTamano(num);
		return this.listaEmpleados.get(num);
	}

	@Override
	public void despideEmpleado(int num) throws TamanoNotValidException {
		// TODO Auto-generated method stub
		this.comprobarTamano(num);
		this.listaEmpleados.remove(num);
	}
	
	private void comprobarTamano(int num) throws TamanoNotValidException {
		if(num < 0) {
			throw new TamanoNotValidException("Nœmero no v‡lido: es menor que 0");
		}else if(num > this.tamano) {
			throw new TamanoNotValidException("Nœmero no v‡lido: es mayor que el tama–o de la empresa");
		}
	}
	
	private void comprobarNumEmpleados(int num) throws TamanoNotValidException {
		if(num < 1) {
			throw new TamanoNotValidException("Nœmero no v‡lido: es igual a 1");
		}else if(num == this.tamano) {
			throw new TamanoNotValidException("Nœmero no v‡lido: empresa completa");
		}
	}
	
	public void addEmpleado(IEmpleado empleado) throws TamanoNotValidException{
		this.comprobarNumEmpleados(nEmpleados);
		this.listaEmpleados.add(empleado);
		nEmpleados++;
	}
	
}
