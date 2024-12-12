package arrays.easy

/**
 * Está dándose lugar a un torneo de algoritmos, en la que los equipos de programación compiten unos con otros para
 * resolver los problemas de algoritmos tan rápido como puedan.
 * Cada equipo compite con todos los demás. Dos equipos compiten entre sí una sola vez y en cada competición
 * hay un equipo local y un visitante. En cada competición siempre hay un ganador y un perdedor, no hay empate. El equipo
 * ganador recibe 3 puntos mientras que el perdedor no recibe puntos (0). El ganador del torneo es aquel que recibe la
 * mayor cantidad de puntos.
 * Tenemos dos array: Un array de dos elementos representan los equipos que han competido entre sí y hay otro array que
 * contiene los resultados de cada competición. El primer array de entrada se llama "competitions" y el otro "results".
 * El array "competitions" guarda sus elementos en la forma ["homeTeam", "awayTeam"], donde cada equipo tiene un nombre
 * de máximo 30 caracteres.
 * El array "results" contiene información sobre el ganador de cada competición correspondiente en "competitions".
 * Específicamente, "results[i]" denota al ganador de "competitions[i]" donde el valor de "results[i]" si es igual a 1
 * significa que el equipo local en "competitions[i]" es el ganador, mientras que 0 significa que el equipo visitante
 * fue el ganador.
 * Escribe una función que devuelva el ganador del torneo.
 * Está garantizado que exactamente solo un equipo gana el torneo y que cada equipo compite con los demás equipos solo
 * una vez. Está también garantizado que el torneo tiene al menos dos equipos.
 *
 * Parámetros de ejemplo:
 * competitions = [["HTML", "C#"], ["C#", "Python"], ["Python", "HTML"]]
 * results = [0, 0, 1]
 *
 * Resultado de ejemplo:
 * "Python"
 * // C# vence a HTML, Python vence a C# y Python vence a HTML
 * // HTML hizo 0 puntos
 * // C# hizo 3 puntos
 * // Python hizo 6 puntos
 *
 * Pista 1:
 * No compliques la solución de este problema. ¿Cómo resolverías este problema a mano? Considera esa solución y trata
 * de trasladarlo al código.
 *
 * Pista 2:
 * Use un hash table para almacenar los puntos totales obtenidos por cada equipo, con los nombres de los equipos como
 * las claves en el hash table. Una vez que sabes cuántos puntos tiene cada equipo, ¿cómo puedes determinar cuál es el
 * ganador?
 *
 * Pista 3:
 * Itera a través de todas las competiciones y actualiza el hash table en cada iteración. Por cada competición, considera
 * el nombre del equipo ganador; si el nombre ya existe en el hash table, actualiza la entrada agregándole 3 puntos a su
 * valor. Si el nombre del equipo no existe en el hash table, agrega una nueva entrada con el nombre del equipo como clave y
 * valor de 3 puntos (ya que el equipo gana su primera competición). Mientras itera a través de las competiciones, mantén
 * un registro del equipo con mayor puntaje y al final del algoritmo retorna el equipo con el puntaje más alto.
 *
 * Time & Space Complexity óptimo:
 * O(N) time
 * O(K) space
 * donde N es el número de competiciones y K es el número de equipos.
 */

/**
 * Solución 1:
 */
fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
    var currentBestTeam = ""
    val scores = hashMapOf(currentBestTeam to 0)

    for (competitionIndex in competitions.indices) {
        val competition = competitions[competitionIndex]
        val result = results[competitionIndex]
        val (homeTeam, awayTeam) = competition

        val winningTeam = if (result == 1) homeTeam else awayTeam

        if (winningTeam !in scores) scores[winningTeam] = 3
        else scores[winningTeam] = scores[winningTeam]!!.plus(3)

        if (scores[winningTeam]!! > scores[currentBestTeam]!!) currentBestTeam = winningTeam
    }
    return currentBestTeam
}