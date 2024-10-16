public class MedioDeTransporteAnimal extends MedioDeTransporte {
	public MedioDeTransporteAnimal(String nombre, String id, int anyoCreacion) {
		super(nombre, id, anyoCreacion);
	}

	public void preparar() {
		System.out.println("El " + super.toString() + " se esta preparando.");
	}

	public void descansar() {
		System.out.println("El " + super.toString() + " esta descansando.");
	}

	public void avanzar() {}

	public void retroceder() {}

	public void virar() {}
}
