class Autobus extends MedioDeTransporteMecánico {
	public Autobus(String nombre, String id, int anyoCreacion) {
		super(nombre, id, anyoCreacion);
	}

	@Override
	public void avanzar() {
		System.out.println("El autobus avanza con pasajeros abordo.");
	}

	@Override
	public void retroceder() {
		System.out.println("El autobus retroceder con precaucion.");
	}

	@Override
	public void virar() {
		System.out.println("El autobus gira lentamente.");
	}
}
