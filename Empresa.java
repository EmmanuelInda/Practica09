import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private String codigoPostal;
	private String telefono;
	private Flota flota;

	public Empresa(String nombre, String codigoPostal, String telefono, Flota flota) {
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.flota = new Flota();
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public String getTelefono() {
		return telefono;
	}

	public Flota getFlota() {
		return flota;
	}
}

class Flota {
	private ArrayList<MedioDeTransporte> medios;

	public Flota() {
		this.medios = new ArrayList<>();
	}

	public void agregarMedioDeTransporte(MedioDeTransporte m) {
		this.medios.add(m);
	}

	public void eliminarMedioDeTransporte(MedioDeTransporte m) {
		this.medios.remove(m);
	}

	public ArrayList<MedioDeTransporte> getMedios() {
		return this.medios;
	}

	public int cantidadDeMedios() {
		return this.medios.size();
	}
}
