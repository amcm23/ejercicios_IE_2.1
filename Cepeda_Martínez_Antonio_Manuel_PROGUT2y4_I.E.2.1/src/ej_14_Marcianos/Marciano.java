package ej_14_Marcianos;

public class Marciano {

	/**
	 * Atributo booleano que indica si el marciano est� vivo o no
	 */
	private boolean vivo = false;
	/**
	 * Atributo nombre del marciano
	 */
	private String nombre;
	/**
	 * Atributo est�tico que indica el n�mero de marcianos actuales
	 */
	private static int numMarcianos = 0;

	/**
	 * Constructor con 1 par�metro
	 * 
	 * @param nombre Nombre del marciano
	 */
	public Marciano(String nombre) {
		vivo = true;
		this.nombre = nombre;
		numMarcianos++;
		nace(); // llama al m�todo nace
	}

	/**
	 * M�todo que genera una frase cuando nace un marciano
	 */
	public void nace() {
		System.out.println("Hola, he nacido y soy el marciano " + nombre);
	}

	/**
	 * M�todo que retorna el nombre del marciano
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo que hace que el marciano pase a estar muerto y retorna una frase
	 */
	public void muere() {
		if (vivo == true) {
			vivo = false;
			numMarcianos--; // resta del n�mero de marcianos el marciano que muere
			System.out.println("El marciano " + nombre + " ha muerto.");
		} else {
			System.out.println("El marciano ya est� muerto. "); // si el marciano ya est� muerto retorna esta frase
		}
	}

	/**
	 * M�todo booleano que indica si el marciano est� vivo
	 * 
	 * @return
	 */
	public boolean estaVivo() {
		return vivo;
	}

	/**
	 * M�todo que retorna el n�mero de marcianos actuales
	 * 
	 * @return
	 */
	public int cuentaMarcianos() {
		return numMarcianos;
	}

}
