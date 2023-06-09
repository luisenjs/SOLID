package solucion;

public class AccesoDatosMongo implements AccesoDatos{

	@Override
	public void guardarCompra(Compra compra) {
		System.out.println("*Compra guardada en la base de datos Mongo*");		
	}

}
