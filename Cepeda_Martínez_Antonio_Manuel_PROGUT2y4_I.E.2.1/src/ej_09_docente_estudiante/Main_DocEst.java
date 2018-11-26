package ej_09_docente_estudiante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class Main_DocEst {

	public static void main(String[] args) throws IOException {

		Try t = new Try();
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"Bienvenido, a continuación introduzca los datos del docente que le sean requeridos, por favor: ");
		Docente doc = new Docente();
		System.out.println("Nombre: ");
		doc.setNombre(leer.readLine());
		System.out.println("Apellidos: ");
		doc.setApellidos(leer.readLine());
		System.out.println("Sexo: ");
		doc.setSexo(leer.readLine());
		System.out.println("DNI: ");
		doc.setDNI(leer.readLine());
		System.out.println("Código: ");
		doc.setCodigo(t.tryInt());
		System.out.println("Categoría: ");
		doc.setCategoria(leer.readLine());
		System.out.println("Estudios de Postgrado: ");
		doc.setEstudios_post(leer.readLine());
		System.out.println("Horas de clase: ");
		doc.setHoras_clase(t.tryInt());
		System.out.println("Pago por hora: ");
		doc.setPago_hora(t.tryDouble());
		System.out.println("");
		System.out
				.println("A continuación introduzca los datos de el/la estudiante que le sean requeridos, por favor: ");
		Estudiante est = new Estudiante();
		System.out.println("Nombre: ");
		est.setNombre(leer.readLine());
		System.out.println("Apellidos: ");
		est.setApellidos(leer.readLine());
		System.out.println("Sexo: ");
		est.setSexo(leer.readLine());
		System.out.println("DNI: ");
		est.setDNI(leer.readLine());
		System.out.println("Código: ");
		est.setCodigo(t.tryInt());
		System.out.println("Categoría: ");
		est.setCategoria(leer.readLine());
		System.out.println("Pago de pensiones (€)");
		est.setPago_pensiones(t.tryDouble());
		System.out.println("Introduzca el promedio ponderado");
		est.getDescuento(t.tryDouble());
		System.out.println("Colegio de procedencia: ");
		est.setColegio_procedencia(leer.readLine());
		System.out.println("");
		System.out.println("A continuación se mostrará la información de ambas personas: ");
		System.out.println("");
		System.out.println("Información personal del docente: ");
		System.out.println(doc.getInfo());
		System.out.println(doc.getInfoDoc());
		System.out.println("");
		System.out.println("Información del estudiante");
		System.out.println(est.getInfo());
		System.out.println(est.getInfoEst());

	}

}
