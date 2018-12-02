package ej_11_Triangulo;

/**
 * @author Antonio M Cepeda
 */
public class MainTriangulo {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo(4, 4, 4);
		Triangulo t2 = new Triangulo(4, 4, 4);
		Triangulo t3 = new Triangulo(6, 9, 6);
		Triangulo t4 = new Triangulo(1, 2, 3);
		Triangulo t5 = new Triangulo(3, 2, 1);
		Triangulo t6 = new Triangulo(2, 3, 1);
		Triangulo t7 = new Triangulo(4, 4, 4);
		System.out.println("Los triángulos t1 y t2:");
		System.out.println((t1.compareTo_Triangulos(t1, t2) ? "Son iguales" : "No son iguales"));
		System.out.println("Los triángulos t3 y t5:");
		System.out.println((t1.compareTo_Triangulos(t3, t5) ? "Son iguales" : "No son iguales"));
		Triangulo[] triangulos = { t4, t5, t6 };
		System.out.println("Los triángulos t4, t5 y t6: ");
		System.out.println((t1.compareTo_VTriangulos(triangulos) ? "Son iguales" : "No son iguales"));
		System.out.println("El triángulo t7 es: ");
		switch (t7.tipo_triangulo(t7)) {
		case 1:
			System.out.println("Equilátero.");
			break;
		case 2:
			System.out.println("Isósceles.");
			break;
		case 3:
			System.out.println("Escaleno.");
			break;
		}

		System.out.println("El triángulo t6 es: ");
		switch (t7.tipo_triangulo(t6)) {
		case 1:
			System.out.println("Equilátero.");
			break;
		case 2:
			System.out.println("Isósceles.");
			break;
		case 3:
			System.out.println("Escaleno.");
			break;
		}

		System.out.println("El triángulo t3 es: ");
		switch (t7.tipo_triangulo(t3)) {
		case 1:
			System.out.println("Equilátero.");
			break;
		case 2:
			System.out.println("Isósceles.");
			break;
		case 3:
			System.out.println("Escaleno.");
			break;
		}
	}

}
