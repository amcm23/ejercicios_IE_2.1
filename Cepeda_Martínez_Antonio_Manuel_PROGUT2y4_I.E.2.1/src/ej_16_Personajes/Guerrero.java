package ej_16_Personajes;

public class Guerrero extends Personajes {

	/**
	 * Atributo nombre del arma del guerrero
	 */
	private String arma;

	/**
	 * Constructor con 3 parámetros
	 * 
	 * @param nombre
	 * @param arma
	 * @param maxenergia
	 */
	Guerrero(String nombre, String arma, int maxenergia) {
		super(nombre, maxenergia);
		this.arma = arma;
	}

	/**
	 * Método que retorna el nombre del arma
	 * 
	 * @return
	 */
	public String getArma() {
		return arma;
	}

	/**
	 * Método que realiza realiza la acción de combatir (siempre que tenga
	 * suficiente energía)
	 * 
	 * @param ener
	 * @return
	 */
	public String combatir(int ener) {
		if ((getEnergia() - ener) < 0) {
			return "No tiene suficiente energía para efectuar el ataque";
		} else {
			energia -= ener;
			return "El legendario guerrero " + nombre + " alza su magestuosa " + arma
					+ " asestando un golpe demoledor el cual consume " + ener + " de energía"
					+ "\nLa energía restante de " + nombre + " es " + energia;
		}
	}

}
