package ej_12_sueldobruto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class MainSBruto {

	public static void main(String[] args) throws IOException {

		Try t = new Try(); // instancia la clase trycatch
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		// datos empleado 1
		System.out.println("Bienvenido introduzca los datos del empleado 1: ");
		System.out.println("Nombre: ");
		Empleado e1 = new Empleado();
		e1.setNombre(leer.readLine());
		System.out.println("Horas de trabajo: ");
		e1.setNhoras(t.tryMinDouble(0));
		System.out.println("Pago por hora: ");
		e1.setTarifa(t.tryMinDouble(0));
		System.out.println("");
		// Datos empleado 2
		System.out.println("Bienvenido introduzca los datos del empleado 2: ");
		System.out.println("Nombre: ");
		Empleado e2 = new Empleado();
		e2.setNombre(leer.readLine());
		System.out.println("Horas de trabajo: ");
		e2.setNhoras(t.tryMinDouble(0));
		System.out.println("Pago por hora: ");
		e2.setTarifa(t.tryMinDouble(0));
		System.out.println("");
		// datos empleado 3
		System.out.println("Bienvenido introduzca los datos del empleado 3: ");
		System.out.println("Nombre: ");
		Empleado e3 = new Empleado();
		e3.setNombre(leer.readLine());
		System.out.println("Horas de trabajo: ");
		e3.setNhoras(t.tryMinDouble(0));
		System.out.println("Pago por hora: ");
		e3.setTarifa(t.tryMinDouble(0));
		System.out.println("");
		System.out.println("Los datos de los empleados son: ");
		System.out.println(e1.getNombre() + " trabajó " + e1.getNhoras() + ", cobra " + e1.getTarifa()
				+ " euros la hora por lo que le corresponde un sueldo de " + e1.sueldoBruto());
		System.out.println(e2.getNombre() + " trabajó " + e2.getNhoras() + ", cobra " + e2.getTarifa()
				+ " euros la hora por lo que le corresponde un sueldo de " + e2.sueldoBruto());
		System.out.println(e3.getNombre() + " trabajó " + e3.getNhoras() + ", cobra " + e3.getTarifa()
				+ " euros la hora por lo que le corresponde un sueldo de " + e3.sueldoBruto());

	}

}
