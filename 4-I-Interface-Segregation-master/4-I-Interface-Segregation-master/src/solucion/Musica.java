package solucion;

public class Musica {
	public static void reproducirMelodia(Instrumento instrumento) {
		instrumento.tocar();

	}

	public static void reproducirRitmo(InstrumentoPercusion instrumento) {
		instrumento.reproducirBombo();
		instrumento.reproducirBombo();
		instrumento.reproducirRedoblante();
	}

	public static void reproducirVibración(InstrumentoCuerda instrumento){
		instrumento.vibrarCuerda();
	}

	public static void soplarInstrumento(InstrumentoViento instrumento){
		instrumento.taparOrificio();
		instrumento.destaparOrificio();
	}
}
