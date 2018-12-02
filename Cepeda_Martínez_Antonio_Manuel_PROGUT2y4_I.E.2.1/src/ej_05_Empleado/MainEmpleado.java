package ej_05_Empleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

/**
 * @author Antonio M Cepeda
 */
public class MainEmpleado {

	public static void main(String[] args) throws IOException {

		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Bienvenido, ingrese el dni del empleado: ");
		Empleado e1 = new Empleado();
		e1.setNif(leer.readLine());
		System.out.println("");
		System.out.println("Inserte el sueldo base: ");
		Try m1 = new Try(); //instancia la clase TryCatch
		e1.setSueldoBase(m1.tryMinInt(0));
		System.out.println("");
		System.out.println("Inserte las horas extras realizadas este mes: ");
		e1.sethExtra(m1.tryMinInt(0));
		System.out.println("");
		System.out.println("Inserte el pago por hora extra: ");
		e1.setPagohExtra(m1.tryMinInt(0));
		System.out.println("");
		System.out.println("Inserte el tipo de IRPF (%): ");
		e1.setIrpf(m1.tryMinMaxDouble(0,100));
		System.out.println("¿Está el empleado casado? (si/no)");
		e1.setCasado((leer.readLine().equalsIgnoreCase("si") ? true : false));
		System.out.println("");
		System.out.println("Inserte el nº de hijos: ");
		e1.setNhijos(m1.tryMinInt(0));
		System.out.println("");
		e1.printAll();
	}

}
