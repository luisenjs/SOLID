package solucion.aplicacion;

import solucion.CarritoCompras;
import solucion.AccesoDatosMongo;
import solucion.AccesoDatosSQL;
import solucion.Compra;
import solucion.PagoPaypal;
import solucion.PagoTarjetaCredito;

public class Aplicacion {
	public static void main(String[] args) {
		Compra productoComprado = new Compra();
		
		AccesoDatosSQL accesoDatosSQL = new AccesoDatosSQL();
		PagoTarjetaCredito metodoPagoCredito = new PagoTarjetaCredito();
		
		CarritoCompras carrito = new CarritoCompras(accesoDatosSQL,metodoPagoCredito);
		carrito.comprar(productoComprado);
		
		System.out.println("--------------------------------------------");
		
		
		AccesoDatosMongo accesoDatosMongo = new AccesoDatosMongo();
		PagoPaypal metodoPagoPaypal = new PagoPaypal();
		
		
		CarritoCompras carrito2 = new CarritoCompras(accesoDatosMongo,metodoPagoPaypal);
		carrito2.comprar(productoComprado);
		
		
		
	}
}
