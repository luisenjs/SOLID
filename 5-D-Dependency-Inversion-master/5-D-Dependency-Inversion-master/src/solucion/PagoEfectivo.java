package solucion;

public class PagoEfectivo implements Pago{

    @Override
    public void pagarCompra(Compra compra) {
        System.out.println("Pagando en efectivo...");
    }
    
}
