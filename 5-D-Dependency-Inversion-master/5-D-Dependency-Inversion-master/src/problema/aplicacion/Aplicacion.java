package problema.aplicacion;

import problema.CarritoCompras;
import problema.Compra;

public class Aplicacion {
	public static void main(String[] args) {
		Compra productoComprado = new Compra();

		CarritoCompras.comprar(productoComprado);
	}
}
