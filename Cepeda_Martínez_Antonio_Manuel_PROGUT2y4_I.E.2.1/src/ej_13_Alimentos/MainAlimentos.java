package ej_13_Alimentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class MainAlimentos {

	public static void main(String[] args) throws IOException {

		Try t = new Try();
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bienvenido, introduzca los datos del alimento: ");
		System.out.println("Nombre (código alfanumérico): ");
		Alimento a = new Alimento(leer.readLine());
		System.out.println("Contenido en lípidos (%): ");
		a.setLipidos(t.tryMaxDouble(0, 100));
		System.out.println("Contenido en hidratos de carbono (%): ");
		a.setHidratos(t.tryMaxDouble(0, 100));
		System.out.println("Contenido en proteínas (%): ");
		a.setProteinas(t.tryMaxDouble(0, 100));
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
		switch (t.tryMaxInt(1, 3)) {
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
		switch (t.tryMaxInt(1, 3)) {
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

	}

}
