package arrays.medium

/**
 * Escribe una función que teniendo un array de enteros no vacíos y un número objetivo, mueva todas las instancias
 * iguales al número objetivo al final de la lista. Esta modificación debe hacerse a la misma lista y no crear una copia
 * de esta. No es necesario mantener el orden original de los números distintos al número objetivo.
 *
 * Parámetros de ejemplo:
 * numbers = [2, 1, 2, 2, 2, 3, 4, 2]
 * toMove = 2
 *
 * Resultado de ejemplo:
 * [1, 3, 4, 2, 2, 2, 2, 2]
 *
 * Pista 1:
 * Puedes resolver este problema con una solución de tiempo lineal
 *
 * Pista 2:
 * En vista de la pista #1, puede resolver este problema sin ordenar el array de entrada. Intente configurar dos punteros
 * al principio y extremo del array, respectivamente, y moviéndolos progresivamente hacia adentro.
 *
 * Pista 3:
 * Siguiendo la pista #2, establezca dos punteros al principio y al final del array, respectivamente. Mueva el puntero
 * derecho hacia la izquierda (reducirlo) mientras que sea igual al número entero a mover, y mueva el puntero izquierdo
 * hacia la derecha (aumentarlo) siempre que no apunte al número entero a mover.
 * Cuando ambos punteros no se muevan, intercambie sus valores en su lugar. Repita este proceso hasta que los punteros
 * se pasen entre sí.
 *
 * Time & Space Complexity óptimo:
 * O(n) time
 * O(1) space
 * donde N es el tamaño del array.
 */

/**
 * Solución 1:
 * O(n) time
 * O(1) space
 *
 * Aunque hacemos un while interno a otro, no estamos recorriendo nuevamente cada elemento. Solo pasamos una vez por
 * cada número. Por eso sigue manteniéndose una complejidad lineal en cuanto a tiempo.
 */

fun moveElementsToEnd(numbers: MutableList<Int>, toMove: Int): List<Int> {
    var leftIndex = 0
    var rightIndex = numbers.lastIndex

    while (leftIndex < rightIndex) {
        while (leftIndex < rightIndex && numbers[rightIndex] == toMove) {
            rightIndex--
        }
        if (numbers[leftIndex] == toMove) {
            swapNumbers(
                leftIndex,
                rightIndex,
                numbers
            )
        }
        leftIndex++
    }
    return numbers
}

private fun swapNumbers(leftIndex: Int, rightIndex: Int, numbers: MutableList<Int>) {
    numbers[rightIndex].also {
        numbers[rightIndex] = numbers[leftIndex]
        numbers[leftIndex] = it
    }
}