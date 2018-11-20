package ej_4_Cafetera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCafetera {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean salir = false;

		System.out.println("Bienvenido: ");
		System.out.println("");
		System.out.println("¿Cual es la capacidad máxima de su cafetera?");
		boolean error;
		int taza = 0;
		
		Cafetera c1 = new Cafetera();
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				c1.setCapacidadMaxima(Integer.parseInt(leer.readLine()));
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
		} while (!error);
		System.out.println("Inserte la capacidad de sus tazas: ");
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				taza=Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
		} while (!error);
		
		do {
			System.out.println(c1.muestraCafetera());
			System.out.println("");
			System.out.println("¿Qué acción desea realizar?: ");
			System.out.println("");
			System.out.println("1.Llenar la cafetera");
			System.out.println("2.Servir una taza de café");
			System.out.println("3.Vaciar la cafetera");
			System.out.println("4.Agregar café a la cafetera");
			System.out.println("5.Salir del programa");
			switch (Integer.parseInt(leer.readLine())) {
			case 1:
				c1.llenarCafetera();
				break;
			case 2:
				c1.servirTaza(taza);
				break;
			case 3:
				c1.vaciarCafetera();
				break;
			case 4:
				System.out.println("¿Cuántos c.c. de café desea agregar?");
				c1.agregarCafe(Integer.parseInt(leer.readLine()));
				break;
			case 5:
				salir=true;
				break;

			default:
				break;
			}
		} while (salir != true);
		System.out.println("");
		System.out.println("Hasta pronto");

	}

}
