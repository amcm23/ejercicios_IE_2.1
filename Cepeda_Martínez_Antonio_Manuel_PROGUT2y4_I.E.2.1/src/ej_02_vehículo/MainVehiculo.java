package ej_02_vehículo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class MainVehiculo {

	public static void main(String[] args) throws IOException {

		Try m1 = new Try();
		String salir = null;
		do {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduzca el modelo del coche: ");
			Vehiculo v1 = new Vehiculo(leer.readLine());
			System.out.println("");
			System.out.println("Introduzca la potencia del coche (en CV)");
			v1.setPotencia(m1.tryDouble());
			System.out.println("");
			System.out.println("¿El vehículo tiene tracción a las 4 ruedas? (si/no)");
			if (leer.readLine().equalsIgnoreCase("si")) {
				v1.setcRuedas(true);
			} else {
				v1.setcRuedas(false);
			}
			System.out.println("");
			System.out.println("Descripción del Coche: ");
			System.out.println(v1.imprimir());
			System.out.println("");
			System.out.println("¿Desea introducir datos de otro coche? (si/no)");
			salir = leer.readLine();
		} while (!salir.equalsIgnoreCase("no"));
	}

}
