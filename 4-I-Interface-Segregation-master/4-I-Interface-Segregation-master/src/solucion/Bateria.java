package solucion;

public class Bateria implements InstrumentoPercusion{

	@Override
	public void tocar() {
		System.out.println("Reproduciento batería...");
	}

	@Override
	public void afinar() {
		System.out.println("*Afinar parche*");
		
	}

	@Override
	public void reproducirRedoblante() {
		System.out.println("*Sonido de Redoblante*");
		
	}

	@Override
	public void reproducirBombo() {
		System.out.println("*Sonido de Bombo*");
		
	}

}
