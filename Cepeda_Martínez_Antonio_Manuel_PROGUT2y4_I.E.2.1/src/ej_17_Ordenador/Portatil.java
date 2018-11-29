package ej_17_Ordenador;

public class Portatil extends Ordenador{
	
	private String marca;
	private double tamaño_pantalla;
	private double peso;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Portatil(int ram,int disco_duro,String mod_procesador,float precio,String marca, double tamaño_pantalla, double peso) {
		super(ram, disco_duro, mod_procesador, precio);
		this.marca = marca;
		this.tamaño_pantalla = tamaño_pantalla;
		this.peso = peso;
	}
	
	public Portatil() {}
	
	public double getTamaño_pantalla() {
		return tamaño_pantalla;
	}
	public void setTamaño_pantalla(double tamaño_pantalla) {
		this.tamaño_pantalla = tamaño_pantalla;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String mostrarPortatil() {
		return "RAM: "+ram+"\nCapacidad Disco Duro: "+disco_duro+"\nModelo del procesador: "+mod_procesador+
				"\nPrecio: "+precio+"\nMarca: "+marca+"\nTamaño de la pantalla: "+tamaño_pantalla+"Peso: "+peso; 
	}
	
}
