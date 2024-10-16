class Caballo extends MedioDeTransporteAnimal {
	public Caballo(String nombre, String id, int anyoCreacion) {
		super(nombre, id, anyoCreacion);
	}

	@Override
	public void avanzar() {
		System.out.println("El caballo avanza trotando.");
	}

	@Override
	public void retroceder() {
		System.out.println("El caballo retrocede cuidadosamente.");
	}

	@Override
	public void virar() {
		System.out.println("El caballo vira moviendo su cuerpo.");
	}
}
