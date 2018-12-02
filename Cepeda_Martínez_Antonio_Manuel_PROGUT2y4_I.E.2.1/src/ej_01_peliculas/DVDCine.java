package ej_01_peliculas;

/**
 * @author Antonio M Cepeda
 */
public class DVDCine {

	/**
	 * Atributo título de la pelicula
	 */
	private String titulo;
	/**
	 * atributo nombre del director de la película
	 */
	private String director;
	/**
	 * Atributo actores que aparecen en la película
	 */
	private String actores;
	/**
	 * Atributo categoría de la película
	 */
	private String categoria;
	/**
	 * atributo duración de la película
	 */
	private int duracion;
	/**
	 * Atributo resumen de la película
	 */
	private String resumen;

	/**
	 * Constructor con 6 parámetros
	 * @param titulo Título de la película
	 * @param director Director de la película
	 * @param actores Actores de la película
	 * @param categoria Categoría de la pelicula
	 * @param duracion Duración de la película
	 * @param resumen Resumen de la película
	 */
	DVDCine(String titulo, String director, String actores, String categoria, int duracion, String resumen) {
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.categoria = categoria;
		this.duracion = duracion;
		this.resumen = resumen;
	}

	//métodos públicos
	/**
	 * Retorna el título de la película
	 * @return título
	 */
	public String getTitulo() { // muestra el título
		return titulo;
	}

	/**
	 * Inserta el parámetro en el título
	 * @param titulo Título de la película
	 */
	public void setTitulo(String titulo) { // selecciona el título
		this.titulo = titulo;
	}

	/**
	 * Retorna el nombre del director de la película
	 * @return director
	 */
	public String getDirector() { // muestra el director
		return director;
	}

	/**
	 * Inserta el parámetro en el director
	 * @param director Nombre del director de la película
	 */
	public void setDirector(String director) { // selecciona el director
		this.director = director;
	}

	/**
	 * Retorna el nombre de los actores de la película
	 * @return actores
	 */
	public String getActores() { // muestra los actores
		return actores;
	}

	/**
	 * Inserta el parámetro en los actores
	 * @param actores Nombre de los actores de la película
	 */
	public void setActores(String actores) { // selecciona los actores
		this.actores = actores;
	}

	/**
	 * Retorna el nombre de la categoría
	 * @return categoria
	 */
	public String getCategoria() { // mestra la categoría
		return categoria;
	}

	/**
	 * Inserta el parámetro en la categoría
	 * @param categoria
	 */
	public void setCategoria(String categoria) { // selecciona la categoría
		this.categoria = categoria;
	}

	/**
	 * Retorna la duración de la película
	 * @return duracion
	 */
	public String muestraDuracion() { // muestra la duración
		return duracion + "min";
	}

	/**
	 * Inserta el parámetro en la duración
	 * @param duracion
	 */
	public void setDuracion(int duracion) { // selecciona la duración
		this.duracion = duracion;
	}

	/**
	 * Retorna el resumen
	 * @return resumen
	 */
	public String getResumen() { // muestra el resumen
		return resumen;
	}

	/**
	 * Inserta el parámetro en el resumen de la película
	 * @param resumen
	 */
	public void setResumen(String resumen) { // selecciona el resumen
		this.resumen = resumen;
	}

	/**
	 * Muestra todos los datos de la película en una String
	 * @return 
	 */
	public String muestraDVDCine() {
		return titulo + " De: " + director + "\nCon: " + actores + "\n" + categoria + "-" + duracion + " min"
				+ "\nResumen: " + ((resumen != null) ? resumen : "No tiene resumen");
	}

	/**
	 * Método boolean que retorna true si la categoría es thriller y false si no
	 * @return 
	 */
	public boolean esThriller() {
		if (categoria.equalsIgnoreCase("thriller")) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Método boolean que retorna true si la película tiene resumen o false si no
	 * @return
	 */
	public boolean tieneResumen() {
		if (resumen != null) {
			return true;
		} else {
			return false;
		}
	}
}