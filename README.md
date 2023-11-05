# Juego de Rapidez

Este programa en Java es un juego en el que 10 participantes compiten por caramelos de un cuenco. Al final del juego, se muestra el recuento de caramelos que obtuvo cada jugador, y se declara a el ganador.

## Funcionamiento

- **Inicialización**: El juego comienza con un cuenco de caramelos que contiene 10000 caramelos. Se crean 10 jugadores, cada uno representado por un hilo (Jugador), y se les asigna un nombre único. Cada jugador tiene su propia cesta para recolectar caramelos.

- **Competencia por Caramelos**: Los jugadores compiten por los caramelos uno por uno. Mientras queden caramelos en el cuenco, cada jugador se acerca al cuenco y roba un caramelo, que luego añade a su propia cesta. Esto se repite hasta que no queden caramelos por robar.

- **Esperar a que los Jugadores Terminen**: Después de que todos los jugadores hayan terminado de competir por caramelos, el programa espera a que todos los hilos de los jugadores finalice. Esto garantiza que se puedan mostrar los resultados sin que un hilo este aun funcionando.

- **Mostrar el Recuento de Caramelos por Jugador**: El programa muestra el recuento de caramelos que obtuvo cada jugador durante el juego. Esto se hace recorriendo la lista de jugadores y llamando al método `getCaramelosObtenidos()` para obtener el número de caramelos recolectados por cada jugador.

- **Determinar a los Ganadores**: Luego de mostrar el recuento de caramelos, el programa identifica a los ganadores. Para ello, se compara el número de caramelos que ha recogido cada jugador y se guarda en una variable que se queda con el valor mas alto.


