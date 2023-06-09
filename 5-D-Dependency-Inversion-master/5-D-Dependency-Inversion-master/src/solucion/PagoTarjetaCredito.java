package solucion;

public class PagoTarjetaCredito implements Pago {

	@Override
	public void pagarCompra(Compra compra) {
		System.out.println("*Compra pagada con tarjeta de credito*");

	}

}
