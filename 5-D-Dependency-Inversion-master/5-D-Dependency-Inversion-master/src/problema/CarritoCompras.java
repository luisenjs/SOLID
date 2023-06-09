package problema;

public class CarritoCompras {//clase de alto nivel
	public static void comprar(Compra compra) {
		AccesoDatosSQL baseDatosSQL = new AccesoDatosSQL(); //clase de bajo nivel
		baseDatosSQL.guardarCompra(compra);
		
		PagoTarjetaCredito metodoPagoCredito = new PagoTarjetaCredito(); //clase de bajo nivel
		metodoPagoCredito.pagarCompra(compra);
	}
}
