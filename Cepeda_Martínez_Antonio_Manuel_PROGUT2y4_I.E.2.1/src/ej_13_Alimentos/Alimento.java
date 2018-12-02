package ej_13_Alimentos;

/**
 * @author Antonio M Cepeda
 */
public class Alimento {

	/**
	 * Atributo nombre del alimento
	 */
	private String nombre;
	/**
	 * Atributo % de lípidos que contiene el alimento
	 */
	private double lipidos;
	/**
	 * Atributo % de hidratos de carbono que contiene el alimento
	 */
	private double hidratos;
	/**
	 * Atributo % de proteínas que contiene el alimento
	 */
	private double proteinas;
	/**
	 * Atributo booleano si es o no el alimento de origen animal
	 */
	private boolean origen_animal;
	/**
	 * Atributo contenido en vitaminas del alimento
	 */
	private char vitaminas; // A alto, M medio, B bajo
	/**
	 * Atributo contenido en minerales del alimento
	 */
	private char minerales; // A alto, M medio, B bajo

	/**
	 * Constructor con 1 parámetro
	 * 
	 * @param nombre Nombre del alimento
	 */
	public Alimento(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Contructor con 7 parámetros
	 * 
	 * @param nombre        Nombre del alimento
	 * @param lipidos       % de lípidos
	 * @param hidratos      % de hidratos de carbono
	 * @param proteinas     % de proteínas
	 * @param origen_animal Origen animal
	 * @param vitaminas     Contenido en vitaminas
	 * @param minerales     Contenido en minerales
	 */
	public Alimento(String nombre, double lipidos, double hidratos, double proteinas, boolean origen_animal,
			char vitaminas, char minerales) {
		this.nombre = nombre;
		this.lipidos = lipidos;
		this.hidratos = hidratos;
		this.proteinas = proteinas;
		this.origen_animal = origen_animal;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
	}

	/**
	 * Método que retorna el nombre del alimento
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que inserta el nombre del alimento por parámetro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que retorna el % de lípidos
	 * 
	 * @return
	 */
	public double getLipidos() {
		return lipidos;
	}

	/**
	 * Método que inserta el % de lípidos por parámetro
	 * 
	 * @param lipidos
	 */
	public void setLipidos(double lipidos) {
		this.lipidos = lipidos;
	}

	/**
	 * Método que retorna el % de hidratos de carbono
	 * 
	 * @return
	 */
	public double getHidratos() {
		return hidratos;
	}

	/**
	 * Método que inserta el % de hidratos de carbono por parámetro
	 * 
	 * @param hidratos
	 */
	public void setHidratos(double hidratos) {
		this.hidratos = hidratos;
	}

	/**
	 * Método que retorna el % de proteínas
	 * 
	 * @return
	 */
	public double getProteinas() {
		return proteinas;
	}

	/**
	 * Método que inserta el % de proteínas por parámetro
	 * 
	 * @param proteinas
	 */
	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	/**
	 * Método boolean que retorna true o false si es o no de origen animal
	 * 
	 * @return
	 */
	public boolean isOrigen_animal() {
		return origen_animal;
	}

	/**
	 * Método que inserta el origen animal por parámetro
	 * 
	 * @param origen_animal
	 */
	public void setOrigen_animal(boolean origen_animal) {
		this.origen_animal = origen_animal;
	}

	/**
	 * Método que retorna el contenido en vitaminas
	 * 
	 * @return
	 */
	public char getVitaminas() {
		return vitaminas;
	}

	/**
	 * Método que inserta el contenido en vitaminas por parámetro
	 * 
	 * @param vitaminas
	 */
	public void setVitaminas(char vitaminas) {
		this.vitaminas = vitaminas;
	}

	/**
	 * Método que retorna el contenido en minerales
	 * 
	 * @return
	 */
	public char getMinerales() {
		return minerales;
	}

	/**
	 * Método que inserta el contenido en minerales por parámetro
	 * 
	 * @param minerales
	 */
	public void setMinerales(char minerales) {
		this.minerales = minerales;
	}

	/**
	 * Método que retorna un booleano true si el alimento es dietético (cumple la
	 * condición) y false si no.
	 * 
	 * @return
	 */
	public boolean esDietetico() {
		return (lipidos < 20 && vitaminas != 'b');
	}

	/**
	 * Método que retorna un String con todos los datos del alimento
	 * 
	 * @return
	 */
	public String muestraAlimento() {
		return "El alimento " + nombre + " contiene: " + "\nLípidos: " + lipidos + "%" + "\nHidratos de Carbono: "
				+ hidratos + "% \nProteínas: " + proteinas + "% \nOrigen animal: " + ((origen_animal) ? "si" : "no")
				+ "\nContenido en Vitaminas: " + vitaminas + "\nContenido en Minerales: " + minerales + "\nDietético: "
				+ ((esDietetico() ? "si" : "no"));
	}

}
