package com.davidpablos.herencia.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.davidpablos.herencia.clases.Empleado;
import com.davidpablos.herencia.clases.Empresa;
import com.davidpablos.herencia.exceptions.EmpleadoNotExistsException;
import com.davidpablos.herencia.exceptions.EmpresaCompletaException;
import com.davidpablos.herencia.factories.Factory;

public class TestEmpresa {
	
	String nombreEmpresa1 = "Lanbide S.A";
	int tamanoEmpresa1 = 100;
	
	int sueldo = 1000;
	String nombreEmpleado1 = "David";
	int idEmpleado = 0;
	
	Empresa empresa1;
	Empresa empresa2;
	Empresa empresa3;
	
	Empleado empleado1;
	
	@Before
	public void setUp() throws Exception {
		empresa1 = Factory.getInstanciaEmpresa(nombreEmpresa1, tamanoEmpresa1);
		empleado1 = Factory.getInstanciaEmpleado(nombreEmpleado1, sueldo);
	}

	@Test
	public void testEmpresa() {
		assertEquals("Constructor empresa 1", nombreEmpresa1, empresa1.getNombre());
		assertEquals("Constructor empresa 2", tamanoEmpresa1, empresa1.getTamano());
		assertEquals("Constructor empresa 3", 0, empresa1.getListaEmpleados().size());
	}
	
	@Test
	public void testEmpleado() {
		// Campos de empleado por defecto
		assertEquals("Nombre empleado", nombreEmpleado1, 
				empleado1.getNombre());
		assertEquals("Sueldo empleado", 1000, empleado1.getSueldo());
		assertEquals("Id empleado", -1, empleado1.getIdEmpleado());
		assertEquals("Nombre empresa empleado", null, empleado1.getEmpresa());
	}
	
	@Test
	public void testNuevoEmpleado() {
		
		try {
			// Sin errores
			empresa1.nuevoEmpleado(nombreEmpleado1, sueldo);
			
			Empleado empleadoAnadido = (Empleado) empresa1.getEmpleado(1);
			
			assertEquals("Sueldo después de anadir a la empresa", 1000, 
					empleadoAnadido.getSueldo());
			assertEquals("Tamano lista empleados después de anadir 1 empleado: ",
					1, empresa1.getListaEmpleados().size());
			assertEquals("Empresa del empleado", nombreEmpresa1, 
					empleadoAnadido.getEmpresa().getNombre());
			assertEquals("Tamano empresa", tamanoEmpresa1, 
					empleadoAnadido.getEmpresa().getTamano());
			
		} catch (EmpresaCompletaException e) {
			assertTrue(false);
			e.printStackTrace();
		} catch (EmpleadoNotExistsException e) {
			assertTrue(false);
			e.printStackTrace();
		}
		
		try {
			// La empresa está completa
			int i = 0;
			for(i=0; i<tamanoEmpresa1-1; i++) {
				empresa1.nuevoEmpleado(nombreEmpleado1, sueldo);
			}
			
			empresa1.nuevoEmpleado(nombreEmpleado1, sueldo);
			
			assertTrue(false);
		} catch (EmpresaCompletaException e) {
			assertTrue(true);
		}
	}
	
//	@Test
//	public void testEmpleado2() {
//		assertEquals("Constructor empleado 3", nombreEmpleado1, empleado1.getNombre());
//		assertEquals("Constructor empleado 1", nombreEmpresa1, empleado1.getEmpresa().getNombre());
//		assertEquals("Constructor empleado 2", tamanoEmpresa1, empleado1.getEmpresa().getTamano());
//		
////		assertEquals("Constructor empleado 5", idEmpleado, empleado1.getIdEmpleado());
////		String otroNombre = "Ataulfo";
////		empleado1.setNombre(otroNombre);
////		assertEquals("Constructor empleado 6", otroNombre, empleado1.getNombre());
////		int otroSueldo = 900;
////		empleado1.setSueldo(otroSueldo);
////		assertEquals("Constructor empleado 7", otroSueldo, empleado1.getSueldo());		
//	}
	
	@Test
	public void testGetEmpleado() {
				
	}

}
