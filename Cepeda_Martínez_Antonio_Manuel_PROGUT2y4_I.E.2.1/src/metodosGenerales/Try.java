package metodosGenerales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try {

	public BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	public int tryInt() throws IOException { // método try catch para enteros
		boolean error;
		int comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
		} while (!error);
		return comprobar;
	}

	public float tryFloat() throws IOException { // método try catch para float
		boolean error;
		float comprobar = 0;
		do { // evita introducir no float o carácteres
			try {
				error = true;
				comprobar = Float.parseFloat(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
		} while (!error);
		return comprobar;
	}

	public long tryLong() throws IOException { // método try catch para long
		boolean error;
		long comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Long.parseLong(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número tipo long");
			}
		} while (!error);
		return comprobar;
	}

	public double tryDouble() throws IOException { // método try catch para double
		boolean error;
		double comprobar = 0;
		do { // evita introducir no double o carácteres
			try {
				error = true;
				comprobar = Double.parseDouble(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
		} while (!error);
		return comprobar;
	}
	
	//métodos trymax que añaden límites aparte de controlar las excepciones
	
	public int tryMaxInt(int min,int max) throws IOException { // método try catch para enteros con mínimo y máximo
		boolean error;
		int comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número entero");
			}
			if(comprobar<min || comprobar>max){ //evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error=false;
			}
		} while (!error);
		return comprobar;
	}
	
	public float tryMaxFloat(int min,int max) throws IOException { // método try catch para float con mínimo y máximo
		boolean error;
		float comprobar = 0;
		do { // evita introducir no float o carácteres
			try {
				error = true;
				comprobar = Float.parseFloat(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
			if(comprobar<min || comprobar>max){  //evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error=false;
			}
		} while (!error);
		return comprobar;
	}
	
	public long tryMaxLong(int min,int max) throws IOException { // método try catch para long con mínimo y máximo
		boolean error;
		long comprobar = 0;
		do { // evita introducir no entero o carácteres
			try {
				error = true;
				comprobar = Long.parseLong(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número tipo long");
			}
			if(comprobar<min || comprobar>max){  //evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error=false;
			}
		} while (!error);
		return comprobar;
	}
	
	public double tryMaxDouble(int min, int max) throws IOException { // método try catch para double con mínimo y máximo
		boolean error;
		double comprobar = 0;
		do { // evita introducir no double o carácteres
			try {
				error = true;
				comprobar = Double.parseDouble(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un número");
			}
			if(comprobar<min || comprobar>max){  //evita meter un nº fuera del rango deseado
				System.out.println("Introduzca un número dentro de los parámetros establecidos");
				error=false;
			}
		} while (!error);
		return comprobar;
	}

}
