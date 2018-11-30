package ej_17_Ordenador;

public class Servidor extends Ordenador {

	private float tamaño_monitor;
	private String modelo_teclado;
	private String modelo_raton;

	public float getTamaño_monitor() {
		return tamaño_monitor;
	}

	public void setTamaño_monitor(float tamaño_monitor) {
		this.tamaño_monitor = tamaño_monitor;
	}

	public String getModelo_teclado() {
		return modelo_teclado;
	}

	public void setModelo_teclado(String modelo_teclado) {
		this.modelo_teclado = modelo_teclado;
	}

	public String getModelo_raton() {
		return modelo_raton;
	}

	public void setModelo_raton(String modelo_raton) {
		this.modelo_raton = modelo_raton;
	}

	public Servidor(int ram, int disco_duro, String mod_procesador, float precio, float tamaño_monitor,
			String modelo_teclado, String modelo_raton) {
		super(ram, disco_duro, mod_procesador, precio);
		this.tamaño_monitor = tamaño_monitor;
		this.modelo_teclado = modelo_teclado;
		this.modelo_raton = modelo_raton;
	}

	public Servidor() {
	}

	public String mostrarServidor() {
		return "RAM: " + ram + " gb\nCapacidad Disco Duro: " + disco_duro + " mb\nModelo del procesador: " + mod_procesador
				+ "\nPrecio: " + precio + "€\nTamaño del monitor " + tamaño_monitor + " pulgadas\nModelo del teclado: "
				+ modelo_teclado + "\nModelo del ratón: " + modelo_raton;
	}

}
