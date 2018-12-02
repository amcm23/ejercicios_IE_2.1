package ej_08_Alumno;

import ej_07_Asignatura.Asignatura;

public class Test {

	public static void main(String[] args) {

		Alumno al1 = new Alumno("Antonio", 21);
		Alumno al2 = new Alumno("Alejandro", 25);
		Alumno al3 = new Alumno("Federico", 18);

		// asig. alumno 1:
		Asignatura a1 = new Asignatura("Programación", 8.0);
		Asignatura a2 = new Asignatura("Lenguaje de Marcas", 10.0);

		// asig alumno 2:
		Asignatura a3 = new Asignatura("Programación", 5.0);
		Asignatura a4 = new Asignatura("Lenguaje de Marcas", 3.0);

		// asig alumno 3:
		Asignatura a5 = new Asignatura("Programación", 0.5);
		Asignatura a6 = new Asignatura("Lenguaje de Marcas", 3.6);

		// Datos alumno 1:
		System.out.println(al1.getNombre());
		System.out.println("Edad: " + al1.getEdad());
		System.out.println(a1.getNombre());
		System.out.println(a1.getNota());
		System.out.println(a1.getAproSusp());
		System.out.println(a2.getNombre());
		System.out.println(a2.getNota());
		System.out.println(a2.getAproSusp());
		System.out.println("");
		// Datos alumno 2:
		System.out.println(al2.getNombre());
		System.out.println("Edad: " + al2.getEdad());
		System.out.println(a3.getNombre());
		System.out.println(a3.getNota());
		System.out.println(a3.getAproSusp());
		System.out.println(a4.getNombre());
		System.out.println(a4.getNota());
		System.out.println(a4.getAproSusp());
		System.out.println("");
		// Datos alumno 3:
		System.out.println(al3.getNombre());
		System.out.println("Edad: " + al3.getEdad());
		System.out.println(a5.getNombre());
		System.out.println(a5.getNota());
		System.out.println(a5.getAproSusp());
		System.out.println(a6.getNombre());
		System.out.println(a6.getNota());
		System.out.println(a6.getAproSusp());
	}

}
