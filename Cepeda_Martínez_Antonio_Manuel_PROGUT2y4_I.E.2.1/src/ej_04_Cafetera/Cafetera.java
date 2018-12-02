package ej_04_Cafetera;

/**
 * @author Antonio M Cepeda
 */
public class Cafetera {

	/**
	 * Atributo capacidad m�xima de la cafetera
	 */
	private int capacidadMaxima;
	/**
	 * Atributo cantidad actual de caf�
	 */
	private int cantidadActual;

	/**
	 * Constructor vac�o que inicializa la capacidad m�xima a 1000 y la cantidad
	 * actual a 0
	 */
	Cafetera() {
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}

	/**
	 * Constructor con 1 par�metro que iguala la cantidad actual a la capacidad
	 * 
	 * @param capacidadMaxima
	 */
	Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		cantidadActual = capacidadMaxima;
	}

	/**
	 * Constructor con dos par�metros
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
	 * Retorna la capacidad m�xima de la cafetera
	 * 
	 * @return
	 */
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	/**
	 * Introduce el par�metro en la capacidad m�xima
	 * 
	 * @param capacidadMaxima
	 */
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	/**
	 * Retorna la cantidad actual de caf�
	 * 
	 * @return
	 */
	public int getCantidadActual() {
		return cantidadActual;
	}

	/**
	 * Inserta el par�metro en la cantidad actual
	 * 
	 * @param cantidadActual
	 */
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	/**
	 * M�todo que llena la cafetera hasta la capacidad m�xima igualando la cantidad
	 * actual a la capacidad m�xima
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
			System.out.println("Vaya, no habia suficiente caf�, ha rellenado una taza con " + taza + " c.c.");
		} else {
			cantidadActual -= taza;
			System.out.println("Ha rellenado una taza de " + taza + " c.c.");
		}
	}

	/**
	 * Vac�a la cafetera, iguala la cantidad actual a 0
	 */
	public void vaciarCafetera() {
		cantidadActual = 0;
	}

	/**
	 * Inserta la cantidad de caf� del par�metro en la cantidad actual, siempre y
	 * cuando quede suficiente espacio en la capacidad
	 * 
	 * @param cafe
	 */
	public void agregarCafe(int cafe) {
		if (cantidadActual + cafe > capacidadMaxima) {
			System.out.println("No puede agregar tanto caf� a la cafetera");
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
		return "La cantidad actual de caf� es de " + cantidadActual + " de un m�ximo de " + capacidadMaxima + " c.c.";

	}
}
