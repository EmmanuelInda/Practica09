class Camello extends MedioDeTransporteAnimal {
	public Camello(String nombre, String id, int anyoCreacion) {
		super(nombre, id, anyoCreacion);
	}

	@Override
	public void avanzar() {
		System.out.println("El camello avanza lentamente por el desierto.");
	}

	@Override
	public void retroceder() {
		System.out.println("El camello retrocede paso a paso.");
	}

	@Override
	public void virar() {
		System.out.println("El camello vira con pasos amplios.");
	}
}
