package ej_7_Asignatura;

public class Asignatura {

	String nombre;
	Double nota;
	
	public Asignatura(String nombre, Double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getAproSusp() {
		return (getNota()<5) ? "Suspenso":"Aprobado";
	}
	
	
	
}
