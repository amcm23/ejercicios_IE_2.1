package ej_5_Empleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEmpleado {

	public static void main(String[] args) throws IOException {
		
		BufferedReader leer=new BufferedReader (new InputStreamReader(System.in));
		boolean error;
		
		System.out.println("Bienvenido, ingrese el dni del empleado: ");
		Empleado e1=new Empleado();
		e1.setNif(leer.readLine());
		System.out.println("");
		System.out.println("Inserte el sueldo base: ");
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				e1.setSueldoBase(Integer.parseInt(leer.readLine()));
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
		} while (!error);
		System.out.println("");
		System.out.println("Inserte las horas extras realizadas este mes: ");
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				e1.sethExtra(Integer.parseInt(leer.readLine()));
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
		} while (!error);
		System.out.println("");
		System.out.println("Inserte el pago por hora extra: ");
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				e1.setPagohExtra(Integer.parseInt(leer.readLine()));
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
		} while (!error);
		System.out.println("");
		System.out.println("Inserte el tipo de IRPF (%): ");
		do { // evita introducir no double o carácteres
			try {
				error = true;
				e1.setIrpf(Double.parseDouble(leer.readLine()));
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
		} while (!error);
		System.out.println("");
		System.out.println("¿Está el empleado casado? (si/no)");
		e1.setCasado((leer.readLine().equalsIgnoreCase("si")? true:false));
		System.out.println("");
		System.out.println("Inserte el nº de hijos: ");
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				e1.setNhijos(Integer.parseInt(leer.readLine()));
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
		} while (!error);
		System.out.println("");
		e1.printAll();
	}

}
