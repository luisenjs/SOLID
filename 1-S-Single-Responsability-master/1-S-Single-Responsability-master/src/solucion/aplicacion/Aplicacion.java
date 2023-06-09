package solucion.aplicacion;

import solucion.Vehiculo;
import solucion.Impresora;

public class Aplicacion {
	public static void main(String[] args) {
		Vehiculo vehiculo = new Vehiculo(4, 200);
		Impresora.imprimirInformacionVehiculo(vehiculo);
	}
}
