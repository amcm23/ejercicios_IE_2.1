package ej_7_Asignatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class MainAsignatura {

	public static void main(String[] args) throws IOException {
		
		BufferedReader leer=new BufferedReader (new InputStreamReader(System.in));
		Try t1=new Try();
		System.out.println("Introduzca el nombre de la asignatura: ");
		Asignatura a1=new Asignatura(leer.readLine(), null);
		do {
		System.out.println("Introduzca la nota (de 0 a 10): ");
		a1.setNota(t1.tryDouble());
		} while (a1.getNota()<0 || a1.getNota()>10);
		System.out.println("");
		System.out.println("La asignatura es: "+a1.getNombre());
		System.out.println("Tiene una nota de: "+a1.getNota());
		System.out.println("Está ud.: "+a1.getAproSusp());

	}

}
