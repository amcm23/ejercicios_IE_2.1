package ej_02_vehículo;

public class Vehiculo {

	/**
	 * Atributo modelo del coche
	 */
	private String modelo;
	/**
	 * Atributo potencia del coche
	 */
	private double potencia;
	/**
	 * Atributo (tiene/no tiene) tracción a las 4 ruedas
	 */
	private boolean cRuedas;

	/**
	 * Constructor con 1 parámetro
	 * 
	 * @param modelo Modelo del coche
	 */
	Vehiculo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Método que retorna la potencia del coche
	 * 
	 * @return potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * Introduce el parámetro en la potencia del coche
	 * 
	 * @param potencia
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * booleano que retorna true/false si tiene tracción a las 4 ruedas
	 * 
	 * @return cRuedas
	 */
	public boolean iscRuedas() {
		return cRuedas;
	}

	/**
	 * Introduce el parámetro en cRuedas
	 * 
	 * @param cRuedas
	 */
	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}

	/**
	 * Retorna un String con todos los datos del vehículo
	 * 
	 * @return
	 */
	public String imprimir() {
		return "El vehículo es un " + modelo + "\nTiene " + potencia + " CV de potencia" + "\nTracción a las 4 ruedas: "
				+ cRuedas;
	}
}
