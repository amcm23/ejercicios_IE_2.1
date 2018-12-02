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
	 * Atributo boolean que señala si el empleado está o no casado
	 */
	private boolean casado;
	/**
	 * Atributo que señala el número de hijos que tiene el empleado
	 */
	private int nhijos;

	/**
	 * Método que retorna el DNI del empleado
	 * 
	 * @return nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * Ingresa en el nif el dni introducido por parámetro
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
	 * Ingresa el sueldo base que se escribe en el parámetro
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
	 * Ingresa el pago por hora extra que se introduce por parámetro
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
	 * Ingresa en hExtra las horas extras escritas en el parámetro
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
	 * Booleano que indica si el empleado está o no casado
	 * 
	 * @return
	 */
	public boolean isCasado() {
		return casado;
	}

	/**
	 * Selecciona si el empleado está casado a través del parámetro
	 * 
	 * @param casado
	 */
	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	/**
	 * Retorna el número de hijos del empleado
	 * 
	 * @return
	 */
	public int getNhijos() {
		return nhijos;
	}

	/**
	 * Selecciona el número de hijos que tiene el empleado a través de parámetro
	 * 
	 * @param nhijos
	 */
	public void setNhijos(int nhijos) {
		this.nhijos = nhijos;
	}

	/**
	 * Constructor vacío
	 */
	Empleado() {
	}

	/**
	 * Método que muestra el pago total de las horas extras realizadas
	 * 
	 * @return
	 */
	public int muestraExtra() {
		return hExtra * pagohExtra;
	}

	/**
	 * Método que realiza el cálculo del sueldo bruto
	 * 
	 * @return
	 */
	public int sueldoBruto() {
		return sueldoBase + muestraExtra();
	}

	/**
	 * Método que realiza el cálculo del irpf según si está casado y el número de
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
		System.out.println("Nº Hijos: " + nhijos);
	}

	/**
	 * Imprime los datos financieros del empleado
	 */
	public void printAll() {
		println();
		System.out.println("Sueldo Base: " + sueldoBase + "€.");
		System.out.println("Sueldo Bruto: " + sueldoBruto() + "€.");
		System.out.println("Retención IRPF: " + irpf() + "%.");
		System.out.println("Sueldo Neto: " + (sueldoBruto() * (irpf()) / 100) + "€.");
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
