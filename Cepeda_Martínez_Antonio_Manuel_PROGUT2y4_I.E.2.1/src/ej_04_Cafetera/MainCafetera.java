package ej_04_Cafetera;

import java.io.IOException;

import metodosGenerales.Try;

/**
 * @author Antonio M Cepeda
 */
public class MainCafetera {

	public static void main(String[] args) throws IOException {

		boolean salir = false;

		System.out.println("Bienvenido: ");
		System.out.println("");
		System.out.println("�Cual es la capacidad m�xima de su cafetera?");
		int taza = 0;
		Try m1 = new Try(); // instancia la clase TryCatch
		Cafetera c1 = new Cafetera();
		c1.setCapacidadMaxima(m1.tryMinInt(0));
		System.out.println("Inserte la capacidad de sus tazas: ");
		taza = m1.tryMinInt(0);
		do {
			System.out.println(c1.muestraCafetera());
			System.out.println("");
			System.out.println("�Qu� acci�n desea realizar?: ");
			System.out.println("");
			System.out.println("1.Llenar la cafetera");
			System.out.println("2.Servir una taza de caf�");
			System.out.println("3.Vaciar la cafetera");
			System.out.println("4.Agregar caf� a la cafetera");
			System.out.println("5.Salir del programa");
			switch (m1.tryMinMaxInt(1, 5)) {
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
				System.out.println("�Cu�ntos c.c. de caf� desea agregar?");
				c1.agregarCafe(m1.tryMinInt(0));
				break;
			case 5:
				salir = true;
				break;
			}
		} while (salir != true); //opci�n de salir
		System.out.println("");
		System.out.println("Hasta pronto");

	}

}
