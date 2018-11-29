package ej_17_Ordenador;

public class Portatil extends Ordenador{
	
	private String marca;
	private double tama�o_pantalla;
	private double peso;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Portatil(int ram,int disco_duro,String mod_procesador,float precio,String marca, double tama�o_pantalla, double peso) {
		super(ram, disco_duro, mod_procesador, precio);
		this.marca = marca;
		this.tama�o_pantalla = tama�o_pantalla;
		this.peso = peso;
	}
	
	public Portatil() {}
	
	public double getTama�o_pantalla() {
		return tama�o_pantalla;
	}
	public void setTama�o_pantalla(double tama�o_pantalla) {
		this.tama�o_pantalla = tama�o_pantalla;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String mostrarPortatil() {
		return "RAM: "+ram+"\nCapacidad Disco Duro: "+disco_duro+"\nModelo del procesador: "+mod_procesador+
				"\nPrecio: "+precio+"\nMarca: "+marca+"\nTama�o de la pantalla: "+tama�o_pantalla+"Peso: "+peso; 
	}
	
}
