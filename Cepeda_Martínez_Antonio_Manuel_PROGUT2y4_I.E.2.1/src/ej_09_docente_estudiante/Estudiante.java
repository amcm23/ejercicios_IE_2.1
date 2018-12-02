package ej_09_docente_estudiante;

/**
 * @author Antonio M Cepeda
 */
public class Estudiante extends Persona {

	/**
	 * Atributo c�digo del estudiante
	 */
	private int codigo;
	/**
	 * Atributo categor�a del estudiante
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
	 * Constructor vac�o
	 */
	public Estudiante() {
	}

	/**
	 * M�todo que inserta el c�digo por par�metro
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * M�todo que inserta la categor�a por par�metro
	 * 
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * M�todo que inserta el pago de pensiones por par�metro
	 * 
	 * @param pago_pensiones
	 */
	public void setPago_pensiones(double pago_pensiones) {
		this.pago_pensiones = pago_pensiones;
	}

	/**
	 * M�todo que inserta el colegio de procedencia por par�metro
	 * 
	 * @param colegio_procedencia
	 */
	public void setColegio_procedencia(String colegio_procedencia) {
		this.colegio_procedencia = colegio_procedencia;
	}

	/**
	 * M�todo que calcula el descuento en el pago de pensiones a trav�s del promedio
	 * ponderado dado por par�metro
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
	 * M�todo que retorna el pago de pensiones
	 * 
	 * @return
	 */
	public double getPago_pensiones() {
		return pago_pensiones;
	}

	/**
	 * M�todo que retorna un String con toda la informaci�n del estudiante
	 * 
	 * @return
	 */
	public String getInfoEst() {
		return "Informaci�n del Estudiante: " + "\nC�digo: " + codigo + " Categor�a: " + categoria
				+ "\nColegio de Procedencia: " + colegio_procedencia + "\nPago pensiones: " + getPago_pensiones()
				+ "�.";
	}

}
