package solucion;

public class Impresora {
	public static void imprimirInformacionVehiculo(Vehiculo vehiculo) {
		System.out.println("Numero de llantas: " + vehiculo.getNumeroLlantas() + " \nVelocidad maxima: " + vehiculo.getVelocidadMaxima());
	}
}
