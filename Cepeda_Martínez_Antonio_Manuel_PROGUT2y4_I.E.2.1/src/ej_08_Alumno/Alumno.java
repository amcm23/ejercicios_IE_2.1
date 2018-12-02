package ej_08_Alumno;

public class Alumno {

	/**
	 * Atributo nombre del alumno
	 */
	String nombre;
	/**
	 * Atributo edad del alumno
	 */
	int edad;

	/**
	 * Constructor vac�o
	 */
	public Alumno() {
	}

	/**
	 * Constructor con 2 par�metros
	 * 
	 * @param nombre Nombre del alumno
	 * @param edad   Edad del alumno
	 */
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * M�todo que retorna el nombre
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
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
	 * M�todo que retorna la edad
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * M�todo para insertar la edad por par�metro
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
