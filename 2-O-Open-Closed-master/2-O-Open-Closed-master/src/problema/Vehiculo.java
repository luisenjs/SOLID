package problema;

public class Vehiculo {
	private TipoVehiculo tipo;

	public Vehiculo(TipoVehiculo tipo) {
		super();
		this.tipo = tipo;
	}

	public void dibujar() {
		switch (this.tipo) {
		case CARRO:
			dibujarCarro();
			break;
		case MOTO:
			dibujarMoto();
			break;

		default:
			System.out.println("Tipo de vehiculo invalido");
			break;
		}
	}
	
	private void dibujarCarro() {
		System.out.println("dibujo de un carro");
	}
	
	private void dibujarMoto() {
		System.out.println("dibujo de una moto");
	}

}
