package ej_9_docente_estudiante;

public class Docente extends Persona {

	int codigo;
	String categoria;
	String estudios_post; // estudios de postgrado
	int horas_clase;
	double pago_hora;

	public Docente() {
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setEstudios_post(String estudios_post) {
		this.estudios_post = estudios_post;
	}

	public void setHoras_clase(int horas_clase) {
		this.horas_clase = horas_clase;
	}

	public void setPago_hora(double pago_hora) {
		this.pago_hora = pago_hora;
	}

	public double pagoParcial() {
		return (horas_clase * pago_hora);
	}

	public String getInfoDoc() {
		return "Información del docente: "+"\nCódigo: "+codigo+". Categoría: "+categoria+".\nEstudios de Postgrado: "+estudios_post+
				".\nHoras de clase: " + horas_clase + "h. Pago por hora: " + pago_hora + "€. Con pago parcial de: "
				+ pagoParcial()+"€.";

	}

}
