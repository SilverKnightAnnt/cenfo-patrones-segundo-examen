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

		// Ya no se llama a la clase Registrar, sino que se instancia la persistencia
		// respectiva
		// Registrar.add("Clientes", this);

		PersistenciaClientes pc = new PersistenciaClientes();
		pc.add(this);
	}

	public static Cliente get(String name) {

		// Ya no se llama a la clase Registrar, sino que se instancia la persistencia
		// respectiva
		// return (Cliente) Registrar.get("Clientes", name);

		// Y como pc ya devuelve un cliente no hace falta castearla de nuevo.
		PersistenciaClientes pc = new PersistenciaClientes();
		return pc.get(name);
	}
}
