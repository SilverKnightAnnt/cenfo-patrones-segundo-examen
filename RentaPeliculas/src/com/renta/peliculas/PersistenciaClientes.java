package com.renta.peliculas;

import java.util.HashMap;

/*Ahora esta clase solo maneja la persistencia de los clientes 
y por ende no hace falta que reciba una colección.*/

public class PersistenciaClientes implements Registrar {

	private static HashMap Clientes = new HashMap();

	// Como ahora solo se manejan clientes, este método puede devolver de una vez el
	// cliente
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
