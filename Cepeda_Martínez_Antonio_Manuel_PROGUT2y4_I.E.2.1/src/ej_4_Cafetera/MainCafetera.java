package ej_4_Cafetera;

import java.io.IOException;

import metodosGenerales.Try;

public class MainCafetera {

	public static void main(String[] args) throws IOException {

		boolean salir = false;

		System.out.println("Bienvenido: ");
		System.out.println("");
		System.out.println("¿Cual es la capacidad máxima de su cafetera?");
		int taza = 0;
		Try m1 = new Try();
		Cafetera c1 = new Cafetera();
		c1.setCapacidadMaxima(m1.tryInt());
		System.out.println("Inserte la capacidad de sus tazas: ");
		taza = m1.tryInt();
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
			switch (m1.tryInt()) {
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
				c1.agregarCafe(m1.tryInt());
				break;
			case 5:
				salir = true;
				break;

			default:
				break;
			}
		} while (salir != true);
		System.out.println("");
		System.out.println("Hasta pronto");

	}

}
