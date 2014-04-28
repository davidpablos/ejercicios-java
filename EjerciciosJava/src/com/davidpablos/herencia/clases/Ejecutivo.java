package com.davidpablos.herencia.clases;

import com.davidpablos.herencia.interfaces.IEjecutivo;

public class Ejecutivo extends Empleado implements IEjecutivo {
	
	private int presupuesto;
	
	public Ejecutivo(Empresa empresa, String nombre, int sueldo, int idEmpleado) {
		super(empresa, nombre, sueldo, idEmpleado);
	}

	@Override
	public int getPresupuesto() {
		// TODO Auto-generated method stub
		return this.presupuesto;
	}

	@Override
	public void asignaPresupuesto(int presupuesto) {
		// TODO Auto-generated method stub
		this.presupuesto = presupuesto;
	}

	

}
