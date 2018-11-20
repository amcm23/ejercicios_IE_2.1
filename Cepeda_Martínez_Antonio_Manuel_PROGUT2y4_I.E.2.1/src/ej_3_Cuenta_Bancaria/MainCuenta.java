package ej_3_Cuenta_Bancaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCuenta {

	public static void main(String[] args) throws NumberFormatException, IOException {

		boolean salir=false;
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bienvenido a nuestro sistema, a continuación, generaremos una cuenta para usted: ");
		Cuenta c1 = new Cuenta();
		c1.ncuenta += 1;
		System.out.println("Introduzca su DNI (sin letra): ");
		boolean error;
		do { // evita introducir no long o carácteres
			try {
				error = true;
				c1.setDni(Long.parseLong(leer.readLine()));
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca su DNI sin letra, por favor");
			}
		} while (!error);
		System.out.println("");
		System.out.println("Introduzca el interés anual (en %): ");
		do { // evita introducir no float o carácteres
			try {
				error = true;
				Cuenta.setInteres(Float.parseFloat(leer.readLine()));
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca su DNI sin letra, por favor");
			}
		} while (!error);
		do {
			System.out.println("El estado de su cuenta actualmente es: ");
			System.out.println("");
			System.out.println(c1.muestraCuenta());
			System.out.println("");
			System.out.println("¿Que acción desea realizar? (1/2/3/4)");
			System.out.println("1.Actualizar saldo (aplicar interés diario)");
			System.out.println("2.Ingresar efectivo");
			System.out.println("3.Retirar efectivo");
			System.out.println("4.Salir del programa");
			switch (Integer.parseInt(leer.readLine())) {
			case 1:
				c1.actualizarSaldo();
				System.out.println("Su saldo ha sido actualizado.");
				System.out.println("");
				break;
			case 2:
				System.out.println("Inserte la cantidad a ingresar: ");
				do { // evita introducir no double o carácteres
					try {
						error = true;
						c1.ingresar(Double.parseDouble(leer.readLine()));
					} catch (NumberFormatException e) {
						error = false;
						System.out.println("Error " + e.getMessage());
						System.out.println("Introduzca un número");
					}
				} while (!error);
				break;
			case 3:
				System.out.println("Inserte la cantidad a retirar: ");
				do { // evita introducir no double o carácteres
					try {
						error = true;
						c1.retirar(Double.parseDouble(leer.readLine()));
					} catch (NumberFormatException e) {
						error = false;
						System.out.println("Error " + e.getMessage());
						System.out.println("Introduzca un número");
					}
				} while (!error);
				break;
			case 4:
				salir=true;
				break;
			default:
				break;
			}
		} while (salir != true);
	}

}
