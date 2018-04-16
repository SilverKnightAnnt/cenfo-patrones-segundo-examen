package com.renta.peliculas;

public class Alquiler {
	private Disco disco;
	private int diasAlquilado;

	public Alquiler(Disco pDisco, int pDiasAlquilado) {
		this.disco = pDisco;
		this.diasAlquilado = pDiasAlquilado;
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	public int getDiasAlquilado() {
		return diasAlquilado;
	}

	public void setDiasAlquilado(int diasAlquilado) {
		this.diasAlquilado = diasAlquilado;
	}
}
