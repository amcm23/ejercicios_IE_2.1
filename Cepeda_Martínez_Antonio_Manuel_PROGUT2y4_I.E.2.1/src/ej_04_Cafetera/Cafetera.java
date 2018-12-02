package ej_04_Cafetera;

/**
 * @author Antonio M Cepeda
 */
public class Cafetera {

	/**
	 * Atributo capacidad máxima de la cafetera
	 */
	private int capacidadMaxima;
	/**
	 * Atributo cantidad actual de café
	 */
	private int cantidadActual;

	/**
	 * Constructor vacío que inicializa la capacidad máxima a 1000 y la cantidad
	 * actual a 0
	 */
	Cafetera() {
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}

	/**
	 * Constructor con 1 parámetro que iguala la cantidad actual a la capacidad
	 * 
	 * @param capacidadMaxima
	 */
	Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		cantidadActual = capacidadMaxima;
	}

	/**
	 * Constructor con dos parámetros
	 * 
	 * @param capacidadMaxima
	 * @param cantidadActual
	 */
	Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
		if (cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
	}

	/**
	 * Retorna la capacidad máxima de la cafetera
	 * 
	 * @return
	 */
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	/**
	 * Introduce el parámetro en la capacidad máxima
	 * 
	 * @param capacidadMaxima
	 */
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	/**
	 * Retorna la cantidad actual de café
	 * 
	 * @return
	 */
	public int getCantidadActual() {
		return cantidadActual;
	}

	/**
	 * Inserta el parámetro en la cantidad actual
	 * 
	 * @param cantidadActual
	 */
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	/**
	 * Método que llena la cafetera hasta la capacidad máxima igualando la cantidad
	 * actual a la capacidad máxima
	 */
	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
	}

	/**
	 * Resta la cantidad de la taza a la cantidad actual si queda suficiente, sino
	 * rellena la taza con la cantidad restante
	 * 
	 * @param taza
	 */
	public void servirTaza(int taza) {
		if (cantidadActual - taza < 0) {
			taza = cantidadActual;
			cantidadActual = 0;
			System.out.println("Vaya, no habia suficiente café, ha rellenado una taza con " + taza + " c.c.");
		} else {
			cantidadActual -= taza;
			System.out.println("Ha rellenado una taza de " + taza + " c.c.");
		}
	}

	/**
	 * Vacía la cafetera, iguala la cantidad actual a 0
	 */
	public void vaciarCafetera() {
		cantidadActual = 0;
	}

	/**
	 * Inserta la cantidad de café del parámetro en la cantidad actual, siempre y
	 * cuando quede suficiente espacio en la capacidad
	 * 
	 * @param cafe
	 */
	public void agregarCafe(int cafe) {
		if (cantidadActual + cafe > capacidadMaxima) {
			System.out.println("No puede agregar tanto café a la cafetera");
		} else {
			cantidadActual += cafe;
		}
	}

	/**
	 * Retorna un String con todos los atributos de la clase
	 * 
	 * @return
	 */
	public String muestraCafetera() {
		return "La cantidad actual de café es de " + cantidadActual + " de un máximo de " + capacidadMaxima + " c.c.";

	}
}
