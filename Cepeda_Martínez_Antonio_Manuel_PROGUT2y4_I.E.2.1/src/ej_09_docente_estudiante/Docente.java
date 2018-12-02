package ej_09_docente_estudiante;

/**
 * @author Antonio M Cepeda
 */
public class Docente extends Persona {

	/**
	 * Atributo c�digo del docente
	 */
	int codigo;
	/**
	 * Atributo categor�a del docente
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
	 * Constructor vac�o
	 */
	public Docente() {
	}

	/**
	 * M�todo para insertar el c�digo por par�metro
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * M�todo para insertar la categor�a por par�metro
	 * 
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * M�todo para insertar los estudios postgrado por par�metro
	 * 
	 * @param estudios_post
	 */
	public void setEstudios_post(String estudios_post) {
		this.estudios_post = estudios_post;
	}

	/**
	 * M�todo para insertar las horas de clase por par�metro
	 * 
	 * @param horas_clase
	 */
	public void setHoras_clase(int horas_clase) {
		this.horas_clase = horas_clase;
	}

	/**
	 * M�todo para insertar el pago por hora por par�metro
	 * 
	 * @param pago_hora
	 */
	public void setPago_hora(double pago_hora) {
		this.pago_hora = pago_hora;
	}

	/**
	 * M�todo que calcula el pago parcial del docente
	 * 
	 * @return
	 */
	public double pagoParcial() {
		return (horas_clase * pago_hora);
	}

	/**
	 * M�todo que retorna un String con la informaci�n del docente
	 * 
	 * @return
	 */
	public String getInfoDoc() {
		return "Informaci�n del docente: " + "\nC�digo: " + codigo + ". Categor�a: " + categoria
				+ ".\nEstudios de Postgrado: " + estudios_post + ".\nHoras de clase: " + horas_clase
				+ "h. Pago por hora: " + pago_hora + "�. Con pago parcial de: " + pagoParcial() + "�.";

	}

}
