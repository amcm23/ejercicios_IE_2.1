package ej_03_Cuenta_Bancaria;

public class Cuenta {

	/**
	 * Atributo n�mero de cuenta
	 */
	protected static long ncuenta = 100001;
	/**
	 * Atributo DNI del cliente
	 */
	private long dni;
	/**
	 * Atributo saldo de la cuenta
	 */
	private double saldo;
	/**
	 * Atributo interes anual
	 */
	private static float interes; 

	/**
	 * Constructor vac�o
	 */
	Cuenta() {
	};

	/**
	 * Constructor con 3 par�metros
	 * @param dni DNI del usuario
	 * @param saldo Saldo de la cuenta
	 * @param interes Inter�s anual
	 */
	Cuenta(long dni, double saldo, float interes) {
		this.dni = dni;
		this.saldo = saldo;
		Cuenta.interes = interes;
	}

	/**
	 * M�todo que retorna el DNI del usuario
	 * @return dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * M�todo que introduce el par�metro en el DNI
	 * @param dni
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * Retorna el saldo de la cuenta
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Introduce el par�metro en el saldo
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Retorna el interes
	 * @return interes
	 */
	public static float getInteres() {
		return interes;
	}

	/**
	 * Introduce el par�metro en el inter�s
	 * @param interes
	 */
	public static void setInteres(float interes) {
		Cuenta.interes = interes;
	}

	/**
	 * M�todo que le aplica el inter�s diario al saldo actual
	 * @return
	 */
	public double actualizarSaldo() {
		return saldo += (saldo * ((interes / 100) / 365));
	}

	/**
	 * Retorna el n�mero de cuenta
	 * @return nCuenta
	 */
	public long getNcuenta() {
		return ncuenta;
	}

	/**
	 * A�ade la cantidad deseada en el saldo actual
	 * @param cantidad
	 */
	public void ingresar(double cantidad) {
		saldo += cantidad;
	}

	/**
	 * Resta la cantidad deseada del saldo actual siempre 
	 * y cuando haya fondos suficientes
	 * @param cantidad
	 */
	public void retirar(double cantidad) {
		if (saldo - cantidad < 0) {
			System.out.println("No se puede efectuar la operaci�n (Fondos insuficientes)");
		} else {
			saldo -= cantidad;
		}
	}

	/**
	 * Retorna un String con todos los datos de la cuenta
	 * @return
	 */
	public String muestraCuenta() {
		return "Cuenta n� " + ncuenta + "                         Saldo actual: " + saldo + "�" + "\n"
				+ "\nDNI del cliente: " + dni + "\n" + "\nInter�s anual: " + interes + "%";
	}
}
