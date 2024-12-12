package arrays.easy

import kotlin.math.abs

/**
 * Escribe una función que recibe un array no vacío de enteros que están ordenados en sentido ascendente y que retorne
 * un nuevo array del mismo tamaño con los valores del array original al cuadrado, también ordenados en sentido ascendente.
 *
 * Parámetros de ejemplo:
 * array: [1, 2, 3, 5, 6, 8, 9]
 *
 * Resultado de ejemplo:
 * [1, 4, 9, 25, 36, 64, 81]
 *
 * Pista 1:
 * Mientras que los enteros en el array de entrada están ordenados en forma ascendente, no necesariamente sus cuadrados
 * estarán en ese mismo orden, ya que puede haber negativos en el array.
 *
 * Pista 2:
 * Recorre el array de entrada valor por valor, elevándolo al cuadrado cada uno e inserta el resultado al array de salida.
 * Luego, ordena el array de salida antes de devolverlo. ¿Es la solución más óptima?
 *
 * Pista 3:
 * Para reducir el time complexity del algoritmo mencionado en la Pista 2, debes evitar ordenar el array de salida. Para
 * poder hacer esto, mientras elevas al cuadrado cada uno de los valores del array de entrada, intenta insertarlos
 * directamente en la posición adecuada dentro del array de salida.
 *
 * Pista 4:
 * Usa dos punteros para mantener un registro del menor y mayor valor del array de entrada. Compara los valores absolutos
 * de estos dos números, eleva al cuadrado el valor más grande, y ubícalo al final del array de salida,
 * llenándolo de esa forma de derecha a izquierda. Mueve los punteros respectivamente y repite el proceso hasta que el
 * array de salida este lleno.
 *
 * Time & Space Complexity óptimo:
 * O(N) time
 * O(N) space
 * donde N es el tamaño del array.
 */

/**
 * Solución 1:
 * O(n^2) time
 * O(n) space
 *
 * Solución más sencilla pero menos óptima.
 */

fun sortedSquaredArrayFirstSol(array: List<Int>): List<Int> {
    val sortedSquaredArray = array.map { 0 }.toMutableList()

    array.forEachIndexed { index, i ->
        val currentNumber = array[index]
        sortedSquaredArray[index] = currentNumber.times(currentNumber)
    }

    return sortedSquaredArray.sorted()
}

/**
 * Solución 2:
 * O(n) time
 * O(1) space
 */

fun sortedSquaredArraySecondSol(array: List<Int>): List<Int> {
    val sortedSquaredArray = array.map { 0 }.toMutableList()

    var leftIndex = 0
    var rightIndex = array.lastIndex

    for (index in array.size - 1 downTo 0) {
        val leftNumber = array[leftIndex]
        val rightNumber = array[rightIndex]

        if (abs(leftNumber) > abs(rightNumber)) {
            sortedSquaredArray[index] = leftNumber.times(leftNumber)
            leftIndex++
        } else {
            sortedSquaredArray[index] = rightNumber.times(rightNumber)
            rightIndex--
        }
    }
    return sortedSquaredArray
}