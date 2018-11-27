package ej_12_sueldobruto;

public class Empleado {

	private String nombre;
	private double nhoras;
	private double tarifa;
	
	Empleado(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNhoras() {
		return nhoras;
	}

	public void setNhoras(double nhoras) {
		this.nhoras = nhoras;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double sueldoBruto() {
		if (nhoras > 40) {
			return ((40 * tarifa) + ((nhoras - 40)
					* (tarifa + (tarifa / 2)))); /* este me calcula el sueldo con la tarifa de las 40h mas la tarifa
													 * y media de las horas extras a 40 */
		} else {
			return nhoras * tarifa; // calcula la tarifa normal
		}
	}
	
	

}
