package ej_11_Triangulo;

import java.util.Arrays;

public class Triangulo {

	private double long_lado1;
	private double long_lado2;
	private double long_lado3;

	public Triangulo(double l1, double l2, double l3) {
		long_lado1 = l1;
		long_lado2 = l2;
		long_lado3 = l3;
	}

	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		double[] ta = { a.long_lado1, a.long_lado2, a.long_lado3 };
		double[] tb = { b.long_lado1, b.long_lado2, b.long_lado3 };

		Arrays.sort(ta);
		Arrays.sort(tb);

		return (ta[0] == tb[0] && ta[1] == tb[1] && ta[2] == tb[2]);
	}

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
		/*
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

	public double getLong_lado1() {
		return long_lado1;
	}

	public void setLong_lado1(double long_lado1) {
		this.long_lado1 = long_lado1;
	}

	public double getLong_lado2() {
		return long_lado2;
	}

	public void setLong_lado2(double long_lado2) {
		this.long_lado2 = long_lado2;
	}

	public double getLong_lado3() {
		return long_lado3;
	}

	public void setLong_lado3(double long_lado3) {
		this.long_lado3 = long_lado3;
	}

}
