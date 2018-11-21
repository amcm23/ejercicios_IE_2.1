package ej_1_peliculas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainDVD {

	public static void main(String[] args) throws IOException {
		String salir = null;

		do {
			DVDCine dvd1 = new DVDCine(null, null, null, null, 0, null);
			System.out.println("Inserte el título de la película: ");
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			dvd1.setTitulo(leer.readLine());
			System.out.println("Inserte el director de la película: ");
			dvd1.setDirector(leer.readLine());
			System.out.println("Inserte los actores de la película (en la misma línea)");
			dvd1.setActores(leer.readLine());
			System.out.println("Inserte la categoría de la película (ej: thriller,comedia,etc.)");
			dvd1.setCategoria(leer.readLine());
			System.out.println("Inserte la duración de la película (en minutos)");
			boolean error;
			do { // evita introducir no entero o carácteres
				try {
					error = true;
					dvd1.setDuracion(Integer.parseInt(leer.readLine()));
				} catch (NumberFormatException e) {
					error = false;
					System.out.println("Error " + e.getMessage());
					System.out.println("Introduzca un número entero");
				}
			} while (!error);
			System.out.println("¿Desea introducir un resumen de la película? (si/no)");
			if (leer.readLine().equalsIgnoreCase("si")) {
				System.out.println("Introduzca el resumen: ");
				dvd1.setResumen(leer.readLine());
			}
			System.out.println("");
			System.out.println(dvd1.muestraDVDCine());
			System.out.println("");
			if (dvd1.esThriller() == true) {
				System.out.println("La película es un Thriller");
			} else {
				System.out.println("La película no es un Thriller");
			}
			System.out.println("");
			if (dvd1.tieneResumen() == true) {
				System.out.println("La película tiene resumen");
			} else {
				System.out.println("La película carece de resumen");
			}
			System.out.println("");
			System.out.println("La película tiene una duración de " + dvd1.muestraDuracion());
			System.out.println("");
			System.out.println("¿Desea introducir otra película? (si/no)");
			salir = leer.readLine();
		} while (!salir.equalsIgnoreCase("no"));
	}
}