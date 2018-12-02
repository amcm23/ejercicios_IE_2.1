package ej_17_Ordenador;

/**
 * @author Antonio M Cepeda
 */
public class Servidor extends Ordenador {

	/**
	 * Atributo tamaño del monitor en pulgadas
	 */
	private float tamaño_monitor;
	/**
	 * Atributo modelo del teclado
	 */
	private String modelo_teclado;
	/**
	 * Atributo modelo del ratón
	 */
	private String modelo_raton;

	/**
	 * Método que retorna el tamaño del monitor
	 * 
	 * @return
	 */
	public float getTamaño_monitor() {
		return tamaño_monitor;
	}

	/**
	 * Método que inserta el tamaño del monitor por parámetro
	 * 
	 * @param tamaño_monitor
	 */
	public void setTamaño_monitor(float tamaño_monitor) {
		this.tamaño_monitor = tamaño_monitor;
	}

	/**
	 * Método que retorna el modelo del teclado
	 * 
	 * @return
	 */
	public String getModelo_teclado() {
		return modelo_teclado;
	}

	/**
	 * Método que inserta el modelo del teclado por parámetro
	 * 
	 * @param modelo_teclado
	 */
	public void setModelo_teclado(String modelo_teclado) {
		this.modelo_teclado = modelo_teclado;
	}

	/**
	 * Método que retorna el modelo del ratón
	 * 
	 * @return
	 */
	public String getModelo_raton() {
		return modelo_raton;
	}

	/**
	 * Método que inserta el modelo del ratón por parámetro
	 * 
	 * @param modelo_raton
	 */
	public void setModelo_raton(String modelo_raton) {
		this.modelo_raton = modelo_raton;
	}

	/**
	 * Constructor con 7 parámetros
	 * 
	 * @param ram            Cantidad RAM del servidor
	 * @param disco_duro     Capacidad del disco duro del servidor
	 * @param mod_procesador Modelo del procesador del servidor
	 * @param precio         Precio del servidor
	 * @param tamaño_monitor Tamaño del monitor del servidor
	 * @param modelo_teclado Modelo del teclado del servidor
	 * @param modelo_raton   Modelo del raton del servidor
	 */
	public Servidor(int ram, int disco_duro, String mod_procesador, float precio, float tamaño_monitor,
			String modelo_teclado, String modelo_raton) {
		super(ram, disco_duro, mod_procesador, precio);
		this.tamaño_monitor = tamaño_monitor;
		this.modelo_teclado = modelo_teclado;
		this.modelo_raton = modelo_raton;
	}

	/**
	 * Constructor vacío
	 */
	public Servidor() {
	}

	/**
	 * Método que retorna un String con todos los datos del servidor
	 * 
	 * @return
	 */
	public String mostrarServidor() {
		return "RAM: " + ram + " gb\nCapacidad Disco Duro: " + disco_duro + " mb\nModelo del procesador: "
				+ mod_procesador + "\nPrecio: " + precio + "€\nTamaño del monitor " + tamaño_monitor
				+ " pulgadas\nModelo del teclado: " + modelo_teclado + "\nModelo del ratón: " + modelo_raton;
	}

}
