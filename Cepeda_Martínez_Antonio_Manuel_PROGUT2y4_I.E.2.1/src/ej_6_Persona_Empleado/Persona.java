package ej_6_Persona_Empleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class Persona {
	
	Try m1=new Try();
	public BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	protected String nombre;
	protected int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDatos () throws IOException {
		
		System.out.println("Introduzca el nombre: ");
		setNombre(leer.readLine());
		System.out.println("Introduzca la edad: ");
		setEdad(m1.tryInt());
	}
	
	public String getDatos() {
		return "Nombre: "+getNombre()+"\nEdad: "+getEdad();
	}

}
