package problema;

public class Guitarra implements InstrumentoMusical{

	@Override
	public void reproducirNotaDo() {
		System.out.println("*Nota Do*");
		
	}

	@Override
	public void reproducirNotaRe() {
		System.out.println("*Nota Re*");
		
	}

	@Override
	public void reproducirNotaMi() {
		System.out.println("*Nota Mi*");
		
	}

	@Override
	public void reproducirNotaFa() {
		System.out.println("*Nota Fa*");
		
	}

	@Override
	public void reproducirRedoblante() {
		System.err.println("ERROR: Una guitarra no puede reproducir el sonido de un Redoblante");
		
	}

	@Override
	public void reproducirBombo() {
		System.err.println("ERROR: Una guitarra no puede reproducir el sonido de un Bombo");
		
	}

	@Override
	public void afinarCuerda() {
		System.out.println("*Afinar cuerda*");
		
	}

	@Override
	public void afinarParche() {
		System.err.println("ERROR: Una guitarra no puede afinar parches");
		
	}

}
