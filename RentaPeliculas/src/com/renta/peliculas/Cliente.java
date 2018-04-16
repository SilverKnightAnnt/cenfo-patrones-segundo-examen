package com.renta.peliculas;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private ArrayList<Alquiler> alquileres = FabricaRentas.crearArrayList();

	public Cliente() {
		
	}
	public Cliente(String pNombre) {
		this.nombre = pNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(ArrayList<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public void persist() {		

		PersistenciaClientes pc = FabricaRentas.crearPersistenciaClientes();
		pc.add(this);
	}

	public static Cliente get(String name) {
		
		PersistenciaClientes pc = FabricaRentas.crearPersistenciaClientes();
		return pc.get(name);
	}
}
