package ej_10_PapasChocos;

/**
 * @author Antonio M Cepeda
 */
public class PapasChocos {

	/**
	 * Atributo kg de chocos actualmente disponibles
	 */
	private int chocos;
	/**
	 * Atributo kg de papas actualmente disponibles
	 */
	private int papas;

	/**
	 * Constructor que inicializa los atributos a 0
	 */
	public PapasChocos() {
		chocos = 0;
		papas = 0;
	}

	/**
	 * Método que retorna la cantidad de chocos actual
	 * 
	 * @return
	 */
	public int showChocos() {
		return chocos;
	}

	/**
	 * Método que añade la cantidad de chocos metidas por parámetro
	 * 
	 * @param chocos
	 */
	public void addChocos(int chocos) {
		this.chocos += chocos;
	}

	/**
	 * Método que muestra la cantidad de papas actual
	 * 
	 * @return
	 */
	public int showPapas() {
		return papas;
	}

	/**
	 * Método que añade la cantidad de papas metidas por parámetro
	 * 
	 * @param papas
	 */
	public void addPapas(int papas) {
		this.papas += papas;
	}

	/**
	 * Método que retorna el número de comensales a los que podemos alimentar con la
	 * cantidad de materia prima actualmente disponible
	 * 
	 * @return
	 */
	public int getComensales() {
		int cPapas = 0; // comensales para x papas
		int cChocos = 0; // comensales para x chocos
		if (chocos >= 0.5 && papas >= 1) {
			cPapas = papas * 3;
			cChocos = chocos * 6;
		}
		if (cPapas > cChocos) {
			cPapas = cChocos;
		} else {
			if (cChocos > cPapas) {
				cChocos = cPapas;
			}
		}
		return cPapas; // me retorna uno de los dos ya que ambos al final deben tener el mismo número
						// de comensales servidos
	}

}
