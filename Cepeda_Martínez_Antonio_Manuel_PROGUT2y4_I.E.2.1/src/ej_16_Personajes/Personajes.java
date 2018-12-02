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
	 * Atributo energ�a actual del personaje
	 */
	protected int energia;
	/**
	 * Atributo energ�a m�xima del personaje
	 */
	protected int maxenergia;

	/**
	 * M�todo que retorna la energ�a m�xima del personaje
	 * 
	 * @return
	 */
	public int getMaxenergia() {
		return maxenergia;
	}

	/**
	 * Constructor con 2 par�metros
	 * 
	 * @param nombre     Nombre del personaje
	 * @param maxenergia Energ�a m�xima del personaje
	 */
	Personajes(String nombre, int maxenergia) {
		this.nombre = nombre;
		this.maxenergia = maxenergia;
		energia = maxenergia;
	}

	/**
	 * M�todo que retorna el nombre del personaje
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo que inserta el nombre del personaje por par�metro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo que retorna la cantidad de energ�a actual del personaje
	 * 
	 * @return
	 */
	public int getEnergia() {
		return energia;
	}

	/**
	 * M�todo que a�ade energ�a a la energ�a actual por par�metro (siempre y cuando
	 * quepa en la energ�a m�xima)
	 * 
	 * @param ener
	 */
	public void alimentarse(int ener) {
		if ((energia + ener) > maxenergia) {
			System.out.println(
					"La energ�a est� al m�ximo, se han podido a�adir " + (maxenergia - energia) + " de energ�a.");
			energia = maxenergia;
		} else {
			energia += ener;
			System.out.println(
					nombre + " toma un poco de comida de su bolsa, incrementando su energ�a " + ener + " puntos.");
		}

	}
}
