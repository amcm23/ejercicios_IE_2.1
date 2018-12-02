package ej_16_Personajes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

/**
 * @author Antonio M Cepeda
 */
public class Test {

	public static void main(String[] args) throws IOException {

		Try t = new Try(); // instancia la clase trycatch
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean salir = false;
		System.out.println("Comienza el combate.");
		System.out.println("Introduzca el nombre del guerrero y el nombre de su arma.");
		Guerrero g = new Guerrero(leer.readLine(), leer.readLine(), 50);
		do {
			System.out.println("El guerrero " + g.getNombre() + " espera ansioso tu orden.");
			System.out.println("Seleccione acción (1/2/3):                        Energía actual: " + g.getEnergia()+ "/" + g.getMaxenergia());
			System.out.println("1.Alimentarse. (+5e)");
			System.out.println("2.Combatir (-3e)");
			System.out.println("3.Dejar de usar este personaje.");
			switch (t.tryMinMaxInt(1, 3)) {
			case 1:
				g.alimentarse(5);
				break;
			case 2:
				System.out.println(g.combatir(3));
				break;
			case 3:
				salir = true;
				System.out.println("El guerrero " + g.getNombre() + " abandona el combate.");
				break;
			}
		} while (!salir);

		System.out.println("Introduzca el nombre del mago y el nombre de su poder: ");
		Mago m = new Mago(leer.readLine(), leer.readLine());
		salir = false;
		do {
			System.out.println("El mago " + m.getNombre() + " espera pacientemente tu orden.");
			System.out.println("Seleccione acción (1/2/3):                        Energía actual: " + m.getEnergia()+ "/" + m.getMaxenergia());
			System.out.println("1.Alimentarse. (+5e)");
			System.out.println("2.Encantar (-2e)");
			System.out.println("3.Dejar de usar este personaje y finalizar el combate.");
			switch (t.tryMinMaxInt(1, 3)) {
			case 1:
				m.alimentarse(5);
				break;
			case 2:
				System.out.println(m.encantar());
				break;
			case 3:
				salir = true;
				System.out.println("El mago " + m.getNombre() + " abandona el combate.");
				break;
			}

		} while (!salir);

		System.out.println("Finaliza el combate.");

	}

}
