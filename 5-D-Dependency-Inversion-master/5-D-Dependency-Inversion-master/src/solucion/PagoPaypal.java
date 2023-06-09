package solucion;

public class PagoPaypal implements Pago{

	@Override
	public void pagarCompra(Compra compra) {
		System.out.println("*Compra pagada con Paypal*");
		
	}

}
