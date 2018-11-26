package ej_10_PapasChocos;

public class PapasChocos {
	
	//cada 3 personas= 1kg papas, 0.5kg de chocos
	private int chocos;
	private int papas;
	
	public PapasChocos() {
		chocos=0;
		papas=0;
	}
	
	public int showChocos() {
		return chocos;
	}
	public void addChocos(int chocos) {
		this.chocos += chocos;
	}
	public int showPapas() {
		return papas;
	}
	public void addPapas(int papas) {
		this.papas += papas;
	}
	
	public int getComensales() {
		int cPapas=0; //comensales para x papas
		int cChocos=0; //comensales para x chocos
		if (chocos>=0.5 && papas>=1) {
			cPapas=papas*3;
			cChocos=chocos*6;
		}
		if (cPapas>cChocos) {
			cPapas=cChocos;
		} else {
			if (cChocos>cPapas) {
				cChocos=cPapas;
			}
		}
		return cPapas; //me retorna uno de los dos ya que ambos al final deben tener el mismo número de comensales servidos
	}

}
