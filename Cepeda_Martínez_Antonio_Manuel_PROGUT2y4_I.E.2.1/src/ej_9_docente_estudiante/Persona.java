package ej_9_docente_estudiante;

public class Persona {

	private String apellidos;
	private String nombre;
	private String sexo;
	private String dni;

	public Persona(String apellidos, String nombre, String sexo, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sexo = sexo;
		this.dni = dni;
	}

	public Persona() {
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	public String getInfo() {
		return nombre+" "+apellidos+
				"\nSexo: "+sexo+" DNI: "+dni;
	}

}
