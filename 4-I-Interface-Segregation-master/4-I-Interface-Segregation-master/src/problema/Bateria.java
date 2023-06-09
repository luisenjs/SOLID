package problema;

public class Bateria implements InstrumentoMusical{

	@Override
	public void reproducirNotaDo() {
		System.err.println("ERROR: Una bateria no puede reproducir la nota Do");
	}

	@Override
	public void reproducirNotaRe() {
		System.err.println("ERROR: Una bateria no puede reproducir la nota Re");
		
	}

	@Override
	public void reproducirNotaMi() {
		System.err.println("ERROR: Una bateria no puede reproducir la nota Mi");
		
	}
	
	@Override
	public void reproducirNotaFa() {
		System.err.println("ERROR: Una bateria no puede reproducir la nota Fa");
		
	}

	@Override
	public void reproducirRedoblante() {
		System.out.println("*Sonido de Redoblante*");
		
	}

	@Override
	public void reproducirBombo() {
		System.out.println("*Sonido de Bombo*");
		
	}

	@Override
	public void afinarCuerda() {
		System.err.println("ERROR: Una bateria no puede afinar cuerdas");
		
	}

	@Override
	public void afinarParche() {
		System.out.println("*Afinar parche*");
		
	}



}
