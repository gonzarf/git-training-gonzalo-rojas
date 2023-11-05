#JUEGO DE RAPIDEZ
Este programa en Java simula un juego de rapidez en el que 10 participantes compiten por caramelos de un cuenco. 
Al final del juego, se muestra el recuento de caramelos que obtuvo cada jugador, y se declaran a los ganadores.

##FUNCIONAMIENTO
1.-Inicialización: El juego comienza con un cuenco de caramelos que contiene 100 caramelos. Se crean 10 jugadores, cada uno representado por un hilo (Jugador), y se les asigna un nombre único. Cada jugador tiene su propia cesta para recolectar caramelos.

2.-Competencia por Caramelos: Los jugadores compiten por los caramelos uno por uno. Mientras queden caramelos en el cuenco, cada jugador se acerca al cuenco y roba un caramelo, que luego añade a su propia cesta. Esto se repite hasta que no queden caramelos por robar.

3.-Esperar a que los Jugadores Terminen: Después de que todos los jugadores hayan terminado de competir por caramelos, el programa espera a que todos los hilos de los jugadores finalicen. Esto garantiza que se haya completado la competencia antes de mostrar los resultados.

4.-Mostrar el Recuento de Caramelos por Jugador: El programa muestra el recuento de caramelos que obtuvo cada jugador durante el juego. Esto se hace recorriendo la lista de jugadores y llamando al método getCaramelosObtenidos() para obtener el número de caramelos recolectados por cada jugador.

5.-Determinar a los Ganadores: Luego de mostrar el recuento de caramelos, el programa identifica a los ganadores. 
Para ello, se calcula el número máximo de caramelos obtenidos por algún jugador (maxCaramelos).
Después, se itera nuevamente por la lista dee jugadores para encontrar a los jugadores que obtuvieron este número máximo y se declaran como ganadores.


