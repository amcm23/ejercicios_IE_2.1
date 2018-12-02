package ej_06_Persona_Empleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class Persona {

	Try m1 = new Try(); // Instanciación de clase TryCatch
	public BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Atributo nombre de la persona
	 */
	protected String nombre;
	/**
	 * Atributo edad de la persona
	 */
	protected int edad;

	/**
	 * Método que retorna el nombre de la persona
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para insertar el nombre por parámetro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que retorna la edad
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método para insertar la edad por parámetro
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Método para insertar el nombre y la edad por teclado
	 * 
	 * @throws IOException
	 */
	public void setDatos() throws IOException {
		System.out.println("Introduzca el nombre: ");
		setNombre(leer.readLine());
		System.out.println("Introduzca la edad: ");
		setEdad(m1.tryMinInt(0));
	}

	/**
	 * Método que retorna los datos de la persona
	 * 
	 * @return
	 */
	public String getDatos() {
		return "Nombre: " + getNombre() + "\nEdad: " + getEdad();
	}

}
