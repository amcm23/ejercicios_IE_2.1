package ej_2_vehículo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainVehiculo {

	public static void main(String[] args) throws IOException {
		
		String salir=null;
		do {	
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el modelo del coche: ");
		Vehiculo v1 = new Vehiculo(leer.readLine());
		System.out.println("");
		System.out.println("Introduzca la potencia del coche (en CV)");
		boolean error;
		do { // evita introducir carácteres
			try {
				error = true;
				v1.setPotencia(Double.parseDouble(leer.readLine()));
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
		} while (!error);
		
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
		salir=leer.readLine();
	}while(!salir.equalsIgnoreCase("no"));
	}

}
