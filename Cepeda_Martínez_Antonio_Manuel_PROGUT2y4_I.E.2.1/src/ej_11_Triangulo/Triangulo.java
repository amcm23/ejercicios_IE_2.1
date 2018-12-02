package ej_11_Triangulo;

import java.util.Arrays;

public class Triangulo {

	/**
	 * Atributo longitud del lado 1 del triángulo
	 */
	private double long_lado1;
	/**
	 * Atributo longitud del lado 2 del triángulo
	 */
	private double long_lado2;
	/**
	 * Atributo longitud del lado 3 del triángulo
	 */
	private double long_lado3;

	/**
	 * Constructor con 3 parámetros
	 * 
	 * @param l1 Lado 1 del triángulo
	 * @param l2 Lado 2 del triángulo
	 * @param l3 Lado 3 del triángulo
	 */
	public Triangulo(double l1, double l2, double l3) {
		long_lado1 = l1;
		long_lado2 = l2;
		long_lado3 = l3;
	}

	/**
	 * Método que compara los lados de 2 triángulos para saber si son iguales
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		double[] ta = { a.long_lado1, a.long_lado2, a.long_lado3 };
		double[] tb = { b.long_lado1, b.long_lado2, b.long_lado3 };

		Arrays.sort(ta); // ordena los lados del triángulo de menor a mayor para que los lados de ambos
							// estén en la misma posición
		Arrays.sort(tb);

		return (ta[0] == tb[0] && ta[1] == tb[1] && ta[2] == tb[2]);
	}

	/**
	 * Método booleano que compara varios triángulos para saber si son iguales a
	 * través de un array de objetos insertado por parámetro y el método
	 * compareTo_Triangulos (true si son iguales, false si no)
	 * 
	 * @param v
	 * @return
	 */
	public boolean compareTo_VTriangulos(Triangulo v[]) {

		boolean igual = true;
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {

				igual = v[i].compareTo_Triangulos(v[i], v[j]);
				if (!igual) {
					break;
				}
			}
		}
		return igual;
	}

	public int tipo_triangulo(Triangulo a) {

		/**
		 * Método que indica si el triángulo es equilátero (1), isósceles (2), escaleno
		 * (3).
		 */
		if (a.long_lado1 == a.long_lado2 && a.long_lado2 == a.long_lado3) {
			return 1;
		} else {
			if (a.long_lado1 == a.long_lado2 || a.long_lado1 == a.long_lado3 || a.long_lado2 == a.long_lado3) {
				return 2;
			} else {
				return 3;
			}
		}
	}

	/**
	 * Método que retorna la longitud del lado 1
	 * 
	 * @return
	 */
	public double getLong_lado1() {
		return long_lado1;
	}

	/**
	 * Método que inserta la longitud del lado 1 a través de un parámetro
	 * 
	 * @param long_lado1
	 */
	public void setLong_lado1(double long_lado1) {
		this.long_lado1 = long_lado1;
	}

	/**
	 * Método que retorna la longitud del lado 2
	 * 
	 * @return
	 */
	public double getLong_lado2() {
		return long_lado2;
	}

	/**
	 * Método que inserta la longitud del lado 2 a través de parámetro
	 * 
	 * @param long_lado2
	 */
	public void setLong_lado2(double long_lado2) {
		this.long_lado2 = long_lado2;
	}

	/**
	 * Método que retorna la longitud del lado 3
	 * 
	 * @return
	 */
	public double getLong_lado3() {
		return long_lado3;
	}

	/**
	 * Método que inserta la longitud del lado 3 por parámetro
	 * 
	 * @param long_lado3
	 */
	public void setLong_lado3(double long_lado3) {
		this.long_lado3 = long_lado3;
	}

}
