package solucion.aplicacion;

import solucion.Carro;
import solucion.Moto;

public class Aplicacion {
	public static void main(String[] args) {
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		carro.dibujar();
		moto.dibujar();
	}
}
