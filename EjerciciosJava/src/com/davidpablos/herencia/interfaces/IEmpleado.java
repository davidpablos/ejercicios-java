package com.davidpablos.herencia.interfaces;

public interface IEmpleado {

	public String getNombre();
	public int getSueldo();
	public int getIdEmpleado();
	
	public void setNombre(String nombre);
	public void setSueldo(int sueldo);
	
	public String toString();
	
	public void aumentarSueldo(int n);
	
	public void despedir();
}
