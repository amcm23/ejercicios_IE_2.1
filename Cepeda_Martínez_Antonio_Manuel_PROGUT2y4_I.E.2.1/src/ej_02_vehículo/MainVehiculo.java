package ej_02_veh�culo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

/**
 * @author Antonio M Cepeda
 */
public class MainVehiculo {

	public static void main(String[] args) throws IOException {

		Try m1 = new Try(); // instancia la clase TryCatch
		String salir = null;
		do {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduzca el modelo del coche: ");
			Vehiculo v1 = new Vehiculo(leer.readLine());
			System.out.println("");
			System.out.println("Introduzca la potencia del coche (en CV)");
			v1.setPotencia(m1.tryMinDouble(0));
			System.out.println("");
			System.out.println("�El veh�culo tiene tracci�n a las 4 ruedas? (si/no)");
			if (leer.readLine().equalsIgnoreCase("si")) { // si introduce si
				v1.setcRuedas(true); // cRuedas=true
			} else { // sino
				v1.setcRuedas(false); // false
			}
			System.out.println("");
			System.out.println("Descripci�n del Coche: ");
			System.out.println(v1.imprimir());
			System.out.println("");
			System.out.println("�Desea introducir datos de otro coche? (si/no)");
			salir = leer.readLine();
		} while (!salir.equalsIgnoreCase("no")); // opci�n de salir
		System.out.println("Hasta pronto.");
	}

}
