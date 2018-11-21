package ej_1_peliculas;

public class DVDCine {

	private String titulo;
	private String director;
	private String actores;
	private String categoria;
	private int duracion;
	private String resumen;

	DVDCine(String titulo, String director, String actores, String categoria, int duracion, String resumen) {
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.categoria = categoria;
		this.duracion = duracion;
		this.resumen = resumen;
	}

	public String getTitulo() { // muestra el título
		return titulo;
	}

	public void setTitulo(String titulo) { // selecciona el título
		this.titulo = titulo;
	}

	public String getDirector() { // muestra el director
		return director;
	}

	public void setDirector(String director) { // selecciona el director
		this.director = director;
	}

	public String getActores() { // muestra los actores
		return actores;
	}

	public void setActores(String actores) { // selecciona los actores
		this.actores = actores;
	}

	public String getCategoria() { // mestra la categoría
		return categoria;
	}

	public void setCategoria(String categoria) { // selecciona la categoría
		this.categoria = categoria;
	}

	public String muestraDuracion() { // muestra la duración
		return duracion+"min";
	}

	public void setDuracion(int duracion) { // selecciona la duración
		this.duracion = duracion;
	}

	public String getResumen() { // muestra el resumen
		return resumen;
	}

	public void setResumen(String resumen) { // selecciona el resumen
		this.resumen = resumen;
	}

	public String muestraDVDCine() {
		return titulo + " De: " + director + "\nCon: " + actores + "\n" + categoria + "-" + duracion + " min"
				+"\nResumen: " + ((resumen!=null) ? resumen:"No tiene resumen");
	}

	public boolean esThriller() {
		if (categoria.equalsIgnoreCase("thriller")) {
			return true;
		} else {
			return false;
		}
		
	}
		
		public boolean tieneResumen() {
			if (resumen!=null) {
				return true;
			} else {
				return false;
			}
	}
}