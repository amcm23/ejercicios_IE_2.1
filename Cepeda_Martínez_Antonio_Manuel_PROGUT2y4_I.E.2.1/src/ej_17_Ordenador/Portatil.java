package ej_17_Ordenador;

/**
 * @author Antonio M Cepeda
 */
public class Portatil extends Ordenador {

	/**
	 * Atributo marca del portatil
	 */
	private String marca;
	/**
	 * Atributo tamaño de la pantalla del portatil en pulgadas
	 */
	private double tamaño_pantalla;
	/**
	 * Atributo peso del portatil
	 */
	private double peso;

	/**
	 * Método que retorna la marca del portatil
	 * 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Método que inserta la marca por parámetro
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Constructor con 7 parámetros
	 * 
	 * @param ram             RAM del portatil
	 * @param disco_duro      Capacidad del disco duro del portatil
	 * @param mod_procesador  Modelo del procesador del portatil
	 * @param precio          Precio del portatil
	 * @param marca           Marca del portatil
	 * @param tamaño_pantalla Tamaño de la pantalla del portatil
	 * @param peso            Peso del portatil
	 */
	public Portatil(int ram, int disco_duro, String mod_procesador, float precio, String marca, double tamaño_pantalla,
			double peso) {
		super(ram, disco_duro, mod_procesador, precio);
		this.marca = marca;
		this.tamaño_pantalla = tamaño_pantalla;
		this.peso = peso;
	}

	/**
	 * Constructor vacío
	 */
	public Portatil() {
	}

	/**
	 * Método que retorna el tamaño de la pantalla
	 * 
	 * @return
	 */
	public double getTamaño_pantalla() {
		return tamaño_pantalla;
	}

	/**
	 * Método que inserta el tamaño de la pantalla por parámetro
	 * 
	 * @param tamaño_pantalla
	 */
	public void setTamaño_pantalla(double tamaño_pantalla) {
		this.tamaño_pantalla = tamaño_pantalla;
	}

	/**
	 * Método que retornal el peso del portatil
	 * 
	 * @return
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método que inserta el peso por parámetro
	 * 
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Método que retorna un String con toda la información del portatil
	 * 
	 * @return
	 */
	public String mostrarPortatil() {
		return "RAM: " + ram + " gb\nCapacidad Disco Duro: " + disco_duro + " mb\nModelo del procesador: "
				+ mod_procesador + "\nPrecio: " + precio + " €\nMarca: " + marca + "\nTamaño de la pantalla: "
				+ tamaño_pantalla + " pulgadas\nPeso: " + peso + " gr";
	}

}
