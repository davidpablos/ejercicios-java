package com.davidpablos.herencia.interfaces;

import java.util.ArrayList;

import com.davidpablos.herencia.exceptions.EmpleadoExisteException;
import com.davidpablos.herencia.exceptions.EmpleadoNotExistsException;
import com.davidpablos.herencia.exceptions.EmpresaCompletaException;
import com.davidpablos.herencia.exceptions.EmpresaVaciaException;

public interface IEmpresa {
	
	public String getNombre();
	public int getTamano();
	public ArrayList<IEmpleado> getListaEmpleados();
	public IEmpleado getEmpleado(int idEmpleado) throws EmpleadoNotExistsException;
	public void despideEmpleado(int num) throws EmpresaVaciaException, EmpleadoNotExistsException;
	public IEmpleado nuevoEmpleado(String nombre, int sueldo) throws EmpresaCompletaException;
	
}
