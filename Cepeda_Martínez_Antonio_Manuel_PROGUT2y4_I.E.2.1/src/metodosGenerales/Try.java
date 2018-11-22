package metodosGenerales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try {

	public BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	public int tryInt() throws IOException { // m�todo try catch para enteros
		boolean error;
		int comprobar = 0;
		do { // evita introducir no entero o car�cteres
			try {
				error = true;
				comprobar = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un n�mero entero");
			}
		} while (!error);
		return comprobar;
	}

	public float tryFloat() throws IOException { // m�todo try catch para float
		boolean error;
		float comprobar = 0;
		do { // evita introducir no float o car�cteres
			try {
				error = true;
				comprobar = Float.parseFloat(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un n�mero");
			}
		} while (!error);
		return comprobar;
	}

	public long tryLong() throws IOException { // m�todo try catch para long
		boolean error;
		long comprobar = 0;
		do { // evita introducir no entero o car�cteres
			try {
				error = true;
				comprobar = Long.parseLong(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un n�mero tipo long");
			}
		} while (!error);
		return comprobar;
	}

	public double tryDouble() throws IOException { // m�todo try catch para double
		boolean error;
		double comprobar = 0;
		do { // evita introducir no double o car�cteres
			try {
				error = true;
				comprobar = Double.parseDouble(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un n�mero");
			}
		} while (!error);
		return comprobar;
	}

}
