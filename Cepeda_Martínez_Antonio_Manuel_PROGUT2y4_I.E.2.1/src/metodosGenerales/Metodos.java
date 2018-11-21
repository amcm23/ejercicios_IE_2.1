package metodosGenerales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Metodos {
	static BufferedReader leer=new BufferedReader (new InputStreamReader(System.in));
	private int comprobar;
	
	
	
	public void tryInt (int comprobar) throws IOException {
		boolean error;
		do { // evita introducir no entero o car�cteres
			try {
				error = true;
				this.comprobar=comprobar;
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un n�mero entero");
			}
		} while (!error);
	}
	
	public void tryFloat (float comprobar) throws IOException {
		boolean error;
		do { // evita introducir no float o car�cteres
			try {
				error = true;
				comprobar=comprobar;
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un n�mero");
			}
		} while (!error);
	}
	
	public static void tryLong (long comprobar) throws IOException {
		boolean error;
		do { // evita introducir no long o car�cteres
			try {
				error = true;
				comprobar = Long.parseLong(leer.readLine());
			} catch (NumberFormatException e) {
				error = false;
				System.out.println("Error " + e.getMessage());
				System.out.println("Introduzca un n�mero long");
			}
		} while (!error);
	}
	
	public void tryDouble (double comprobar) throws IOException {
		boolean error;
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
	}
}
