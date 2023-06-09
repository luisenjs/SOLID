package solucion;

public class Vehiculo {
	private Integer numeroLlantas;
	private Integer velocidadMaxima;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Vehiculo(Integer numeroLlantas, Integer velocidadMaxima) {
		super();
		this.numeroLlantas = numeroLlantas;
		this.velocidadMaxima = velocidadMaxima;
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
