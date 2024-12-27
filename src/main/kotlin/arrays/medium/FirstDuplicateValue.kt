package arrays.medium

import java.lang.Integer.min
import kotlin.math.abs

/**
 * Dado un array de enteros entre 1 y n, inclusivo, donde "n" es el tamaño del arreglo, escribe una función que retorne
 * el primer entero que aparece más de una vez (cuando el arreglo es leído de izquierda a derecha).
 * En otras palabras, a pesar de que haya más de un número que se repita, la función debe retornar el primer
 * entero que aparezca dos veces (el mínimo índice).
 * Si no hay ningún entero que aparezca más de una vez, la función debe devolver -1.
 * Nota: Puedes hacer mutable el array de entrada.
 *
 * Parámetros de ejemplo:
 * numbers = [2, 1, 5, 2, 3, 3, 4]
 *
 * Resultado de ejemplo:
 * 2 // 2 y 3 se repiten, pero el segundo 2 aparece antes que el segundo 3.
 *
 * Pista 1:
 * La solución con fuerza bruta tiene un time-complexity de O(n^2). Piensa en cómo puedes determinar si un valor aparece
 * dos veces en un array.
 *
 * Pista 2:
 * Puedes usar una estructura de datos que tenga una búsqueda de elementos en tiempo constante para almacenar los enteros
 * que ya han sido "vistos". Esto permitirá encontrar una solución con time-complexity linear.
 *
 * Pista 3:
 * Siempre debes prestar atención a los detalles del enunciado de la pregunta. En esta pregunta, los enteros del array
 * son valores entre 1 y N (inclusivo), donde N es el tamaño del array de entrada. El enunciado explícitamente nos permite
 * mutar el array. ¿Cómo pueden ayudarnos estos detalles para encontrar una mejor solución, ya sea sobre su time-complexity
 * o space-complexity?
 *
 * Pista 4:
 * Debido a que los enteros están entre 1 y el tamaño del array de entrada, puedes mapear cada valor a un índice del array.
 * Ese índice será el valor del entero restando 1. Una vez que has mapeado un valor a un índice del array, puedes mutar ese
 * valor y hacerlo negativo (multiplicándole -1). En otras palabras, en el índice [N-1] irá el valor -N.
 * Ya que los enteros normalmente no son negativos, la primera vez que encuentres un valor negativo en el índice que un
 * entero es mapeado, sabrás que ese entero ya fue visto anteriormente.
 */

/**
 * Solución 1:
 * O(n^2) time
 * O(1) space
 */

fun firstDuplicateValueFirstSol(numbers: MutableList<Int>): Int {

    var minimumSecondIndex = numbers.size

    for (firstIterationIndex in numbers.indices) {
        val firstOccurrence = numbers[firstIterationIndex]
        for (secondIterationIndex in firstIterationIndex + 1 until numbers.size) {
            val valueToCompare = numbers[secondIterationIndex]
            if (firstOccurrence == valueToCompare) {
                minimumSecondIndex = min(minimumSecondIndex, secondIterationIndex)
            }
        }
    }
    if (minimumSecondIndex == numbers.size) return -1
    return numbers[minimumSecondIndex]
}

/**
 * Solución 2:
 * O(n) time
 * O(n) space
 */

fun firstDuplicateValueSecondSol(numbers: MutableList<Int>): Int {

    val recordNumbers = mutableSetOf<Int>()

    for (number in numbers) {
        if (number in recordNumbers) return number
        else recordNumbers.add(number)
    }
    return -1
}

/**
 * Solución 3:
 * O(n) time
 * O(n) space
 * Haciendo uso de las dos indicaciones especiales:
 * - Los valores del array van desde el 1 hasta el n, siendo n la logitud del array.
 * - El array de entrada es mutable.
 */

fun firstDuplicateValueThirdSol(numbers: MutableList<Int>): Int {

    for (number in numbers) {
        val absNumber = abs(number)
        if (numbers[absNumber - 1] < 0) return absNumber
        numbers[absNumber - 1] *= -1
    }
    return -1
}