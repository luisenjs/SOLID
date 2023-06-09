package problema.aplicacion;

import problema.Bateria;
import problema.Guitarra;
import problema.Musica;

public class Aplicacion {
	
	public static void main(String[] args) {
		Bateria bateria = new Bateria();
		
		bateria.afinarParche();
		bateria.afinarCuerda();
		
		Musica.reproducirMelodia(bateria);
		Musica.reproducirRitmo(bateria);
		
		System.out.println("------------------");
		
		Guitarra guitarra = new Guitarra();
		
		guitarra.afinarCuerda();
		guitarra.afinarParche();
		
		Musica.reproducirMelodia(guitarra);
		Musica.reproducirRitmo(guitarra);
	}

}
