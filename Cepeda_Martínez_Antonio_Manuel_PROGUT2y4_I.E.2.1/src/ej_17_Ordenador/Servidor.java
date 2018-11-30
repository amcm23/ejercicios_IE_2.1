package ej_17_Ordenador;

public class Servidor extends Ordenador {

	private float tama�o_monitor;
	private String modelo_teclado;
	private String modelo_raton;

	public float getTama�o_monitor() {
		return tama�o_monitor;
	}

	public void setTama�o_monitor(float tama�o_monitor) {
		this.tama�o_monitor = tama�o_monitor;
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

	public Servidor(int ram, int disco_duro, String mod_procesador, float precio, float tama�o_monitor,
			String modelo_teclado, String modelo_raton) {
		super(ram, disco_duro, mod_procesador, precio);
		this.tama�o_monitor = tama�o_monitor;
		this.modelo_teclado = modelo_teclado;
		this.modelo_raton = modelo_raton;
	}

	public Servidor() {
	}

	public String mostrarServidor() {
		return "RAM: " + ram + " gb\nCapacidad Disco Duro: " + disco_duro + " mb\nModelo del procesador: " + mod_procesador
				+ "\nPrecio: " + precio + "�\nTama�o del monitor " + tama�o_monitor + " pulgadas\nModelo del teclado: "
				+ modelo_teclado + "\nModelo del rat�n: " + modelo_raton;
	}

}
