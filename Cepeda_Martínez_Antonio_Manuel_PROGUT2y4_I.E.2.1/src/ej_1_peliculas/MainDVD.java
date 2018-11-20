package ej_1_peliculas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainDVD {

	public static void main(String[] args) throws IOException {

		String n = null;

		DVDCine dvd1 = new DVDCine(null, null, null, null, null, null);
		System.out.println("Inserte el t�tulo de la pel�cula: ");
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		dvd1.setTitulo(leer.readLine());
		System.out.println("Inserte el director de la pel�cula: ");
		dvd1.setDirector(leer.readLine());
		System.out.println("Inserte los actores de la pel�cula (en la misma l�nea)");
		dvd1.setActores(leer.readLine());
		System.out.println("Inserte la categor�a de la pel�cula (ej: thriller,comedia,etc.)");
		dvd1.setCategoria(leer.readLine());
		System.out.println("Inserte la duraci�n de la pel�cula (en minutos)");
		dvd1.setDuracion(leer.readLine());
		System.out.println("�Desea introducir un resumen de la pel�cula? (si/no)");
		n = leer.readLine();
		if (n.equalsIgnoreCase("si")) {
			System.out.println("Introduzca el resumen: ");
			dvd1.setResumen(leer.readLine());
		} else {
			dvd1.setResumen(null);
		}
		System.out.println("");
		System.out.println(dvd1.muestraDVDCine());
		System.out.println("");
		if (dvd1.esThriller() == true) {
			System.out.println("La pel�cula es un Thriller");
		} else {
			System.out.println("La pel�cula no es un Thriller");
		}
		System.out.println("");
		if (dvd1.tieneResumen() == true) {
			System.out.println("La pel�cula tiene resumen");
		} else {
			System.out.println("La pel�cula carece de resumen");
		}
		System.out.println("");
		System.out.println("La pel�cula tiene una duraci�n de " + dvd1.muestraDuracion());
	}
}
