package ej_15_Cajero;

/**
 * @author Antonio M Cepeda
 */
public class Cuenta {

	/**
	 * Atributo saldo de la cuenta
	 */
	private float saldo;

	/**
	 * Constructor con 1 parámetro
	 * 
	 * @param saldo Saldo de la cuenta
	 */
	Cuenta(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método que ingresa la cantidad deseada por parámetro en el saldo actual
	 * 
	 * @param c
	 */
	public void ingresar(float c) {
		saldo += c;
	}

	/**
	 * Método que extrae la cantidad deseada por parámetro del saldo actual
	 * 
	 * @param c
	 */
	public void extraer(float c) {
		if(saldo-c<0) {
		System.out.println("Saldo insuficiente.");	
		}else {
		saldo -= c;
		}
	}

	/**
	 * Método que retorna el saldo actual de la cuenta
	 * 
	 * @return
	 */
	public float getSaldo() {
		return saldo;
	}

}
