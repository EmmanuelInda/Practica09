import java.util.ArrayList;

abstract class MedioDeTransporte {
	private String nombre;
	private String id;
	private int anyoCreacion;
	private ArrayList<Mantenimiento> historial;

	public MedioDeTransporte(String nombre, String id, int anyoCreacion) {
		this.nombre = nombre;
		this.id = id;
		this.anyoCreacion = anyoCreacion;
		this.historial = new ArrayList<>();
	}

	public void agregarMantenimiento(Mantenimiento m) {
		this.historial.add(m);
	}

	public String getMantenimiento() {
		return this.historial.toString();
	}

	public abstract void avanzar();

	public abstract void retroceder();

	public abstract void virar();

	public String getNombre() {
		return nombre;
	}
}
