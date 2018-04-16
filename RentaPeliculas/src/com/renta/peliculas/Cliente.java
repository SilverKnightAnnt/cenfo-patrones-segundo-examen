package com.renta.peliculas;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private ArrayList<Alquiler> alquileres = new ArrayList<>();

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

		PersistenciaClientes pc = new PersistenciaClientes();
		pc.add(this);
	}

	public static Cliente get(String name) {
		
		PersistenciaClientes pc = new PersistenciaClientes();
		return pc.get(name);
	}
}
