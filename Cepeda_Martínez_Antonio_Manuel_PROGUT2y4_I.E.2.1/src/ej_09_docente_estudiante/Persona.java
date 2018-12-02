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
	 * Constructor con 4 parámetros
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
	 * Constructor vacío
	 */
	public Persona() {
	}

	/**
	 * Método para insertar los apellidos por parámetro
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Método para insertar el nombre por parámetro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para insertar el sexo por parámetro
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Método para insertar el dni por parámetro
	 * 
	 * @param dni
	 */
	public void setDNI(String dni) {
		this.dni = dni;
	}

	/**
	 * Método que retorna un String con la información de la persona
	 * 
	 * @return
	 */
	public String getInfo() {
		return nombre + " " + apellidos + "\nSexo: " + sexo + " DNI: " + dni;
	}

}
