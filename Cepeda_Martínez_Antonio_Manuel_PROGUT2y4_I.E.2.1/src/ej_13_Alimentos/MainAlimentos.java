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
		System.out.println("Nombre (código alfanumérico): ");
		Alimento a = new Alimento(leer.readLine());
		System.out.println("Contenido en lípidos (%): ");
		a.setLipidos(t.tryMinMaxDouble(0, 100));
		System.out.println("Contenido en hidratos de carbono (%): ");
		a.setHidratos(t.tryMinMaxDouble(0, (int) (100 - a.getLipidos()))); // el mínimo será 0 y el máximo será lo que
																			// falte hasta el 100% después de haber
																			// introducido el % en lípidos
		System.out.println("Contenido en proteínas calculado automáticamente.");
		a.setProteinas(100 - (a.getLipidos() + a.getHidratos())); // el contenido en proteínas será lo restante hasta
																	// llegar al 100%
		System.out.println("");
		System.out.println("¿Es el alimento de origen animal?: (si/no)");
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
		System.out.println("¿Desea salir del programa (si/no)?");
		salir=leer.readLine();
		}while (!salir.equalsIgnoreCase("si")); //opción de salir
		System.out.println("Hasta pronto.");
	}

}
