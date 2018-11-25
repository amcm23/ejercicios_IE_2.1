package ej_9_docente_estudiante;

public class Estudiante extends Persona {

	private int codigo;
	private String categoria;
	private double pago_pensiones;
	private String colegio_procedencia;

	public Estudiante() {
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setPago_pensiones(double pago_pensiones) {
		this.pago_pensiones = pago_pensiones;
	}

	public void setColegio_procedencia(String colegio_procedencia) {
		this.colegio_procedencia = colegio_procedencia;
	}

	public void getDescuento(double promedio) {
		if (promedio < 13) {
			pago_pensiones -= (pago_pensiones * 0);
		} else {
			if (promedio >= 13 && promedio <= 16) {
				pago_pensiones -= (pago_pensiones * 0.08);
			} else {
				pago_pensiones -= (pago_pensiones * 0.15);
			}
		}
	}

	public double getPago_pensiones() {
		return pago_pensiones;
	}

	public String getInfoEst() {
		return "Información del Estudiante: "+"\nCódigo: " + codigo + " Categoría: " + categoria + "\nColegio de Procedencia: "+colegio_procedencia+
				"\nPago pensiones: "+getPago_pensiones()+"€."; 
	}

}
