package solucion;

public class Guitarra implements InstrumentoCuerda{

	@Override
	public void tocar(){
		System.out.println("Reproduciendo guitarra...");
	}
	
	@Override
	public void afinar() {
		System.out.println("*Afinar cuerda*");
		
	}

	@Override
	public void vibrarCuerda(){
		System.out.println("Tocando cuerda...");
	}

}
