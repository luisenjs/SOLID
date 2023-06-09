package solucion.aplicacion;

import solucion.Animal;
import solucion.AnimalLivano;
import solucion.Elefante;
import solucion.Perro;
import solucion.aplicacion.Aplicacion;

public class Aplicacion {
	public static void saltarHueco(AnimalLivano animal) {
		animal.caminar();
		animal.saltar();
		animal.caminar();
	}

	public static void main(String[] args) {

		Elefante elefante = new Elefante();
		Perro perro = new Perro();
		
		//Aplicacion.saltarHueco(elefante); ya no es posible por el tipo de argumento
		Aplicacion.saltarHueco(perro);

	}
}
