package ej_4_Cafetera;

public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;

	Cafetera() {
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}

	Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		cantidadActual = capacidadMaxima;
	}

	Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
		if (cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
	}

	public void servirTaza(int taza) {
		if (cantidadActual - taza < 0) {
			taza = cantidadActual;
			cantidadActual = 0;
			System.out.println("Vaya, no habia suficiente caf�, ha rellenado una taza con " + taza + " c.c.");
		} else {
			cantidadActual -= taza;
			System.out.println("Ha rellenado una taza de " + taza + " c.c.");
		}
	}

	public void vaciarCafetera() {
		cantidadActual = 0;
	}

	public void agregarCafe(int cafe) {
		if(cantidadActual+cafe>capacidadMaxima){
			System.out.println("No puede agregar tanto caf� a la cafetera");
		} else {
		cantidadActual += cafe;
		}
	}
	public String muestraCafetera() {
		return "La cantidad actual de caf� es de "+cantidadActual+" de un m�ximo de "+capacidadMaxima+" c.c.";
		
	}
}
