package com.davidpablos.herencia;

import com.davidpablos.herencia.interfaces.IEmpleado;
import com.davidpablos.herencia.interfaces.IEmpresa;

public class Empleado implements IEmpleado {
	
	private int idEmpleado;
	private IEmpresa empresa;
	private String nombre;
	private int sueldo;

	protected Empleado(IEmpresa empresa, String nombre, int sueldo){
		this.empresa = empresa;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public Empleado(IEmpresa empresa, String nombre, int sueldo, int idEmpleado){
		this(empresa, nombre, sueldo);
		this.idEmpleado = idEmpleado;
	}
	
	public IEmpresa getEmpresa() {
		return this.empresa;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public int getSueldo() {
		// TODO Auto-generated method stub
		return this.sueldo;
	}

	@Override
	public int getIdEmpleado() {
		// TODO Auto-generated method stub
		return this.idEmpleado;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;
	}

	@Override
	public void setSueldo(int sueldo) {
		// TODO Auto-generated method stub
		this.sueldo = sueldo;
	}

	@Override
	public final void aumentarSueldo(int n) {
		// TODO Auto-generated method stub
		this.sueldo *= (1 + (100 * n));
	}

	@Override
	public void despedir() {
		// TODO Auto-generated method stub
		
	}
}
