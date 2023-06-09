package problema;

public class Musica {
	public static void reproducirMelodia(InstrumentoMusical instrumento) {
		instrumento.reproducirNotaFa();
		instrumento.reproducirNotaMi();
		instrumento.reproducirNotaRe();
		instrumento.reproducirNotaDo();
		instrumento.reproducirNotaRe();
		instrumento.reproducirNotaRe();

	}

	public static void reproducirRitmo(InstrumentoMusical instrumento) {
		instrumento.reproducirBombo();
		instrumento.reproducirBombo();
		instrumento.reproducirRedoblante();
	}
	

}
