package ej_01_peliculas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

/**
 * @author Antonio M Cepeda
 */
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
			Try m1 = new Try(); //instancia la clase trycatch
			dvd1.setDuracion(m1.tryInt());
			System.out.println("¿Desea introducir un resumen de la película? (si/no)");
			if (leer.readLine().equalsIgnoreCase("si")) { //si escribe si, le pide la introducción del resumen
				System.out.println("Introduzca el resumen: ");
				dvd1.setResumen(leer.readLine());
			}
			System.out.println("");
			System.out.println(dvd1.muestraDVDCine());
			System.out.println("");
			if (dvd1.esThriller() == true) { //si trhiller es si
				System.out.println("La película es un Thriller");
			} else { //sino
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
		} while (!salir.equalsIgnoreCase("no")); //opción de salir
	}
}