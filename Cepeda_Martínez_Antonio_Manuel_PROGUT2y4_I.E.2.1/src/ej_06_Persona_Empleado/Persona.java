package ej_06_Persona_Empleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class Persona {

	Try m1 = new Try(); // Instanciaci�n de clase TryCatch
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
	 * M�todo que retorna el nombre de la persona
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo para insertar el nombre por par�metro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo que retorna la edad
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * M�todo para insertar la edad por par�metro
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * M�todo para insertar el nombre y la edad por teclado
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
	 * M�todo que retorna los datos de la persona
	 * 
	 * @return
	 */
	public String getDatos() {
		return "Nombre: " + getNombre() + "\nEdad: " + getEdad();
	}

}
