package ej_05_Empleado;

/**
 * @author Antonio M Cepeda
 */
public class Empleado {

	/**
	 * Atributo DNI del empleado
	 */
	private String nif;
	/**
	 * Atributo sueldo base del empleado
	 */
	private int sueldoBase;
	/**
	 * Atributo pago por cada hora extra
	 */
	private int pagohExtra;
	/**
	 * Atributo horas extras realizadas por el empleado
	 */
	private int hExtra;
	/**
	 * Atributo porcentaje de IRPF aplicado al sueldo del empleado
	 */
	private double irpf;
	/**
	 * Atributo boolean que se�ala si el empleado est� o no casado
	 */
	private boolean casado;
	/**
	 * Atributo que se�ala el n�mero de hijos que tiene el empleado
	 */
	private int nhijos;

	/**
	 * M�todo que retorna el DNI del empleado
	 * 
	 * @return nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * Ingresa en el nif el dni introducido por par�metro
	 * 
	 * @param nif
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * Retorna el sueldo base del empleado
	 * 
	 * @return
	 */
	public int getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * Ingresa el sueldo base que se escribe en el par�metro
	 * 
	 * @param sueldoBase
	 */
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	/**
	 * Retorna el pago por cada hora extra del empleado
	 * 
	 * @return
	 */
	public int getPagohExtra() {
		return pagohExtra;
	}

	/**
	 * Ingresa el pago por hora extra que se introduce por par�metro
	 * 
	 * @param pagohExtra
	 */
	public void setPagohExtra(int pagohExtra) {
		this.pagohExtra = pagohExtra;
	}

	/**
	 * Retorna las horas extras realizadas por el usuario
	 * 
	 * @return
	 */
	public int gethExtra() {
		return hExtra;
	}

	/**
	 * Ingresa en hExtra las horas extras escritas en el par�metro
	 * 
	 * @param hExtra
	 */
	public void sethExtra(int hExtra) {
		this.hExtra = hExtra;
	}

	/**
	 * Retorna el irp sobre el sueldo del empleado
	 * 
	 * @return
	 */
	public double getIrpf() {
		return irpf;
	}

	/**
	 * Selecciona el irp
	 * 
	 * @param irpf
	 */
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	/**
	 * Booleano que indica si el empleado est� o no casado
	 * 
	 * @return
	 */
	public boolean isCasado() {
		return casado;
	}

	/**
	 * Selecciona si el empleado est� casado a trav�s del par�metro
	 * 
	 * @param casado
	 */
	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	/**
	 * Retorna el n�mero de hijos del empleado
	 * 
	 * @return
	 */
	public int getNhijos() {
		return nhijos;
	}

	/**
	 * Selecciona el n�mero de hijos que tiene el empleado a trav�s de par�metro
	 * 
	 * @param nhijos
	 */
	public void setNhijos(int nhijos) {
		this.nhijos = nhijos;
	}

	/**
	 * Constructor vac�o
	 */
	Empleado() {
	}

	/**
	 * M�todo que muestra el pago total de las horas extras realizadas
	 * 
	 * @return
	 */
	public int muestraExtra() {
		return hExtra * pagohExtra;
	}

	/**
	 * M�todo que realiza el c�lculo del sueldo bruto
	 * 
	 * @return
	 */
	public int sueldoBruto() {
		return sueldoBase + muestraExtra();
	}

	/**
	 * M�todo que realiza el c�lculo del irpf seg�n si est� casado y el n�mero de
	 * hijos
	 * 
	 * @return
	 */
	public double irpf() {
		return (casado) ? (irpf - 2 - nhijos) : (irpf - nhijos);
	}

	/**
	 * Imprime los datos personales del empleado
	 */
	public void println() {
		System.out.println("Empleado NIF: " + nif);
		System.out.println("Casado: " + ((casado) ? "si" : "no"));
		System.out.println("N� Hijos: " + nhijos);
	}

	/**
	 * Imprime los datos financieros del empleado
	 */
	public void printAll() {
		println();
		System.out.println("Sueldo Base: " + sueldoBase + "�.");
		System.out.println("Sueldo Bruto: " + sueldoBruto() + "�.");
		System.out.println("Retenci�n IRPF: " + irpf() + "%.");
		System.out.println("Sueldo Neto: " + (sueldoBruto() * (irpf()) / 100) + "�.");
	}

	/**
	 * Realiza una copia de un objeto empleado
	 * 
	 * @param e
	 */
	public void copia(Empleado e) {
		this.nif = e.nif;
		this.sueldoBase = e.sueldoBase;
		this.pagohExtra = e.pagohExtra;
		this.hExtra = e.hExtra;
		this.irpf = e.irpf;
		this.casado = e.casado;
		this.nhijos = e.nhijos;
	}
}
