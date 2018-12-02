package ej_15_Cajero;

public class Cuenta {

	/**
	 * Atributo saldo de la cuenta
	 */
	private float saldo;

	/**
	 * Constructor con 1 par�metro
	 * 
	 * @param saldo Saldo de la cuenta
	 */
	Cuenta(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * M�todo que ingresa la cantidad deseada por par�metro en el saldo actual
	 * 
	 * @param c
	 */
	public void ingresar(float c) {
		saldo += c;
	}

	/**
	 * M�todo que extrae la cantidad deseada por par�metro del saldo actual
	 * 
	 * @param c
	 */
	public void extraer(float c) {
		saldo -= c;
	}

	/**
	 * M�todo que retorna el saldo actual de la cuenta
	 * 
	 * @return
	 */
	public float getSaldo() {
		return saldo;
	}

}
