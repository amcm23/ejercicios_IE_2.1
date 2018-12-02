package ej_09_docente_estudiante;

/**
 * @author Antonio M Cepeda
 */
public class Docente extends Persona {

	/**
	 * Atributo código del docente
	 */
	int codigo;
	/**
	 * Atributo categoría del docente
	 */
	String categoria;
	/**
	 * Atributo estudios postgrado realizados por el docente
	 */
	String estudios_post;
	/**
	 * Atributo horas de clase impartidas por el docente
	 */
	int horas_clase;
	/**
	 * Atributo pago por hora de clase
	 */
	double pago_hora;

	/**
	 * Constructor vacío
	 */
	public Docente() {
	}

	/**
	 * Método para insertar el código por parámetro
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Método para insertar la categoría por parámetro
	 * 
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * Método para insertar los estudios postgrado por parámetro
	 * 
	 * @param estudios_post
	 */
	public void setEstudios_post(String estudios_post) {
		this.estudios_post = estudios_post;
	}

	/**
	 * Método para insertar las horas de clase por parámetro
	 * 
	 * @param horas_clase
	 */
	public void setHoras_clase(int horas_clase) {
		this.horas_clase = horas_clase;
	}

	/**
	 * Método para insertar el pago por hora por parámetro
	 * 
	 * @param pago_hora
	 */
	public void setPago_hora(double pago_hora) {
		this.pago_hora = pago_hora;
	}

	/**
	 * Método que calcula el pago parcial del docente
	 * 
	 * @return
	 */
	public double pagoParcial() {
		return (horas_clase * pago_hora);
	}

	/**
	 * Método que retorna un String con la información del docente
	 * 
	 * @return
	 */
	public String getInfoDoc() {
		return "Información del docente: " + "\nCódigo: " + codigo + ". Categoría: " + categoria
				+ ".\nEstudios de Postgrado: " + estudios_post + ".\nHoras de clase: " + horas_clase
				+ "h. Pago por hora: " + pago_hora + "€. Con pago parcial de: " + pagoParcial() + "€.";

	}

}
