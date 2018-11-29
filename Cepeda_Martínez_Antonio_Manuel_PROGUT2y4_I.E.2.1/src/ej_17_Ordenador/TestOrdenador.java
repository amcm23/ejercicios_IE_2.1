package ej_17_Ordenador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import metodosGenerales.Try;

public class TestOrdenador {
	
	public static float controlMonitor(float tama�o) throws IOException {
		Try t=new Try();
		while(tama�o<14) {
			System.out.println("Introduzca un monitor de al menos 14 puladas: ");
			tama�o=t.tryFloat();
		}
		return tama�o;
	}
	
	public static float controlPrecio(float precio) throws IOException {
		Try t=new Try();
		while(precio<=0) {
			System.out.println("Introduzca un precio mayor que 0: ");
			t.tryFloat();
		}
		return precio;
	}
	
	public static String listaMod_procesador() throws IOException {
		Try t=new Try();
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
		
		Try t=new Try();
		BufferedReader leer=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Servidor 1: Introduzca la ram, la capacidad del disco duro, el modelo del procesador, el precio,el tama�o del monitor, el modelo del teclado y el modelo del raton (en ese orden)");
		Servidor s1=new Servidor(t.tryMinInt(0),t.tryMinInt(0),listaMod_procesador(),controlPrecio(t.tryFloat()),controlMonitor(t.tryFloat()), leer.readLine(), leer.readLine());
		System.out.println("Servidor 2: Introduzca la ram, la capacidad del disco duro, el modelo del procesador, el precio,el tama�o del monitor, el modelo del teclado y el modelo del raton (en ese orden)");
		Servidor s2=new Servidor(t.tryMinInt(0),t.tryMinInt(0),listaMod_procesador(),controlPrecio(t.tryFloat()),controlMonitor(t.tryFloat()), leer.readLine(), leer.readLine());
		System.out.println("Portatil 1: Introduzca la ram, la capacidad del disco duro, el modelo del procesador, el precio, la marca, el tama�o de la pantalla y el peso(en ese orden)");
		Portatil p1=new Portatil(t.tryMinInt(0),t.tryMinInt(0),listaMod_procesador(),controlPrecio(t.tryFloat()),leer.readLine(), t.tryMinDouble(1), t.tryMinDouble(1));
		System.out.println("Portatil 2: Introduzca la ram, la capacidad del disco duro, el modelo del procesador, el precio, la marca, el tama�o de la pantalla y el peso (en ese orden)");
		Portatil p2=new Portatil(t.tryMinInt(0),t.tryMinInt(0),listaMod_procesador(),controlPrecio(t.tryFloat()),leer.readLine(), t.tryMinDouble(1), t.tryMinDouble(1));
		Servidor s3=new Servidor();
		System.out.println("Servidor 3: ");
		System.out.println("Introduzca la ram");
		s3.setRam(t.tryMinInt(1));
		System.out.println("Introduzca la capacidad del disco duro: ");
		s3.setDisco_duro(t.tryMinInt(0));
		System.out.println("Introduzca el modelo del procesador");
		s3.setMod_procesador(listaMod_procesador());
		System.out.println("Introduzca el precio: ");
		s3.setPrecio(controlPrecio(t.tryFloat()));
		System.out.println("Introduzca el tama�o del monitor: ");
		s3.setTama�o_monitor(controlMonitor(t.tryFloat()));
		System.out.println("Introduzca el modelo del teclado: ");
		s3.setModelo_teclado(leer.readLine());
		System.out.println("Introduzca el modelo del raton: ");
		s3.setModelo_raton(leer.readLine());
		Portatil p3=new Portatil();
		System.out.println("Portatil 3: ");
		System.out.println("Introduzca la ram");
		p3.setRam(t.tryMinInt(1));
		System.out.println("Introduzca la capacidad del disco duro: ");
		p3.setDisco_duro(t.tryMinInt(0));
		System.out.println("Introduzca el modelo del procesador");
		p3.setMod_procesador(listaMod_procesador());
		System.out.println("Introduzca el precio: ");
		p3.setPrecio(controlPrecio(t.tryFloat()));
		System.out.println("Introduzca la marca: ");
		p3.setMarca(leer.readLine());
		System.out.println("Introduzca el tama�o de la pantalla: ");
		p3.setTama�o_pantalla(t.tryMinDouble(0));
		System.out.println("Introduzca el peso: ");
		p3.setPeso(t.tryMinDouble(0));
		System.out.println("");
		System.out.println("Servidor 1: ");
		System.out.println(s1.mostrarServidor());
		System.out.println("Servidor 2: ");
		System.out.println(s2.mostrarServidor());
		System.out.println("Servidor 3: ");
		System.out.println(s3.mostrarServidor());
		System.out.println("");
		System.out.println("Port�til 1: ");
		System.out.println(p1.mostrarPortatil());
		System.out.println("Port�til 2: ");
		System.out.println(p2.mostrarPortatil());
		System.out.println("Port�til 3: ");
		System.out.println(p3.mostrarPortatil());
		
		
	}

}
