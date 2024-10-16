public class MedioDeTransporteMecánico extends MedioDeTransporte {
	public MedioDeTransporteMecánico(String nombre, String id, int anyoCreacion) {
		super(nombre, id, anyoCreacion);
	}

	public void encender() {
		System.out.println("Encendiendo " + super.toString()  + ".");
	}

	public void apagar() {
		System.out.println("Apagando " + super.toString() + ".");
	}

	public void avanzar() {}

	public void retroceder() {}

	public void virar() {}
}
