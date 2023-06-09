package problema.aplicacion;

import problema.Animal;
import problema.Elefante;

public class Aplicacion {

	public static void saltarHueco(Animal animal) {
		animal.caminar();
		animal.saltar();
		animal.caminar();
	}

	public static void main(String[] args) {

		Elefante elefante = new Elefante();
		Aplicacion.saltarHueco(elefante);

	}
}
