package solucion;

public class Flauta implements InstrumentoViento{

    @Override
    public void tocar() {
        System.out.println("Reproduciendo flauta...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando cabezal");
    }

    @Override
    public void taparOrificio() {
        System.out.println("Tapando orificio...");
    }

    @Override
    public void destaparOrificio() {
        System.out.println("Destapando orificio... ");
    }
    
}
