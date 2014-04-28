package com.davidpablos.herencia.clases;

import java.util.ArrayList;
import java.util.Iterator;

import com.davidpablos.herencia.exceptions.EmpleadoNotExistsException;
import com.davidpablos.herencia.exceptions.EmpresaCompletaException;
import com.davidpablos.herencia.exceptions.EmpresaVaciaException;
import com.davidpablos.herencia.interfaces.IEmpleado;
import com.davidpablos.herencia.interfaces.IEmpresa;

public class Empresa implements IEmpresa {
	
	private String nombre;
	private int tamano;
	private ArrayList<IEmpleado> listaEmpleados;
	private int nEmpleados = 0;

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
	public ArrayList<IEmpleado> getListaEmpleados() {
		// TODO Auto-generated method stub
		return this.listaEmpleados;
	}
	
	/**
	 * @param idEmpleado id de un empleado
	 */

	@Override
	public IEmpleado getEmpleado(int idEmpleado) throws EmpleadoNotExistsException {
		// TODO Auto-generated method stub
		IEmpleado empleado = this.buscarEmpleado(idEmpleado);
		
		if(empleado == null) {
			String msg = "El empleado de id "+ idEmpleado +" no existe.";
			throw new EmpleadoNotExistsException(msg);
		}
		
		return empleado;
	}
	
	/**
	 * @param idEmpleado id de un empleado
	 */

	@Override
	public void despideEmpleado(int idEmpleado) 
			throws EmpresaVaciaException, EmpleadoNotExistsException {
		// TODO Auto-generated method stub
		this.esVacia();
		
		IEmpleado empleado = this.getEmpleado(idEmpleado);
		
		if(empleado == null) {
			String msg = "El empleado de id "+ idEmpleado +" no existe.";
			throw new EmpleadoNotExistsException(msg);
		}
		
		this.listaEmpleados.remove(empleado);
		empleado.setIdEmpleado(-1);
		empleado.setSueldo(-1);
		empleado.setEmpresa(null);
	}
	
	private IEmpleado buscarEmpleado(int idEmpleado) {
		IEmpleado empleadoBuscado = null;
		ArrayList<IEmpleado> lst = this.getListaEmpleados(); 
		Iterator<IEmpleado> itr = lst.iterator();
		boolean encontrado = false;
		
		while(itr.hasNext() && !encontrado) {
			IEmpleado empleado = itr.next();
			if(empleado.getIdEmpleado() == idEmpleado) {
				empleadoBuscado = empleado;
				encontrado = true;
			}
		}
		
		return empleadoBuscado;
	}
	
	private void esVacia() throws EmpresaVaciaException {
		if(this.getListaEmpleados().size() == 0) {
			throw new EmpresaVaciaException("Error al despedir empleado: la empresa est‡ vac’a");
		}
	}
	
	private void esCompleta() throws EmpresaCompletaException {
		if(this.getListaEmpleados().size() == this.getTamano()) {
			throw new EmpresaCompletaException("Error al anadir empleado: la empresa est‡ completa");
		}
	}
	
	@Override
	public IEmpleado nuevoEmpleado(String nombre, int sueldo) throws EmpresaCompletaException {
		this.esCompleta();
//		this.existeEmpleado(empleado.getIdEmpleado());
		nEmpleados++;
		Empleado empleado = new Empleado(this, nombre, sueldo, nEmpleados);
		this.listaEmpleados.add(empleado);
		
		return empleado;
	}
	
}
