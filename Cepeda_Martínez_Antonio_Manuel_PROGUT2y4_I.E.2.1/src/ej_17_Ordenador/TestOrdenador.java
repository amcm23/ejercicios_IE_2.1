package ej_17_Ordenador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

/**
 * @author Antonio M Cepeda
 */
public class TestOrdenador {

	/**
	 * Método estático que controla que el tamaño del monitor metido por parámetro
	 * sea superior a 14 pulgadas
	 * 
	 * @param tamaño
	 * @return
	 * @throws IOException
	 */
	public static float controlMonitor(float tamaño) throws IOException {
		Try t = new Try(); // instancia la clase trycatch
		while (tamaño < 14) {
			System.out.println("Introduzca un monitor de al menos 14 puladas: ");
			tamaño = t.tryFloat();
		}
		return tamaño;
	}

	/**
	 * Método estático que controla que el precio insertado por parámetro sea
	 * superior a 0
	 * 
	 * @param precio
	 * @return
	 * @throws IOException
	 */
	public static float controlPrecio(float precio) throws IOException {
		Try t = new Try(); // instancia la clase Trycatch
		while (precio <= 0) {
			System.out.println("Introduzca un precio mayor que 0: ");
			t.tryFloat();
		}
		return precio;
	}

	/**
	 * Método que escribe una lista de procesadores e inserta al modelo de
	 * procesador el modelo elegido por el usuario de dicha lista
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String listaMod_procesador() throws IOException {
		Try t = new Try(); // instancia la clase trycatch
		String modelo = null;
		System.out.println("Seleccione el modelo de su procesador: ");
		System.out.println("1.Intel Core i5-8600K\n2.AMD Ryzen 5 2600\n3.AMD Ryzen 7 1700\n4.Intel Core i7.8700K");
		switch (t.tryMinMaxInt(1, 4)) {
		case 1:
			modelo = "Intel Core i5-8600K";
			break;
		case 2:
			modelo = "AMD Ryzen 5 2600";
			break;
		case 3:
			modelo = "AMD Ryzen 7 1700";
			break;
		case 4:
			modelo = "Intel Core i7.8700K";
			break;
		}
		return modelo;
	}

	public static void main(String[] args) throws IOException {

		Try t = new Try(); // instancia la clase trycatch
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		Servidor s1 = new Servidor(2, 500, "AMD ryzen 5 2600", 500, 21, "Logitec", "Logitec");
		Servidor s2 = new Servidor(4, 1040, "Intel Core i7.8700K", 1000, 30, "Razer", "Razer");
		Portatil p1 = new Portatil(8, 800, "Intel Core i5-8600K", 900, "HP", 14, 500);
		Portatil p2 = new Portatil(4, 1040, "Intel Core i7.8700K", 1200, "Acer", 20, 300);
		Servidor s3 = new Servidor();
		System.out.println("Servidor 3: ");
		System.out.println("Introduzca la ram (en gb, mínimo 1)");
		s3.setRam(t.tryMinInt(1));
		System.out.println("Introduzca la capacidad del disco duro (mb, mínimo 1): ");
		s3.setDisco_duro(t.tryMinInt(1));
		System.out.println("Introduzca el modelo del procesador");
		s3.setMod_procesador(listaMod_procesador());
		System.out.println("Introduzca el precio: ");
		s3.setPrecio(controlPrecio(t.tryFloat()));
		System.out.println("Introduzca el tamaño del monitor: ");
		s3.setTamaño_monitor(controlMonitor(t.tryFloat()));
		System.out.println("Introduzca el modelo del teclado: ");
		s3.setModelo_teclado(leer.readLine());
		System.out.println("Introduzca el modelo del raton: ");
		s3.setModelo_raton(leer.readLine());
		Portatil p3 = new Portatil();
		System.out.println("Portatil 3: ");
		System.out.println("Introduzca la ram (en gb, mín. 1)");
		p3.setRam(t.tryMinInt(1));
		System.out.println("Introduzca la capacidad del disco duro (en mb,mínimo 1): ");
		p3.setDisco_duro(t.tryMinInt(1));
		System.out.println("Introduzca el modelo del procesador");
		p3.setMod_procesador(listaMod_procesador());
		System.out.println("Introduzca el precio: ");
		p3.setPrecio(controlPrecio(t.tryFloat()));
		System.out.println("Introduzca la marca: ");
		p3.setMarca(leer.readLine());
		System.out.println("Introduzca el tamaño de la pantalla: ");
		p3.setTamaño_pantalla(t.tryMinDouble(0));
		System.out.println("Introduzca el peso: ");
		p3.setPeso(t.tryMinDouble(0));
		System.out.println("");
		System.out.println("-----Servidor 1-----");
		System.out.println(s1.mostrarServidor());
		System.out.println("");
		System.out.println("-----Servidor 2----- ");
		System.out.println(s2.mostrarServidor());
		System.out.println("");
		System.out.println("-----Servidor 3----- ");
		System.out.println(s3.mostrarServidor());
		System.out.println("");
		System.out.println("");
		System.out.println("-----Portátil 1----- ");
		System.out.println(p1.mostrarPortatil());
		System.out.println("");
		System.out.println("-----Portátil 2----- ");
		System.out.println(p2.mostrarPortatil());
		System.out.println("");
		System.out.println("-----Portátil 3----- ");
		System.out.println(p3.mostrarPortatil());

	}

}
