package ej_13_Alimentos;

public class Alimento {
	
	private String nombre;
	private double lipidos;
	private double hidratos;
	private double proteinas;
	private boolean origen_animal;
	private char vitaminas; //A alto, M medio, B bajo
	private char minerales; //A alto, M medio, B bajo
	
	public Alimento(String nombre) {
		this.nombre = nombre;
	}

	public Alimento(String nombre, double lipidos, double hidratos, double proteinas, boolean origen_animal,
			char vitaminas, char minerales) {
		this.nombre = nombre;
		this.lipidos = lipidos;
		this.hidratos = hidratos;
		this.proteinas = proteinas;
		this.origen_animal = origen_animal;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLipidos() {
		return lipidos;
	}

	public void setLipidos(double lipidos) {
		this.lipidos = lipidos;
	}

	public double getHidratos() {
		return hidratos;
	}

	public void setHidratos(double hidratos) {
		this.hidratos = hidratos;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isOrigen_animal() {
		return origen_animal;
	}

	public void setOrigen_animal(boolean origen_animal) {
		this.origen_animal = origen_animal;
	}

	public char getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(char vitaminas) {
		this.vitaminas = vitaminas;
	}

	public char getMinerales() {
		return minerales;
	}

	public void setMinerales(char minerales) {
		this.minerales = minerales;
	}
	
	public boolean esDietetico() {
		return (lipidos<20 && vitaminas!='b');
	}
	
	public String muestraAlimento() {
		return"El alimento "+nombre+" contiene: "+
	"\nLípidos: "+lipidos+"%"+"\nHidratos de Carbono: "+hidratos+"% \nProteínas: "+proteinas+"% \nOrigen animal: "+((origen_animal)? "si":"no")+
	"\nContenido en Vitaminas: "+vitaminas+"\nContenido en Minerales: "+minerales+"\nDietético: "+((esDietetico() ? "si":"no"));
	}

}
