public class CuencoCaramelos {
    private int caramelos;

    public CuencoCaramelos(int cantidadInicial) {
        caramelos = cantidadInicial;
    }

    public synchronized boolean hayCaramelos() {
        return caramelos > 0;
    }

    public synchronized void robarCaramelo() {
        if (caramelos > 0) {
            caramelos--;
        }
    }
}