package ej_14_Marcianos;

public class Marciano {

	/**
	 * Atributo booleano que indica si el marciano está vivo o no
	 */
	private boolean vivo = false;
	/**
	 * Atributo nombre del marciano
	 */
	private String nombre;
	/**
	 * Atributo estático que indica el número de marcianos actuales
	 */
	private static int numMarcianos = 0;

	/**
	 * Constructor con 1 parámetro
	 * 
	 * @param nombre Nombre del marciano
	 */
	public Marciano(String nombre) {
		vivo = true;
		this.nombre = nombre;
		numMarcianos++;
		nace(); // llama al método nace
	}

	/**
	 * Método que genera una frase cuando nace un marciano
	 */
	public void nace() {
		System.out.println("Hola, he nacido y soy el marciano " + nombre);
	}

	/**
	 * Método que retorna el nombre del marciano
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que hace que el marciano pase a estar muerto y retorna una frase
	 */
	public void muere() {
		if (vivo == true) {
			vivo = false;
			numMarcianos--; // resta del número de marcianos el marciano que muere
			System.out.println("El marciano " + nombre + " ha muerto.");
		} else {
			System.out.println("El marciano ya está muerto. "); // si el marciano ya está muerto retorna esta frase
		}
	}

	/**
	 * Método booleano que indica si el marciano está vivo
	 * 
	 * @return
	 */
	public boolean estaVivo() {
		return vivo;
	}

	/**
	 * Método que retorna el número de marcianos actuales
	 * 
	 * @return
	 */
	public int cuentaMarcianos() {
		return numMarcianos;
	}

}
