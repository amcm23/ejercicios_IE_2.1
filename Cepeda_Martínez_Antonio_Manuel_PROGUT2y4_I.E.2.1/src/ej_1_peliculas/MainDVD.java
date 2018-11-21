package ej_1_peliculas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainDVD {

	public static void main(String[] args) throws IOException {
		String salir = null;

		do {
			DVDCine dvd1 = new DVDCine(null, null, null, null, 0, null);
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
			boolean error;
			do { // evita introducir no entero o car�cteres
				try {
					error = true;
					dvd1.setDuracion(Integer.parseInt(leer.readLine()));
				} catch (NumberFormatException e) {
					error = false;
					System.out.println("Error " + e.getMessage());
					System.out.println("Introduzca un n�mero entero");
				}
			} while (!error);
			System.out.println("�Desea introducir un resumen de la pel�cula? (si/no)");
			if (leer.readLine().equalsIgnoreCase("si")) {
				System.out.println("Introduzca el resumen: ");
				dvd1.setResumen(leer.readLine());
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
			System.out.println("");
			System.out.println("�Desea introducir otra pel�cula? (si/no)");
			salir = leer.readLine();
		} while (!salir.equalsIgnoreCase("no"));
	}
}