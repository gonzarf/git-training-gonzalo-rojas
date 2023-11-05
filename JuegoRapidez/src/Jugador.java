public class Jugador extends Thread {
    private CuencoCaramelos cuenco;
    private int caramelosObtenidos;
    private String nombre;

    public Jugador(String nombre, CuencoCaramelos cuenco) {
        this.nombre = nombre;
        this.cuenco = cuenco;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCaramelosObtenidos() {
        return caramelosObtenidos;
    }

    @Override
    public synchronized void run() {
        while (cuenco.hayCaramelos()) {
            caramelosObtenidos++;
            cuenco.robarCaramelo();
        }
    }
}