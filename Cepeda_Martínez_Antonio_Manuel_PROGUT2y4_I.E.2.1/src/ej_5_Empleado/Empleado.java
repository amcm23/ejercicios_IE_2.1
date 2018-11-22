package ej_5_Empleado;

public class Empleado {

	private String nif;
	private int sueldoBase;
	private int pagohExtra;
	private int hExtra;
	private double irpf;
	private boolean casado;
	private int nhijos;

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getPagohExtra() {
		return pagohExtra;
	}

	public void setPagohExtra(int pagohExtra) {
		this.pagohExtra = pagohExtra;
	}

	public int gethExtra() {
		return hExtra;
	}

	public void sethExtra(int hExtra) {
		this.hExtra = hExtra;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getNhijos() {
		return nhijos;
	}

	public void setNhijos(int nhijos) {
		this.nhijos = nhijos;
	}

	Empleado() { // constructor vacío
	}

	public int muestraExtra() {
		return hExtra * pagohExtra;
	}

	public int sueldoBruto() {
		return sueldoBase + muestraExtra();
	}

	public double irpf() {
		return (casado) ? (irpf - 2 - nhijos) : (irpf - nhijos);
	}

	public void println() {
		System.out.println("Empleado NIF: " + nif);
		System.out.println("Casado: " + ((casado) ? "si" : "no"));
		System.out.println("Nº Hijos: " + nhijos);
	}

	public void printAll() {
		println();
		System.out.println("Sueldo Base: " + sueldoBase + "€.");
		System.out.println("Sueldo Bruto: " + sueldoBruto() + "€.");
		System.out.println("Retención IRPF: " + irpf() + "%.");
		System.out.println("Sueldo Neto: " + (sueldoBruto() * (irpf()) / 100) + "€.");
	}

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
