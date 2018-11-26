package ej_02_vehículo;

public class Vehiculo {

	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	Vehiculo (String modelo){
		this.modelo=modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public boolean iscRuedas() {
		return cRuedas;
	}

	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	public String imprimir(){
		return "El vehículo es un "+modelo+"\nTiene "+potencia+" CV de potencia"+
	"\nTracción a las 4 ruedas: "+cRuedas;
	}
}
