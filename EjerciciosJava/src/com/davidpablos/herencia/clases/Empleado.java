package com.davidpablos.herencia.clases;

import com.davidpablos.herencia.exceptions.EmpleadoNotExistsException;
import com.davidpablos.herencia.exceptions.EmpresaVaciaException;
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
	
	public Empleado(String nombre, int sueldo){
		this.idEmpleado = -1;
		this.empresa = null;
		this.nombre = nombre;
		this.sueldo = sueldo;
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
	public void setIdEmpleado(int id) {
		// TODO Auto-generated method stub
		this.idEmpleado = id;
	}
	
	public void setEmpresa(IEmpresa empresa) {
		// TODO Auto-generated method stub
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		result += "======== EMPLEADO ========\n";
		result += "id: " + this.getIdEmpleado() + "\n";
		result += "Empresa: " + this.getEmpresa().getNombre() + "\n";
		result += "Nombre: " + this.getNombre() + "\n";
		result += "Sueldo: " + this.getSueldo() + "\n";
		result += "==========================\n";
		
		return result;
	}

	@Override
	public final void aumentarSueldo(int n) {
		// TODO Auto-generated method stub
		this.sueldo *= (1 + (n / 100));
	}

	@Override
	public void despedir() throws EmpresaVaciaException, EmpleadoNotExistsException {
		// TODO Auto-generated method stub
		this.getEmpresa().despideEmpleado(this.getIdEmpleado());
	}
	
	@Override
	public void ascender(IEjecutivo ejecutivo) {
		
//		IEmpleado empleado = this.getEmpleado(ejecutivo.getIdEmpleado());
//		
//		if(empleado != null){
//			this.empleados.set(this.empleados.indexOf(e), ejecutivo);
//		}
	}
}
