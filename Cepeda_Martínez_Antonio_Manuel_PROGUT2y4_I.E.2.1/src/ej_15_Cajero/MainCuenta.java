package ej_15_Cajero;

import java.io.IOException;

import metodosGenerales.Try;

public class MainCuenta {

	public static void main(String[] args) throws IOException {

		Try t=new Try();
		boolean salir=false;
		Cuenta c=null;
		do {
		System.out.println("");
		System.out.println("¡Bienvenido!");
		System.out.println("Seleccione la operación a realizar: ");
		System.out.println("1.-Crear cuenta vacía.");
		System.out.println("2.-Crear cuenta con saldo inicial.");
		System.out.println("3.-Ingresar dinero.");
		System.out.println("4.-Sacar dinero.");
		System.out.println("5.-Ver saldo.");
		System.out.println("6.-Salir");
		switch (t.tryMaxInt(1, 6)) {
		case 1:
			c=new Cuenta(0);
			System.out.println("Cuenta vacía creada con éxito.");
			break;
		case 2:
			System.out.println("Inserte el saldo inicial de la cuenta: ");
			c=new Cuenta(t.tryFloat());
			System.out.println("Cuenta creada con éxito.");
			break;
		case 3:
			System.out.println("Inserte la cantidad a ingresar: ");
			c.ingresar(t.tryFloat());
			break;
		case 4:
			System.out.println("Inserte la cantidad a extraer: ");
			c.extraer(t.tryFloat());
			break;
		case 5:
			System.out.println("Saldo actual: "+c.getSaldo()+"€.");
			break;
		case 6:
			System.out.println("Hasta pronto.");
			salir=true;
			break;
		}
		
		} while(!salir);

	}

}
