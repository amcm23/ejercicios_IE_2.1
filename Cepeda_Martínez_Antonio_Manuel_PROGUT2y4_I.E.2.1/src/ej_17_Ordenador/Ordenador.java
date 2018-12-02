package ej_17_Ordenador;

import java.io.IOException;

import metodosGenerales.Try;

public class Ordenador {

	Try t = new Try(); // instancia la clase trycatch
	/**
	 * Atributo cantidad de memoria ram (gb) del ordenador
	 */
	protected int ram;
	/**
	 * Atributo capacidad del disco duro (mb) del ordenador
	 */
	protected int disco_duro;
	/**
	 * Atributo modelo del procesador del ordenador
	 */
	protected String mod_procesador;
	/**
	 * Atributo precio del ordenador (€)
	 */
	protected float precio;

	/**
	 * Método que retorna la cantidad de memoria ram
	 * 
	 * @return
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * Método que inserta la cantidad de ram por parámetro
	 * 
	 * @param ram
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * Método que retorna la capacidad del disco duro
	 * 
	 * @return
	 */
	public int getDisco_duro() {
		return disco_duro;
	}

	/**
	 * Método que inserta una capacidad de disco duro múltiplo de 5 por parámetro y
	 * evita meter capacidad no múltiplo
	 * 
	 * @param disco_duro
	 * @throws IOException
	 */
	public void setDisco_duro(int disco_duro) throws IOException {
		Try t = new Try(); // instancia la clase trycatch
		boolean error = false;
		do {
			error = false;
			if (disco_duro % 5 != 0) {
				System.out.println("Introduzca una capacidad de disco viable (múltiplo de 5)");
				error = true;
				disco_duro = t.tryMinInt(0);
			} else {
				this.disco_duro = disco_duro;
			}
		} while (error == true);
	}

	/**
	 * Constructor vacío
	 */
	public Ordenador() {
	}

	/**
	 * Constructor con 4 parámetros
	 * 
	 * @param ram            Cantidad de RAM
	 * @param disco_duro     Capacidad del disco duro
	 * @param mod_procesador Modelo del procesador
	 * @param precio         Precio del ordenador
	 */
	public Ordenador(int ram, int disco_duro, String mod_procesador, float precio) {
		this.ram = ram;
		this.disco_duro = disco_duro;
		this.mod_procesador = mod_procesador;
		this.precio = precio;
	}

	/**
	 * Método que retorna el modelo del procesador
	 * 
	 * @return
	 */
	public String getMod_procesador() {
		return mod_procesador;
	}

	/**
	 * Método que inserta el modelo del procesador por parámetro
	 * 
	 * @param mod_procesador
	 */
	public void setMod_procesador(String mod_procesador) {
		this.mod_procesador = mod_procesador;
	}

	/**
	 * Método que retorna el precio
	 * 
	 * @return
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Método que inserta el precio por parámetro
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
