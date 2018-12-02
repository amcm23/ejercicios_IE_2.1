package ej_16_Personajes;

/**
 * @author Antonio M Cepeda
 */
public class Personajes {

	/**
	 * Atributo nombre del personaje
	 */
	protected String nombre;
	/**
	 * Atributo energía actual del personaje
	 */
	protected int energia;
	/**
	 * Atributo energía máxima del personaje
	 */
	protected int maxenergia;

	/**
	 * Método que retorna la energía máxima del personaje
	 * 
	 * @return
	 */
	public int getMaxenergia() {
		return maxenergia;
	}

	/**
	 * Constructor con 2 parámetros
	 * 
	 * @param nombre     Nombre del personaje
	 * @param maxenergia Energía máxima del personaje
	 */
	Personajes(String nombre, int maxenergia) {
		this.nombre = nombre;
		this.maxenergia = maxenergia;
		energia = maxenergia;
	}

	/**
	 * Método que retorna el nombre del personaje
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que inserta el nombre del personaje por parámetro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que retorna la cantidad de energía actual del personaje
	 * 
	 * @return
	 */
	public int getEnergia() {
		return energia;
	}

	/**
	 * Método que añade energía a la energía actual por parámetro (siempre y cuando
	 * quepa en la energía máxima)
	 * 
	 * @param ener
	 */
	public void alimentarse(int ener) {
		if ((energia + ener) > maxenergia) {
			System.out.println(
					"La energía está al máximo, se han podido añadir " + (maxenergia - energia) + " de energía.");
			energia = maxenergia;
		} else {
			energia += ener;
			System.out.println(
					nombre + " toma un poco de comida de su bolsa, incrementando su energía " + ener + " puntos.");
		}

	}
}
