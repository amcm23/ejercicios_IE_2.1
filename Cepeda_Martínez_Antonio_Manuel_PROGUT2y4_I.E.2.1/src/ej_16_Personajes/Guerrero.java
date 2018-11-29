package ej_16_Personajes;

public class Guerrero extends Personajes {

	private String arma;

	Guerrero(String nombre, String arma, int maxenergia) {
		super(nombre, maxenergia);
		this.arma = arma;
	}

	public String getArma() {
		return arma;
	}

	public String combatir(int ener) {
		if ((getEnergia() - ener) < 0) {
			return "No tiene suficiente energía para efectuar el ataque";
		} else {
			energia -= ener;
			return "El legendario guerrero "+nombre+" alza su magestuosa "+arma+" asestando un golpe demoledor el cual consume "+ener+" de energía"+
					"\nLa energía restante de "+nombre+" es "+energia;
		}
	}

}
