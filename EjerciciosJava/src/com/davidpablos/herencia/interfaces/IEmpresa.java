package com.davidpablos.herencia.interfaces;

import com.davidpablos.herencia.exceptions.TamanoNotValidException;

public interface IEmpresa {
	
	public String getNombre();
	public int getTamano();
	public IEmpleado getEmpleado(int num) throws TamanoNotValidException;
	public void despideEmpleado(int num) throws TamanoNotValidException;
	public void addEmpleado(IEmpleado empleado) throws TamanoNotValidException;
	
}
