package ej_02_veh�culo;

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
	 * Atributo (tiene/no tiene) tracci�n a las 4 ruedas
	 */
	private boolean cRuedas;

	/**
	 * Constructor con 1 par�metro
	 * 
	 * @param modelo Modelo del coche
	 */
	Vehiculo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * M�todo que retorna la potencia del coche
	 * 
	 * @return potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * Introduce el par�metro en la potencia del coche
	 * 
	 * @param potencia
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * booleano que retorna true/false si tiene tracci�n a las 4 ruedas
	 * 
	 * @return cRuedas
	 */
	public boolean iscRuedas() {
		return cRuedas;
	}

	/**
	 * Introduce el par�metro en cRuedas
	 * 
	 * @param cRuedas
	 */
	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}

	/**
	 * Retorna un String con todos los datos del veh�culo
	 * 
	 * @return
	 */
	public String imprimir() {
		return "El veh�culo es un " + modelo + "\nTiene " + potencia + " CV de potencia" + "\nTracci�n a las 4 ruedas: "
				+ cRuedas;
	}
}
