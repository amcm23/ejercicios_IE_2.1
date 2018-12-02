package ej_03_Cuenta_Bancaria;

import java.io.IOException;
import metodosGenerales.Try;

/**
 * @author Antonio M Cepeda
 */
public class MainCuenta {

	public static void main(String[] args) throws NumberFormatException, IOException {

		boolean salir = false;
		System.out.println("Bienvenido a nuestro sistema, a continuación, generaremos una cuenta para usted: ");
		Cuenta c1 = new Cuenta();
		Try m1 = new Try(); // instancia de la clase TryCatch
		Cuenta.ncuenta += 1; // añade un número de cuenta propio a cada cuenta creada
		System.out.println("Introduzca su DNI (sin letra): ");
		c1.setDni(m1.tryLong());
		System.out.println("");
		System.out.println("Introduzca el interés anual (en %): ");
		Cuenta.setInteres(m1.tryFloat());
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
			switch (m1.tryMinMaxInt(1, 4)) {
			case 1:
				c1.actualizarSaldo();
				System.out.println("Su saldo ha sido actualizado.");
				System.out.println("");
				break;
			case 2:
				System.out.println("Inserte la cantidad a ingresar: ");
				c1.ingresar(m1.tryDouble());
				break;
			case 3:
				System.out.println("Inserte la cantidad a retirar: ");
				c1.retirar(m1.tryDouble());
				break;
			case 4:
				salir = true;
				break;
			}
		} while (salir != true); //opción de salir
	}

}
