package com.davidpablos.herencia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.davidpablos.herencia.factories.Factory;

public class TestEmpresa {
	
	String nombre = "Lanbide S.A";
	int tamano = 100;
	
	int sueldo = 1000;
	String nombreEmpleado = "David";
	int idEmpleado = 0;
	
	Empresa empresa;
	Empleado empleado;
	
	@Before
	public void setUp() throws Exception {
		empresa = Factory.getInstanciaEmpresa(nombre, tamano);
//		empleado = Factory.getInstanciaEmpleado(empresa, nombreEmpleado, sueldo, idEmpleado);
	}

	@Test
	public void testEmpresa() {
		assertEquals("Constructor empresa 1", nombre, empresa.getNombre());
		assertEquals("Constructor empresa 2", tamano, empresa.getTamano());
		
	}
	
	@Test
	public void testEmpleado() {
		assertEquals("Constructor empleado 1", nombre, empleado.getEmpresa().getNombre());
		assertEquals("Constructor empleado 2", tamano, empleado.getEmpresa().getTamano());
		assertEquals("Constructor empleado 3", nombreEmpleado, empleado.getNombre());
		assertEquals("Constructor empleado 4", sueldo, empleado.getSueldo());
		assertEquals("Constructor empleado 5", idEmpleado, empleado.getIdEmpleado());
		String otroNombre = "Ataulfo";
		empleado.setNombre(otroNombre);
		assertEquals("Constructor empleado 6", otroNombre, empleado.getNombre());
		int otroSueldo = 900;
		empleado.setSueldo(otroSueldo);
		assertEquals("Constructor empleado 7", otroSueldo, empleado.getSueldo());
		
		
	}

}
