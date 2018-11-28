package ej_15_Cajero;

public class Cuenta {

	private float saldo;

	Cuenta(float saldo) {
		this.saldo = saldo;
	}

	public void ingresar(float c) {
		saldo += c;
	}

	public void extraer(float c) {
		saldo -= c;
	}

	public float getSaldo() {
		return saldo;
	}

}
