package ej_06_Persona_Empleado;

/**
 * @author Antonio M Cepeda
 */
public class Empleado extends Persona {

	/**
	 * Atributo sueldo del empleado
	 */
	int sueldo;

	/**
	 * Método que retorna el sueldo del empleado
	 * 
	 * @return
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * Método para insertar el sueldo a través de parámetro
	 * 
	 * @param sueldo
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}
