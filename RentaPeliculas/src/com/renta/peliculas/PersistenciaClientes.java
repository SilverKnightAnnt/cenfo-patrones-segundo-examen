package com.renta.peliculas;

import java.util.HashMap;

public class PersistenciaClientes implements Registrar {

	private static HashMap Clientes = new HashMap();

	@Override
	public Cliente get(String nombre) {

		return (Cliente) Clientes.get(nombre);
	}

	@Override
	public void add(Object objeto) {

		Cliente nuevoCliente = (Cliente) objeto;
		Clientes.put(nuevoCliente.getNombre(), nuevoCliente);
	}
}
