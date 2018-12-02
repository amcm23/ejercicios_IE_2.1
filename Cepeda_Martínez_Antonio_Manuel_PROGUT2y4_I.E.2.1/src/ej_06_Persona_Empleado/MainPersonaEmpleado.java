package ej_06_Persona_Empleado;

import java.io.IOException;

import metodosGenerales.Try;

public class MainPersonaEmpleado {

	public static void main(String[] args) throws IOException {
		
		Try m1=new Try(); // Instancia la clase tryCatch
		Persona p1=new Persona();
		Empleado e1=new Empleado();
		System.out.println("Datos de la persona: ");
		p1.setDatos();
		System.out.println("Datos del empleado: ");
		e1.setDatos();
		System.out.println("Inserte el sueldo del empleado: ");
		e1.setSueldo(m1.tryMinInt(0));
		System.out.println("");
		System.out.println("Los datos de la persona son: ");
		System.out.println(p1.getDatos());
		System.out.println("");
		System.out.println("Los datos del empleado son: ");
		System.out.println(e1.getDatos());
		System.out.print("Sueldo: ");
		System.out.println(e1.getSueldo());

	}

}
