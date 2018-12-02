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
	 * Atributo % de l�pidos que contiene el alimento
	 */
	private double lipidos;
	/**
	 * Atributo % de hidratos de carbono que contiene el alimento
	 */
	private double hidratos;
	/**
	 * Atributo % de prote�nas que contiene el alimento
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
	 * Constructor con 1 par�metro
	 * 
	 * @param nombre Nombre del alimento
	 */
	public Alimento(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Contructor con 7 par�metros
	 * 
	 * @param nombre        Nombre del alimento
	 * @param lipidos       % de l�pidos
	 * @param hidratos      % de hidratos de carbono
	 * @param proteinas     % de prote�nas
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
	 * M�todo que retorna el nombre del alimento
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo que inserta el nombre del alimento por par�metro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo que retorna el % de l�pidos
	 * 
	 * @return
	 */
	public double getLipidos() {
		return lipidos;
	}

	/**
	 * M�todo que inserta el % de l�pidos por par�metro
	 * 
	 * @param lipidos
	 */
	public void setLipidos(double lipidos) {
		this.lipidos = lipidos;
	}

	/**
	 * M�todo que retorna el % de hidratos de carbono
	 * 
	 * @return
	 */
	public double getHidratos() {
		return hidratos;
	}

	/**
	 * M�todo que inserta el % de hidratos de carbono por par�metro
	 * 
	 * @param hidratos
	 */
	public void setHidratos(double hidratos) {
		this.hidratos = hidratos;
	}

	/**
	 * M�todo que retorna el % de prote�nas
	 * 
	 * @return
	 */
	public double getProteinas() {
		return proteinas;
	}

	/**
	 * M�todo que inserta el % de prote�nas por par�metro
	 * 
	 * @param proteinas
	 */
	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	/**
	 * M�todo boolean que retorna true o false si es o no de origen animal
	 * 
	 * @return
	 */
	public boolean isOrigen_animal() {
		return origen_animal;
	}

	/**
	 * M�todo que inserta el origen animal por par�metro
	 * 
	 * @param origen_animal
	 */
	public void setOrigen_animal(boolean origen_animal) {
		this.origen_animal = origen_animal;
	}

	/**
	 * M�todo que retorna el contenido en vitaminas
	 * 
	 * @return
	 */
	public char getVitaminas() {
		return vitaminas;
	}

	/**
	 * M�todo que inserta el contenido en vitaminas por par�metro
	 * 
	 * @param vitaminas
	 */
	public void setVitaminas(char vitaminas) {
		this.vitaminas = vitaminas;
	}

	/**
	 * M�todo que retorna el contenido en minerales
	 * 
	 * @return
	 */
	public char getMinerales() {
		return minerales;
	}

	/**
	 * M�todo que inserta el contenido en minerales por par�metro
	 * 
	 * @param minerales
	 */
	public void setMinerales(char minerales) {
		this.minerales = minerales;
	}

	/**
	 * M�todo que retorna un booleano true si el alimento es diet�tico (cumple la
	 * condici�n) y false si no.
	 * 
	 * @return
	 */
	public boolean esDietetico() {
		return (lipidos < 20 && vitaminas != 'b');
	}

	/**
	 * M�todo que retorna un String con todos los datos del alimento
	 * 
	 * @return
	 */
	public String muestraAlimento() {
		return "El alimento " + nombre + " contiene: " + "\nL�pidos: " + lipidos + "%" + "\nHidratos de Carbono: "
				+ hidratos + "% \nProte�nas: " + proteinas + "% \nOrigen animal: " + ((origen_animal) ? "si" : "no")
				+ "\nContenido en Vitaminas: " + vitaminas + "\nContenido en Minerales: " + minerales + "\nDiet�tico: "
				+ ((esDietetico() ? "si" : "no"));
	}

}
