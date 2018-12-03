package metodosGenerales;

/**
 * @author Antonio M Cepeda
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try {

	public BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * M�todo que controla las excepciones para los enteros
	 * 
	 * @return
	 * @throws IOException
	 */
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

	/**
	 * M�todo que controla las excepciones para los float
	 * 
	 * @return
	 * @throws IOException
	 */
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

	/**
	 * M�todo que controla las excepciones para los long
	 * 
	 * @return
	 * @throws IOException
	 */
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

	/**
	 * M�todo que controla las excepciones para los double
	 * 
	 * @return
	 * @throws IOException
	 */
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

	// m�todos trymax, trymin, tryminmax que a�aden l�mites aparte de controlar las
	// excepciones

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�nimo y un m�ximo
	 * para los enteros
	 * 
	 * @param min
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public int tryMinMaxInt(int min, int max) throws IOException { // m�todo try catch para enteros con m�nimo y m�ximo
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
			if (comprobar < min || comprobar > max) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�nimo para los
	 * enteros
	 * 
	 * @param min
	 * @return
	 * @throws IOException
	 */
	public int tryMinInt(int min) throws IOException { // m�todo try catch para enteros con m�nimo
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
			if (comprobar < min) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�ximo para los
	 * enteros
	 * 
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public int tryMaxInt(int max) throws IOException { // m�todo try catch para enteros con m�ximo
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
			if (comprobar > max) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�nimo y un m�ximo
	 * para los float
	 * 
	 * @param min
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public float tryMinMaxFloat(int min, int max) throws IOException { // m�todo try catch para float con m�nimo y
																		// m�ximo
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
			if (comprobar < min || comprobar > max) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�nimo para los
	 * float
	 * 
	 * @param min
	 * @return
	 * @throws IOException
	 */
	public float tryMinFloat(int min) throws IOException { // m�todo try catch para float con m�nimo
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
			if (comprobar < min) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�ximo para los
	 * float
	 * 
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public float tryMaxFloat(int max) throws IOException { // m�todo try catch para float con m�ximo
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
			if (comprobar > max) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�nimo y un m�ximo
	 * para los long
	 * 
	 * @param min
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public long tryMinMaxLong(int min, int max) throws IOException { // m�todo try catch para long con m�nimo y m�ximo
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
			if (comprobar < min || comprobar > max) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�nimo para los
	 * long
	 * 
	 * @param min
	 * @return
	 * @throws IOException
	 */
	public long tryMinLong(int min) throws IOException { // m�todo try catch para long con m�nimo
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
			if (comprobar < min) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�ximo para los
	 * long
	 * 
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public long tryMaxLong(int max) throws IOException { // m�todo try catch para long con m�ximo
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
			if (comprobar > max) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�nimo y un m�ximo
	 * para los double
	 * 
	 * @param min
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public double tryMinMaxDouble(int min, int max) throws IOException { // m�todo try catch para double con m�nimo y
																			// m�ximo
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
			if (comprobar < min || comprobar > max) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�nimo para los
	 * double
	 * 
	 * @param min
	 * @return
	 * @throws IOException
	 */
	public double tryMinDouble(int min) throws IOException { // m�todo try catch para double con m�nimo
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
			if (comprobar < min) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que aparte de controlar las excepciones controla un m�ximo para los
	 * double
	 * 
	 * @param max
	 * @return
	 * @throws IOException
	 */
	public double tryMaxDouble(int max) throws IOException { // m�todo try catch para double con m�ximo
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
			if (comprobar > max) { // evita meter un n� fuera del rango deseado
				System.out.println("Introduzca un n�mero dentro de los par�metros establecidos");
				error = false;
			}
		} while (!error);
		return comprobar;
	}

	/**
	 * M�todo que evita introducir un dni que no sea de 8 d�gitos y 1 car�cter
	 * 
	 * @param s
	 * @return
	 * @throws IOException
	 */
	public String TryDNI(String dni) throws IOException {
		String DNI = dni;
		boolean error = false;
		char c;
		do {
			error = false;
			while (DNI.length() != 9) { // comprueba que la longitud del string sea de 9
				System.out.println("Longitud del DNI incorrecta, vuelva a introducirlo");
				DNI = leer.readLine();
			}
			for (int i = 0; i < 8; i++) { // comprueba que los 8 primeros car�cteres sean d�gitos
				c = DNI.charAt(i);
				if (!Character.isDigit(c)) {
					error = true;
					break;
				}
			}
			if (!Character.isAlphabetic(DNI.charAt(8))) // si el car�cter 9 no es letra salta error
				error = true;
			if (error) {
				System.out.println("DNI no v�lido, introduzcalo de nuevo");
				DNI = leer.readLine();
			}
		} while (error);
		return DNI;
	}

}
