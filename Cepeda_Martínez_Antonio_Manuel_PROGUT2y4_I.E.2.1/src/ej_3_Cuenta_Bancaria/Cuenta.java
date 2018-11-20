package ej_3_Cuenta_Bancaria;

public class Cuenta {
	
	protected long ncuenta=100001;
	private long dni; //dni cliente
	private double saldo; //saldo actual
	private static float interes; //interes anual
	
	Cuenta (){};
	Cuenta (long dni,double saldo,float interes){
		this.dni=dni;
		this.saldo=saldo;
		Cuenta.interes=interes;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public static float getInteres() {
		return interes;
	}
	public static void setInteres(float interes) {
		Cuenta.interes = interes;
	}
	public double actualizarSaldo() {
		return saldo-=(interes/365);
	}
	public long getNcuenta() {
		return ncuenta;
	}
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	public void retirar(double cantidad) {
		if(saldo-cantidad<0) {
			System.out.println("No se puede efectuar la operación (Fondos insuficientes)");
		} else {
			saldo-=cantidad;
		}
	}
	public String muestraCuenta() {
		return "Cuenta nº "+ncuenta+"                         Saldo actual: "+saldo+"€"+
				"\n"+"\nDNI del cliente: "+dni+
				"\n"+
				"\nInterés anual: "+interes+"%";
	}
}
