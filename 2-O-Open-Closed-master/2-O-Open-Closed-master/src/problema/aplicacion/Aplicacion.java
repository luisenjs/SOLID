package problema.aplicacion;

import problema.TipoVehiculo;
import problema.Vehiculo;

public class Aplicacion {
	public static void main(String[] args) {
		Vehiculo carro = new Vehiculo(TipoVehiculo.CARRO);
		Vehiculo moto = new Vehiculo(TipoVehiculo.MOTO);
		
		carro.dibujar();
		moto.dibujar();
	}
}
