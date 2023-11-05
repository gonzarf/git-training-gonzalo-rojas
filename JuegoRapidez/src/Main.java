public class Main {
    public static void main(String[] args) {
        int numParticipantes = 10;
        int caramelosIniciales = 100000;
        CuencoCaramelos cuenco = new CuencoCaramelos(caramelosIniciales);

        Jugador[] jugadores = new Jugador[numParticipantes];
        for (int i = 0; i < numParticipantes; i++) {
            jugadores[i] = new Jugador("Jugador " + (i + 1), cuenco);
        }

        for(Jugador jugador: jugadores){
            jugador.start();
        }

        for (Jugador jugador : jugadores) {
            try {
                jugador.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int maxCaramelos = 0;
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + " obtuvo " + jugador.getCaramelosObtenidos() + " caramelos.");
            maxCaramelos = Math.max(maxCaramelos, jugador.getCaramelosObtenidos());

        }

        System.out.println("\nGanadores:");
        for (Jugador jugador : jugadores) {
            if (jugador.getCaramelosObtenidos() == maxCaramelos) {
                System.out.println(jugador.getNombre() + " con " + maxCaramelos + " caramelos.");
            }
        }
    }
}