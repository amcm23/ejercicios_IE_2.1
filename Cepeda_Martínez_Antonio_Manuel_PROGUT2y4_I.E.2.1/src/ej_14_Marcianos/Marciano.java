package ej_14_Marcianos;

public class Marciano {

	private boolean vivo = false;
	private String nombre;
	private static int numMarcianos = 0;

	
	public Marciano(String nombre) {
		vivo = true;
		this.nombre = nombre;
		numMarcianos++;
		nace();
	}
	
	public void nace() {
		System.out.println("Hola, he nacido y soy el marciano " + nombre);
	}


	public String getNombre() {
		return nombre;
	}

	public void muere() {
		if (vivo == true) {
			vivo = false;
			System.out.println("El marciano " + nombre + " ha muerto.");
		} else {
			System.out.println("El marciano ya está muerto.");
		}
	}

	public boolean estaVivo() {
		return vivo;
	}

	public int cuentaMarcianos() {
		return numMarcianos;
	}

}
