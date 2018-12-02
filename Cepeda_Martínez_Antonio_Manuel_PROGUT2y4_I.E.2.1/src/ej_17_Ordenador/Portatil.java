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
	 * Atributo tama�o de la pantalla del portatil en pulgadas
	 */
	private double tama�o_pantalla;
	/**
	 * Atributo peso del portatil
	 */
	private double peso;

	/**
	 * M�todo que retorna la marca del portatil
	 * 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * M�todo que inserta la marca por par�metro
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Constructor con 7 par�metros
	 * 
	 * @param ram             RAM del portatil
	 * @param disco_duro      Capacidad del disco duro del portatil
	 * @param mod_procesador  Modelo del procesador del portatil
	 * @param precio          Precio del portatil
	 * @param marca           Marca del portatil
	 * @param tama�o_pantalla Tama�o de la pantalla del portatil
	 * @param peso            Peso del portatil
	 */
	public Portatil(int ram, int disco_duro, String mod_procesador, float precio, String marca, double tama�o_pantalla,
			double peso) {
		super(ram, disco_duro, mod_procesador, precio);
		this.marca = marca;
		this.tama�o_pantalla = tama�o_pantalla;
		this.peso = peso;
	}

	/**
	 * Constructor vac�o
	 */
	public Portatil() {
	}

	/**
	 * M�todo que retorna el tama�o de la pantalla
	 * 
	 * @return
	 */
	public double getTama�o_pantalla() {
		return tama�o_pantalla;
	}

	/**
	 * M�todo que inserta el tama�o de la pantalla por par�metro
	 * 
	 * @param tama�o_pantalla
	 */
	public void setTama�o_pantalla(double tama�o_pantalla) {
		this.tama�o_pantalla = tama�o_pantalla;
	}

	/**
	 * M�todo que retornal el peso del portatil
	 * 
	 * @return
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * M�todo que inserta el peso por par�metro
	 * 
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * M�todo que retorna un String con toda la informaci�n del portatil
	 * 
	 * @return
	 */
	public String mostrarPortatil() {
		return "RAM: " + ram + " gb\nCapacidad Disco Duro: " + disco_duro + " mb\nModelo del procesador: "
				+ mod_procesador + "\nPrecio: " + precio + " �\nMarca: " + marca + "\nTama�o de la pantalla: "
				+ tama�o_pantalla + " pulgadas\nPeso: " + peso + " gr";
	}

}
