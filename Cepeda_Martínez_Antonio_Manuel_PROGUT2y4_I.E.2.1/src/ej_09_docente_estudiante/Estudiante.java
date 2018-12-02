package ej_09_docente_estudiante;

/**
 * @author Antonio M Cepeda
 */
public class Estudiante extends Persona {

	/**
	 * Atributo código del estudiante
	 */
	private int codigo;
	/**
	 * Atributo categoría del estudiante
	 */
	private String categoria;
	/**
	 * Atributo pago de pensiones del estudiante
	 */
	private double pago_pensiones;
	/**
	 * Atributo colegio de procedencia del estudiante
	 */
	private String colegio_procedencia;

	/**
	 * Constructor vacío
	 */
	public Estudiante() {
	}

	/**
	 * Método que inserta el código por parámetro
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Método que inserta la categoría por parámetro
	 * 
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * Método que inserta el pago de pensiones por parámetro
	 * 
	 * @param pago_pensiones
	 */
	public void setPago_pensiones(double pago_pensiones) {
		this.pago_pensiones = pago_pensiones;
	}

	/**
	 * Método que inserta el colegio de procedencia por parámetro
	 * 
	 * @param colegio_procedencia
	 */
	public void setColegio_procedencia(String colegio_procedencia) {
		this.colegio_procedencia = colegio_procedencia;
	}

	/**
	 * Método que calcula el descuento en el pago de pensiones a través del promedio
	 * ponderado dado por parámetro
	 * 
	 * @param promedio
	 */
	public void getDescuento(double promedio) {
		if (promedio < 13) {
			pago_pensiones -= (pago_pensiones * 0);
		} else {
			if (promedio >= 13 && promedio <= 16) {
				pago_pensiones -= (pago_pensiones * 0.08);
			} else {
				pago_pensiones -= (pago_pensiones * 0.15);
			}
		}
	}

	/**
	 * Método que retorna el pago de pensiones
	 * 
	 * @return
	 */
	public double getPago_pensiones() {
		return pago_pensiones;
	}

	/**
	 * Método que retorna un String con toda la información del estudiante
	 * 
	 * @return
	 */
	public String getInfoEst() {
		return "Información del Estudiante: " + "\nCódigo: " + codigo + " Categoría: " + categoria
				+ "\nColegio de Procedencia: " + colegio_procedencia + "\nPago pensiones: " + getPago_pensiones()
				+ "€.";
	}

}
