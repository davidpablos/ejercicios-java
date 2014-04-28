package com.davidpablos.herencia.factories;

import com.davidpablos.herencia.clases.Empleado;
import com.davidpablos.herencia.clases.Empresa;

public abstract class Factory {
	
	public static final Empresa getInstanciaEmpresa(String nombre, int tamano){
		return new Empresa(nombre, tamano);
	}
	
//	public static final Empleado getInstanciaEmpleado(IEmpresa empresa, String nombre, int sueldo){
//		return new Empleado(empresa, nombre, sueldo);
//	}

	public static final Empleado getInstanciaEmpleado(String nombre, int sueldo){
		return new Empleado(nombre, sueldo);
	}

}
