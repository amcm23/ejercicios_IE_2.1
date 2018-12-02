package ej_13_Alimentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class MainAlimentos {

	public static void main(String[] args) throws IOException {

		String salir=null;
		do {
		Try t = new Try(); // instancia la clase trycatch
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bienvenido, introduzca los datos del alimento: ");
		System.out.println("Nombre (c�digo alfanum�rico): ");
		Alimento a = new Alimento(leer.readLine());
		System.out.println("Contenido en l�pidos (%): ");
		a.setLipidos(t.tryMinMaxDouble(0, 100));
		System.out.println("Contenido en hidratos de carbono (%): ");
		a.setHidratos(t.tryMinMaxDouble(0, (int) (100 - a.getLipidos()))); // el m�nimo ser� 0 y el m�ximo ser� lo que
																			// falte hasta el 100% despu�s de haber
																			// introducido el % en l�pidos
		System.out.println("Contenido en prote�nas calculado autom�ticamente.");
		a.setProteinas(100 - (a.getLipidos() + a.getHidratos())); // el contenido en prote�nas ser� lo restante hasta
																	// llegar al 100%
		System.out.println("");
		System.out.println("�Es el alimento de origen animal?: (si/no)");
		if (leer.readLine().equalsIgnoreCase("si")) {
			a.setOrigen_animal(true);
		} else {
			a.setOrigen_animal(false);
		}
		System.out.println("Contenido en vitaminas: ");
		System.out.println("1.Alto (A)");
		System.out.println("2.Medio (M)");
		System.out.println("3.Bajo (B)");
		switch (t.tryMinMaxInt(1, 3)) {
		case 1:
			a.setVitaminas('A');
			break;
		case 2:
			a.setVitaminas('M');
			break;
		case 3:
			a.setVitaminas('B');
			break;
		}

		System.out.println("Contenido en minerales");
		System.out.println("1.Alto (A)");
		System.out.println("2.Medio (M)");
		System.out.println("3.Bajo (B)");
		switch (t.tryMinMaxInt(1, 3)) {
		case 1:
			a.setMinerales('A');
			break;
		case 2:
			a.setMinerales('M');
			break;
		case 3:
			a.setMinerales('B');
			break;
		}

		System.out.println("");
		System.out.println("Datos del alimento: ");
		System.out.println(a.muestraAlimento());

		System.out.println("");
		System.out.println("�Desea salir del programa (si/no)?");
		salir=leer.readLine();
		}while (!salir.equalsIgnoreCase("si")); //opci�n de salir
		System.out.println("Hasta pronto.");
	}

}
