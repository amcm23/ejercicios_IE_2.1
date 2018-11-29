package ej_16_Personajes;

public class Mago extends Personajes {
	
	private String poder;
	
	Mago(String nombre,String poder){
		super(nombre,100);
		this.poder=poder;
	}
	
	public String encantar() {
		if(2-energia<0) {
			return("Insuficiente poder para realizar el hechizo.");
		} else {
			energia-=2;
			return("El poderoso mago "+nombre+" alza su báculo invocando su imponente poder "+poder+" gastando 2 de energía.\nEnergía restante: "+energia);
		}
		
	}
	
}
