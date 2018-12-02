package ej_17_Ordenador;

/**
 * @author Antonio M Cepeda
 */
public class Servidor extends Ordenador {

	/**
	 * Atributo tama�o del monitor en pulgadas
	 */
	private float tama�o_monitor;
	/**
	 * Atributo modelo del teclado
	 */
	private String modelo_teclado;
	/**
	 * Atributo modelo del rat�n
	 */
	private String modelo_raton;

	/**
	 * M�todo que retorna el tama�o del monitor
	 * 
	 * @return
	 */
	public float getTama�o_monitor() {
		return tama�o_monitor;
	}

	/**
	 * M�todo que inserta el tama�o del monitor por par�metro
	 * 
	 * @param tama�o_monitor
	 */
	public void setTama�o_monitor(float tama�o_monitor) {
		this.tama�o_monitor = tama�o_monitor;
	}

	/**
	 * M�todo que retorna el modelo del teclado
	 * 
	 * @return
	 */
	public String getModelo_teclado() {
		return modelo_teclado;
	}

	/**
	 * M�todo que inserta el modelo del teclado por par�metro
	 * 
	 * @param modelo_teclado
	 */
	public void setModelo_teclado(String modelo_teclado) {
		this.modelo_teclado = modelo_teclado;
	}

	/**
	 * M�todo que retorna el modelo del rat�n
	 * 
	 * @return
	 */
	public String getModelo_raton() {
		return modelo_raton;
	}

	/**
	 * M�todo que inserta el modelo del rat�n por par�metro
	 * 
	 * @param modelo_raton
	 */
	public void setModelo_raton(String modelo_raton) {
		this.modelo_raton = modelo_raton;
	}

	/**
	 * Constructor con 7 par�metros
	 * 
	 * @param ram            Cantidad RAM del servidor
	 * @param disco_duro     Capacidad del disco duro del servidor
	 * @param mod_procesador Modelo del procesador del servidor
	 * @param precio         Precio del servidor
	 * @param tama�o_monitor Tama�o del monitor del servidor
	 * @param modelo_teclado Modelo del teclado del servidor
	 * @param modelo_raton   Modelo del raton del servidor
	 */
	public Servidor(int ram, int disco_duro, String mod_procesador, float precio, float tama�o_monitor,
			String modelo_teclado, String modelo_raton) {
		super(ram, disco_duro, mod_procesador, precio);
		this.tama�o_monitor = tama�o_monitor;
		this.modelo_teclado = modelo_teclado;
		this.modelo_raton = modelo_raton;
	}

	/**
	 * Constructor vac�o
	 */
	public Servidor() {
	}

	/**
	 * M�todo que retorna un String con todos los datos del servidor
	 * 
	 * @return
	 */
	public String mostrarServidor() {
		return "RAM: " + ram + " gb\nCapacidad Disco Duro: " + disco_duro + " mb\nModelo del procesador: "
				+ mod_procesador + "\nPrecio: " + precio + "�\nTama�o del monitor " + tama�o_monitor
				+ " pulgadas\nModelo del teclado: " + modelo_teclado + "\nModelo del rat�n: " + modelo_raton;
	}

}
