package ej_16_Personajes;

public class Personajes {

	protected String nombre;
	protected int energia;
	protected int maxenergia;

	public int getMaxenergia() {
		return maxenergia;
	}

	Personajes(String nombre, int maxenergia) {

		this.nombre = nombre;
		this.maxenergia = maxenergia;
		energia=maxenergia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void alimentarse(int ener) {
		if((energia+ener)>maxenergia) {
			System.out.println("La energía está al máximo, se han podido añadir "+(maxenergia-energia)+" de energía.");
			energia=maxenergia;
		} else {
			energia += ener;
			System.out.println(nombre+" toma un poco de comida de su bolsa, incrementando su energía "+ener+" puntos.");
		}
		
	}
}
