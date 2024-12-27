package arrays.medium

import kotlin.math.max

/**
 * Escribe una función que tome un array no vacío de intervalos arbitrarios (sin ningún orden en específico), una
 * los intervalos que se sobreponen, y retorne la lista de intervalos sin ningún orden en específico.
 * Cada intervalo "interval" es un array de dos enteros, donde el "interval[0]" es el inicio del intervalo y el
 * "interval[1]" es el final del intervalo.
 * Nota: Los intervalos consecutivos no son considerados sobrepuestos. Por ejemplo, [1,5] y [6,7] no están
 * sobrepuestos; sin embargo, [1,6] y [6,7] SI se sobreponen.
 * Nota: El inicio de cada intervalo siempre va a ser menor o igual que el final de ese intervalo.
 *
 * Parámetros de ejemplo:
 * intervals = [[1,2], [3,5], [4,7], [6,8], [9,10]]
 *
 * Resultado de ejemplo:
 * [[1,2], [3,8], [9,10]] // Une los intervalos [3,5], [4,7], [6,8]
 * // Los intervalos pueden ser ordenados de forma diferente.
 *
 * Pista 1:
 * El problema te pide que unas los intervalos sobrepuestos. ¿Cómo puedes determinar si dos intervalos se sobreponen?
 *
 * Pista 2:
 * Ordena los intervalos con respecto a sus valores de inicio. Esto te permitirá unir todos los intervalos sobrepuestos
 * en un solo recorrido.
 *
 * Pista 3:
 * Después de ordenar los intervalos con respecto a su valor de inicio, recórrelos, y en cada iteración compara el inicio
 * del siguiente intervalo con el final del intervalo actual para buscar una sobre posición. Si encuentras una
 * sobre posición, modifica el intervalo actual para fusionar el siguiente intervalo en él.
 *
 * Time & Space Complexity óptimo:
 * O(nlog(n)) time
 * O(n) space
 * donde N es el tamaño del array.
 */

fun mergeOverlappingIntervals(intervals: List<List<Int>>): List<List<Int>> {
    //Sorteamos los intervalos por su valor inicial
    var sortedIntervals =
        intervals.toMutableList().sortedWith { firstList, secondList -> firstList[0].compareTo(secondList[0]) }
    //Hacemos que cada intervalo sea mutable
    sortedIntervals = sortedIntervals.map { it.toMutableList() }

    val mergedIntervals = mutableListOf<MutableList<Int>>()

    var currentInterval = sortedIntervals.first()
    //Agregamos el primer intervalo a nuestra lista de salida.
    mergedIntervals.add(currentInterval)

    for (nextInterval in sortedIntervals) {
        val (_, currentIntervalEnd) = currentInterval
        val (nextIntervalStart, nextIntervalEnd) = nextInterval

        if (currentIntervalEnd >= nextIntervalStart) {
            currentInterval[1] = max(currentIntervalEnd, nextIntervalEnd)
        } else {
            currentInterval = nextInterval
            mergedIntervals.add(currentInterval)
        }
    }
    return mergedIntervals
}