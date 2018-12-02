package ej_01_peliculas;

/**
 * @author Antonio M Cepeda
 */
public class DVDCine {

	/**
	 * Atributo t�tulo de la pelicula
	 */
	private String titulo;
	/**
	 * atributo nombre del director de la pel�cula
	 */
	private String director;
	/**
	 * Atributo actores que aparecen en la pel�cula
	 */
	private String actores;
	/**
	 * Atributo categor�a de la pel�cula
	 */
	private String categoria;
	/**
	 * atributo duraci�n de la pel�cula
	 */
	private int duracion;
	/**
	 * Atributo resumen de la pel�cula
	 */
	private String resumen;

	/**
	 * Constructor con 6 par�metros
	 * @param titulo T�tulo de la pel�cula
	 * @param director Director de la pel�cula
	 * @param actores Actores de la pel�cula
	 * @param categoria Categor�a de la pelicula
	 * @param duracion Duraci�n de la pel�cula
	 * @param resumen Resumen de la pel�cula
	 */
	DVDCine(String titulo, String director, String actores, String categoria, int duracion, String resumen) {
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.categoria = categoria;
		this.duracion = duracion;
		this.resumen = resumen;
	}

	//m�todos p�blicos
	/**
	 * Retorna el t�tulo de la pel�cula
	 * @return t�tulo
	 */
	public String getTitulo() { // muestra el t�tulo
		return titulo;
	}

	/**
	 * Inserta el par�metro en el t�tulo
	 * @param titulo T�tulo de la pel�cula
	 */
	public void setTitulo(String titulo) { // selecciona el t�tulo
		this.titulo = titulo;
	}

	/**
	 * Retorna el nombre del director de la pel�cula
	 * @return director
	 */
	public String getDirector() { // muestra el director
		return director;
	}

	/**
	 * Inserta el par�metro en el director
	 * @param director Nombre del director de la pel�cula
	 */
	public void setDirector(String director) { // selecciona el director
		this.director = director;
	}

	/**
	 * Retorna el nombre de los actores de la pel�cula
	 * @return actores
	 */
	public String getActores() { // muestra los actores
		return actores;
	}

	/**
	 * Inserta el par�metro en los actores
	 * @param actores Nombre de los actores de la pel�cula
	 */
	public void setActores(String actores) { // selecciona los actores
		this.actores = actores;
	}

	/**
	 * Retorna el nombre de la categor�a
	 * @return categoria
	 */
	public String getCategoria() { // mestra la categor�a
		return categoria;
	}

	/**
	 * Inserta el par�metro en la categor�a
	 * @param categoria
	 */
	public void setCategoria(String categoria) { // selecciona la categor�a
		this.categoria = categoria;
	}

	/**
	 * Retorna la duraci�n de la pel�cula
	 * @return duracion
	 */
	public String muestraDuracion() { // muestra la duraci�n
		return duracion + "min";
	}

	/**
	 * Inserta el par�metro en la duraci�n
	 * @param duracion
	 */
	public void setDuracion(int duracion) { // selecciona la duraci�n
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
	 * Inserta el par�metro en el resumen de la pel�cula
	 * @param resumen
	 */
	public void setResumen(String resumen) { // selecciona el resumen
		this.resumen = resumen;
	}

	/**
	 * Muestra todos los datos de la pel�cula en una String
	 * @return 
	 */
	public String muestraDVDCine() {
		return titulo + " De: " + director + "\nCon: " + actores + "\n" + categoria + "-" + duracion + " min"
				+ "\nResumen: " + ((resumen != null) ? resumen : "No tiene resumen");
	}

	/**
	 * M�todo boolean que retorna true si la categor�a es thriller y false si no
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
	 * M�todo boolean que retorna true si la pel�cula tiene resumen o false si no
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