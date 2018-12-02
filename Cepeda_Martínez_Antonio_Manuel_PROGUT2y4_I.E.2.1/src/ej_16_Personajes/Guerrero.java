package ej_16_Personajes;

public class Guerrero extends Personajes {

	/**
	 * Atributo nombre del arma del guerrero
	 */
	private String arma;

	/**
	 * Constructor con 3 par�metros
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
	 * M�todo que retorna el nombre del arma
	 * 
	 * @return
	 */
	public String getArma() {
		return arma;
	}

	/**
	 * M�todo que realiza realiza la acci�n de combatir (siempre que tenga
	 * suficiente energ�a)
	 * 
	 * @param ener
	 * @return
	 */
	public String combatir(int ener) {
		if ((getEnergia() - ener) < 0) {
			return "No tiene suficiente energ�a para efectuar el ataque";
		} else {
			energia -= ener;
			return "El legendario guerrero " + nombre + " alza su magestuosa " + arma
					+ " asestando un golpe demoledor el cual consume " + ener + " de energ�a"
					+ "\nLa energ�a restante de " + nombre + " es " + energia;
		}
	}

}
