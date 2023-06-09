package solucion.aplicacion;

import solucion.Bateria;
import solucion.Guitarra;
import solucion.Musica;

public class Aplicacion {
	public static void main(String[] args) {
		Bateria bateria = new Bateria();

		bateria.afinar();

		//Musica.reproducirMelodia(bateria); ya no es permitido por el tipo de dato
		Musica.reproducirRitmo(bateria);

		System.out.println("------------------");

		Guitarra guitarra = new Guitarra();

		guitarra.afinar();

		Musica.reproducirMelodia(guitarra);
		//Musica.reproducirRitmo(guitarra); ya no es permitido por el tipo de dato
	}
}
