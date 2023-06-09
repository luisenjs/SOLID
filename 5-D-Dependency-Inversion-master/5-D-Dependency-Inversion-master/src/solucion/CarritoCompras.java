package solucion;

public class CarritoCompras {

	private AccesoDatos accesoDatos;
	private Pago metodoPago;

	public CarritoCompras(AccesoDatos accesoDatos, Pago metodoPago) {
		this.accesoDatos = accesoDatos;
		this.metodoPago = metodoPago;
	}

	public void comprar(Compra compra) {
		accesoDatos.guardarCompra(compra);
		metodoPago.pagarCompra(compra);

	}
}
