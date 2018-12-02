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
	 * M�todo que retorna el sueldo del empleado
	 * 
	 * @return
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * M�todo para insertar el sueldo a trav�s de par�metro
	 * 
	 * @param sueldo
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}
