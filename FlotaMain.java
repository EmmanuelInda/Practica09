import java.util.ArrayList;

public class FlotaMain {
	public static void main(String[] args) {
		Empresa empresa = new Empresa("Turistas Felices", "12345", "555-1234", new Flota());

		Caballo caballo = new Caballo("Caballo Aventurero", "C001", 2015);
		Camello camello = new Camello("Camello Desertico", "C002", 2012);
		Burro burro = new Burro("Burro Trabajador", "B001", 2018);
		Bicicleta bicicleta = new Bicicleta("Bicicleta Urbana", "B002", 2020);
		Avion avion = new Avion("Avion de Paracaidismo", "A001", 2022);
		Autobus autobus = new Autobus("Autobus de Ciudades", "A002", 2019);

		Flota flota = empresa.getFlota();
		flota.agregarMedioDeTransporte(caballo);
		flota.agregarMedioDeTransporte(camello);
		flota.agregarMedioDeTransporte(burro);
		flota.agregarMedioDeTransporte(bicicleta);
		flota.agregarMedioDeTransporte(avion);
		flota.agregarMedioDeTransporte(autobus);

		System.out.println("Cantidad de medios en la flota: " + flota.cantidadDeMedios());

		caballo.avanzar();
		camello.virar();
		burro.retroceder();

		bicicleta.avanzar();
		avion.virar();
		autobus.retroceder();

		Mantenimiento m1 = new Mantenimiento("Cambio de herraduras", "2024-01-15", 150.0);
		caballo.agregarMantenimiento(m1);

		Mantenimiento m2 = new Mantenimiento("Revision general", "2024-03-10", 500.0);
		avion.agregarMantenimiento(m2);

		Mantenimiento m3 = new Mantenimiento("Cambio de aceite", "2024-02-05", 100.0);
		autobus.agregarMantenimiento(m3);

		System.out.println("\nMantenimientos:");
		System.out.println(caballo.getMantenimiento().toString());
		System.out.println(avion.getMantenimiento().toString());
		System.out.println(autobus.getMantenimiento().toString());

		System.out.println("\nMedios de transporte en la flota:");
		for (MedioDeTransporte medio : flota.getMedios())
			System.out.println(medio.getNombre());
	}
}
