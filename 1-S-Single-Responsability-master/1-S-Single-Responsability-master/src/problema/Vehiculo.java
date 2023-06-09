package problema;

public class Vehiculo {
	private Integer numeroLlantas;
	private Integer velocidadMaxima;

	public Vehiculo(Integer numeroLlantas, Integer velocidadMaxima) {
		super();
		this.numeroLlantas = numeroLlantas;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void mostrarInformacion() {
		System.out.println("Numero de llantas: " + numeroLlantas + " \nVelocidad maxima: " + velocidadMaxima);
	}

	public Integer getNumeroLlantas() {
		return numeroLlantas;
	}

	public void setNumeroLlantas(Integer numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	
	

}
