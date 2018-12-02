package ej_07_Asignatura;

public class Asignatura {

	/**
	 * Atributo nombre de la asignatura
	 */
	String nombre;
	/**
	 * Atributo nota en la asignatura
	 */
	Double nota;

	/**
	 * Costructor con dos par�metros
	 * 
	 * @param nombre Nombre asignatura
	 * @param nota   Nota asignatura
	 */
	public Asignatura(String nombre, Double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	/**
	 * M�todo que retorna la nota
	 * 
	 * @return
	 */
	public Double getNota() {
		return nota;
	}

	/**
	 * M�todo para insertar la nota a trav�s de un par�metro
	 * 
	 * @param nota
	 */
	public void setNota(Double nota) {
		this.nota = nota;
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
	 * M�todo que retorna string aprobado si la nota es >= a 5 y suspenso si es
	 * menor
	 * 
	 * @return
	 */
	public String getAproSusp() {
		return (getNota() < 5) ? "Suspenso" : "Aprobado";
	}

}
