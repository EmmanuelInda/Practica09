class Burro extends MedioDeTransporteAnimal {
	public Burro(String nombre, String id, int anyoCreacion) {
		super(nombre, id, anyoCreacion);
	}

	@Override
	public void avanzar() {
		System.out.println("El burro avanza con pasos firmes.");
	}

	@Override
	public void retroceder() {
		System.out.println("El burro retrocede lentamente.");
	}

	@Override
	public void virar() {
		System.out.println("El burro vira con cautela.");
	}
}
