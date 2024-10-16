class Avion extends MedioDeTransporteMecánico {
	public Avion(String nombre, String id, int anyoCreacion) {
		super(nombre, id, anyoCreacion);
	}

	@Override
	public void avanzar() {
		System.out.println("El avion vuela por el aire.");
	}

	@Override
	public void retroceder() {
		System.out.println("El avion retrocede en el suelo.");
	}

	@Override
	public void virar() {
		System.out.println("El avion vira en el aire.");
	}
}

