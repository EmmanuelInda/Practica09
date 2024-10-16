public class Mantenimiento {
	private String tipo;
	private String fecha;
	private double costo;

	public Mantenimiento(String tipo, String fecha, double costo) {
		this.tipo = tipo;
		this.fecha = fecha;
		this.costo = costo;
	}

	public String toString() {
		return "Mantenimitento: " + tipo + ", " + fecha + ", " + costo + ".";
	}
}
