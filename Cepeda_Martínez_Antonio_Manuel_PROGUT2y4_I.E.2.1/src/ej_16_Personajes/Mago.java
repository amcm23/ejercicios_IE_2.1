package ej_16_Personajes;

/**
 * @author Antonio M Cepeda
 */
public class Mago extends Personajes {

	/**
	 * Atributo nombre del poder del mago
	 */
	private String poder;

	/**
	 * Constructor con 2 par�metros
	 * 
	 * @param nombre Nombre del mago
	 * @param poder  Nombre del poder del mago
	 */
	Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}

	/**
	 * M�todo que realiza la acci�n encantar (si tiene suficiente energ�a para
	 * realizar el hechizo)
	 * 
	 * @return
	 */
	public String encantar() {
		if (energia - 2 < 0) {
			return ("Insuficiente poder para realizar el hechizo.");
		} else {
			energia -= 2;
			return ("El poderoso mago " + nombre + " alza su b�culo invocando su imponente poder " + poder
					+ " gastando 2 de energ�a.\nEnerg�a restante: " + energia);
		}

	}

}
