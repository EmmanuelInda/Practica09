class Bicicleta extends MedioDeTransporteMecánico {
	public Bicicleta(String nombre, String id, int anyoCreacion) {
		super(nombre, id, anyoCreacion);
	}

	@Override
	public void avanzar() {
		System.out.println("La bicicleta avanza con sus dos ruedas.");
	}

	@Override
	public void retroceder() {
		System.out.println("La bicicleta retrocede pedaleando hacia atras.");
	}

	@Override
	public void virar() {
		System.out.println("La bicicleta gira agilmente.");
	}
}
