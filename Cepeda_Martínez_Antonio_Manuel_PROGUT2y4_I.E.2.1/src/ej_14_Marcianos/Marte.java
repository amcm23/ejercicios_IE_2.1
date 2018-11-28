package ej_14_Marcianos;

public class Marte {

	public static void main(String[] args) {

		Marciano et1 = new Marciano("Anselmo");
		System.out.println("Hay " + et1.cuentaMarcianos() + " marcianos vivos.");
		Marciano et2 = new Marciano("Benancio");
		System.out.println("Hay " + et2.cuentaMarcianos() + " marcianos vivos.");
		Marciano et3 = new Marciano("Godofredo");
		System.out.println("Hay " + et3.cuentaMarcianos() + " marcianos vivos.");
		et2.muere();
		Marciano et4 = new Marciano("Desiderio");
		et2.muere();
		System.out.println("Hay " + et4.cuentaMarcianos() + " marcianos vivos");
		System.out.println("El marciano " + et1.getNombre() + ((et1.estaVivo()) ? " está vivo." : " está muerto."));
		System.out.println("El marciano " + et2.getNombre() + ((et2.estaVivo()) ? " está vivo." : " está muerto."));
		System.out.println("El marciano " + et3.getNombre() + ((et3.estaVivo()) ? " está vivo." : " está muerto."));
		System.out.println("El marciano " + et4.getNombre() + ((et4.estaVivo()) ? " está vivo." : " está muerto. "));

	}

}
