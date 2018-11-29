package ej_17_Ordenador;

import java.io.IOException;

import metodosGenerales.Try;

public class Ordenador {

	Try t = new Try();
	protected int ram;
	protected int disco_duro;
	protected String mod_procesador;
	protected float precio;

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getDisco_duro() {
		return disco_duro;
	}

	public void setDisco_duro(int disco_duro) throws IOException {
		Try t = new Try();
		boolean error = false;
		do {
			error = false;
			if (disco_duro % 5 != 0) {
				System.out.println("Introduzca una capacidad de disco viable (múltiplo de 5)");
				error = true;
				disco_duro = t.tryInt();
			} else {
				this.disco_duro = disco_duro;
			}
		} while (error == true);
	}

	public Ordenador() {
	}

	public Ordenador(int ram, int disco_duro, String mod_procesador, float precio) {
		this.ram = ram;
		this.disco_duro = disco_duro;
		this.mod_procesador = mod_procesador;
		this.precio = precio;
	}

	public String getMod_procesador() {
		return mod_procesador;
	}

	public void setMod_procesador(String mod_procesador) {
		this.mod_procesador = mod_procesador;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
