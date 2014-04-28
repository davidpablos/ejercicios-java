package com.davidpablos.herencia.interfaces;

import com.davidpablos.herencia.exceptions.EmpleadoNotExistsException;
import com.davidpablos.herencia.exceptions.EmpresaVaciaException;

public interface IEmpleado {

	public String getNombre();
	public int getSueldo();
	public int getIdEmpleado();
	
	public void setNombre(String nombre);
	public void setSueldo(int sueldo);
	public void setIdEmpleado(int id);
	
	public String toString();
	
	public void aumentarSueldo(int n);
	public void despedir() throws  EmpresaVaciaException, EmpleadoNotExistsException;
	public void ascender();
	public void setEmpresa(IEmpresa iEmpresa);
}
