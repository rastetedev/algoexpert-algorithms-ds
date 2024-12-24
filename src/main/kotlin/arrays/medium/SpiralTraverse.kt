package arrays.medium

/**
 * Escribe una función que toma como parámetro un array de dos dimensiones "N" x "M" ("N" puede ser igual a "M") y que
 * retorne un array de una dimensión con los elementos del array de dos dimensiones en orden espiral.
 *
 * El orden espiral comienza en la esquina superior-izquierda de la matriz, avanza hacia la derecha y continua con un
 * patrón espiral hasta que cada elemento haya sido recorrido.
 *
 * Parámetros de ejemplo:
 * matrix = [
 *      [ 1, 2, 3,4],
 *      [12,13,14,5],
 *      [11,16,15,6],
 *      [10, 9, 8,7]
 *  ]
 *
 * Resultado de ejemplo:
 * [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
 *
 * Pista 1:
 * Puedes pensar en el espiral que debes recorrer como un conjunto de perímetros de rectángulos que progresivamente se
 * hacen más pequeños, en otras palabras, que progresivamente se va moviendo hacia adentro en ambas dimensiones.
 *
 * Pista 2:
 * Siguiendo la Pista 1, declara 4 variables: una fila inicial, una columna inicial, una fila final y una columna final.
 * Estas cuatro variables representan las esquinas o límites del perímetro del primer rectángulo en el espiral que debes
 * recorrer. Recorre el perímetro usando esos límites, y luego mueve los límites hacia adentro. Finaliza tu algoritmo una
 * vez que la final inicial pasa a la fila final o la columna inicial pasa a la columna final.
 *
 * Pista 3:
 * Puedes resolver este problema de manera tanto iterativa como recursiva siguiendo una lógica similar entre ambas.
 *
 * Time & Space Complexity óptimo:
 * O(n) time
 * O(n) space
 * donde N es el tamaño del array.
 */

/**
 * Solución 1:
 */

fun spiralTraverseFirstSol(matrix: List<List<Int>>): List<Int> {

    val result = mutableListOf<Int>()

    var startRowIndex = 0
    var endRowIndex = matrix.lastIndex
    var startColumnIndex = 0
    var endColumnIndex = matrix.first().lastIndex

    while (startRowIndex <= endRowIndex && startColumnIndex <= endColumnIndex) {

        for (column in startColumnIndex..endColumnIndex) {
            result.add(matrix[startRowIndex][column])
        }

        for (row in startRowIndex + 1..endRowIndex) {
            result.add(matrix[row][endColumnIndex])
        }

        for (column in endColumnIndex - 1 downTo startColumnIndex) {
            //Manejando el caso especial cuando solo hay una fila en la mitad de la matrix
            //Asi no contamos doble los valores de la fila en la cual ya lo contamos en la primera vuelta
            if (startRowIndex == endRowIndex) break
            result.add(matrix[endRowIndex][column])
        }

        for (row in endRowIndex - 1 downTo startRowIndex + 1) {
            //Manejando el caso especial cuando solo hay una columna en la mitad de la matrix
            //Asi no contamos doble los valores de la columna en la cual ya lo contamos en la primera vuelta
            if (startColumnIndex == endColumnIndex) break
            result.add(matrix[row][startColumnIndex])
        }

        startRowIndex++
        endRowIndex--
        startColumnIndex++
        endColumnIndex--
    }

    return result
}

fun spiralTraverseSecondSol(matrix: List<List<Int>>): List<Int> {
    val result = mutableListOf<Int>()

    fillInSpiral(
        matrix = matrix,
        startRowIndex = 0,
        endRowIndex = matrix.lastIndex,
        startColumnIndex = 0,
        endColumnIndex = matrix.first().lastIndex,
        result
    )
    return result
}

private fun fillInSpiral(
    matrix: List<List<Int>>,
    startRowIndex: Int,
    endRowIndex: Int,
    startColumnIndex: Int,
    endColumnIndex: Int,
    result: MutableList<Int>
) {
    if (startRowIndex > endRowIndex || startColumnIndex > endColumnIndex) return

    for (column in startColumnIndex..endColumnIndex) {
        result.add(matrix[startRowIndex][column])
    }

    for (row in startRowIndex + 1..endRowIndex) {
        result.add(matrix[row][endColumnIndex])
    }

    for (columna in endColumnIndex - 1 downTo startColumnIndex) {
        if (startRowIndex == endRowIndex) break
        result.add(matrix[endRowIndex][columna])
    }

    for (row in endRowIndex - 1 downTo startRowIndex + 1) {
        if (startColumnIndex == endColumnIndex) break
        result.add(matrix[row][startColumnIndex])
    }

    fillInSpiral(
        matrix = matrix,
        startRowIndex = startRowIndex + 1,
        endRowIndex = endRowIndex - 1,
        startColumnIndex = startColumnIndex + 1,
        endColumnIndex = endColumnIndex - 1,
        result = result
    )
}