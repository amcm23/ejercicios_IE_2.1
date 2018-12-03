package ej_15_Cajero;

import java.io.IOException;

import metodosGenerales.Try;

/**
 * @author Antonio M Cepeda
 */
public class MainCuenta {

	public static void main(String[] args) throws IOException {

		Try t = new Try(); // Instanciaci�n de la clase trycatch
		boolean salir = false;
		Cuenta c = null;
		System.out.println("�Bienvenido!");
		do {
			System.out.println("");
			System.out.println("Seleccione la operaci�n a realizar: ");
			System.out.println("1.-Crear cuenta vac�a.");
			System.out.println("2.-Crear cuenta con saldo inicial.");
			System.out.println("3.-Ingresar dinero.");
			System.out.println("4.-Sacar dinero.");
			System.out.println("5.-Ver saldo.");
			System.out.println("6.-Salir.");
			switch (t.tryMinMaxInt(1, 6)) {
			case 1:
				c = new Cuenta(0);
				System.out.println("Cuenta vac�a creada con �xito.");
				break;
			case 2:
				System.out.println("Inserte el saldo inicial de la cuenta: ");
				c = new Cuenta(t.tryMinFloat(0));
				System.out.println("Cuenta creada con �xito.");
				break;
			case 3:
				if (c == null) {
					System.out.println("Cree una cuenta primero.");
					break;
				} else {
					System.out.println("Inserte la cantidad a ingresar: ");
					c.ingresar(t.tryMinFloat(0));
					break;
				}
			case 4:
				if (c == null) {
					System.out.println("Cree una cuenta primero.");
					break;
				} else {
					System.out.println("Inserte la cantidad a extraer: ");
					c.extraer(t.tryMinFloat(0));
					break;
				}
			case 5:
				if (c == null) {
					System.out.println("Cree una cuenta primero.");
					break;
				} else {
					System.out.println("Saldo actual: " + c.getSaldo() + "�.");
					break;
				}
			case 6:
				System.out.println("Hasta pronto.");
				salir = true;
				break;
			}

		} while (!salir);

	}

}
