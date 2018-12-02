package ej_12_sueldobruto;

/**
 * @author Antonio M Cepeda
 */
public class Empleado {

	/**
	 * Atributo nombre del empleado
	 */
	private String nombre;
	/**
	 * Atributo número de horas realizadas por el empleado
	 */
	private double nhoras;
	/**
	 * Atributo tarifa
	 */
	private double tarifa;

	/**
	 * Constructor vacío
	 */
	Empleado() {
	}

	/**
	 * Retorna el nombre del empleado
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Inserta el nombre del empleado a través de parámetro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Retorna el número de horas trabajadas por el empleado
	 * 
	 * @return
	 */
	public double getNhoras() {
		return nhoras;
	}

	/**
	 * Inserta el número de horas por parámetro
	 * 
	 * @param nhoras
	 */
	public void setNhoras(double nhoras) {
		this.nhoras = nhoras;
	}

	/**
	 * Retorna la tarifa
	 * 
	 * @return
	 */
	public double getTarifa() {
		return tarifa;
	}

	/**
	 * Inserta la tarifa por parámetro
	 * 
	 * @param tarifa
	 */
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	/**
	 * Método que calcula el sueldo bruto del empleado (según las horas trabajadas)
	 * 
	 * @return
	 */
	public double sueldoBruto() {
		if (nhoras > 40) {
			return ((40 * tarifa) + ((nhoras - 40)
					* (tarifa + (tarifa / 2)))); /*
													 * este me calcula el sueldo con la tarifa de las 40h mas la tarifa
													 * y media de las horas extras a 40
													 */
		} else {
			return nhoras * tarifa; // calcula la tarifa normal
		}
	}

}
