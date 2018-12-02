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
	 * Constructor vacío
	 */
	public Alumno() {
	}

	/**
	 * Constructor con 2 parámetros
	 * 
	 * @param nombre Nombre del alumno
	 * @param edad   Edad del alumno
	 */
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Método que retorna el nombre
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
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
	 * Método que retorna la edad
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método para insertar la edad por parámetro
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
