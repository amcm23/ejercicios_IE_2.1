package ej_09_docente_estudiante;

/**
 * @author Antonio M Cepeda
 */
public class Persona {

	/**
	 * Atributo apellidos de la persona
	 */
	private String apellidos;
	/**
	 * Atributo nombre de la persona
	 */
	private String nombre;
	/**
	 * Atributo sexo de la persona
	 */
	private String sexo;
	/**
	 * Atributo DNI de la persona
	 */
	private String dni;

	/**
	 * Constructor con 4 par�metros
	 * 
	 * @param apellidos Apellidos de la persona
	 * @param nombre    Nombre de la persona
	 * @param sexo      Sexo de la persona
	 * @param dni       DNI de la persona
	 */
	public Persona(String apellidos, String nombre, String sexo, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sexo = sexo;
		this.dni = dni;
	}

	/**
	 * Constructor vac�o
	 */
	public Persona() {
	}

	/**
	 * M�todo para insertar los apellidos por par�metro
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * M�todo para insertar el nombre por par�metro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo para insertar el sexo por par�metro
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * M�todo para insertar el dni por par�metro
	 * 
	 * @param dni
	 */
	public void setDNI(String dni) {
		this.dni = dni;
	}

	/**
	 * M�todo que retorna un String con la informaci�n de la persona
	 * 
	 * @return
	 */
	public String getInfo() {
		return nombre + " " + apellidos + "\nSexo: " + sexo + " DNI: " + dni;
	}

}
