package ej_10_PapasChocos;

import java.io.IOException;
import metodosGenerales.Try;

public class MainPapasChocos {

	public static void main(String[] args) throws IOException {

		PapasChocos pc = new PapasChocos();
		boolean salir = false;
		do {
			Try t = new Try();
			System.out.println("Kg de papas actuales: " + pc.showPapas() + " kg.");
			System.out.println("Kg de chocos actuales: " + pc.showChocos() + " kg.");
			System.out.println("Actualmente puede servir a: " + pc.getComensales() + " comensales.");
			System.out.println("");
			System.out.println("¿Qué acción desea realizar? (1/2/3)");
			System.out.println("1.Añadir papas.");
			System.out.println("2.Añadir chocos.");
			System.out.println("3.Salir del programa.");
			switch (t.tryInt()) {
			case 1:
				System.out.println("Introduzca la cantidad de papas a añadir (en kg): ");
				pc.addPapas(t.tryInt());
				break;
			case 2:
				System.out.println("Introduzca la cantidad de chocos a añadir (en kg): ");
				pc.addChocos(t.tryInt());
				break;
			case 3:
				salir = true;
				break;
			default:
				break;
			}
		} while (!salir);
	}

}
