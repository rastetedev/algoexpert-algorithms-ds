package arrays.easy

/**
 * Se tiene como entrada un array de dos dimensiones "matrix". Escribe una función que retorne la transposición de "matrix".
 * La "transposición" de una matriz es una versión inversa de la original a través de su diagonal principal (arriba-
 * izquierda hacia abajo-derecha). En otras palabras, se invierten los índices de su fila y columna.
 * Puedes asumir que la "matrix" tiene siempre al menos un valor, pero el ancho y la altura de la "matrix" (número de filas
 * y número de columnas) no son necesariamente iguales.
 *
 * Parámetros de ejemplo:
 * matrix = [[1,2]]
 *
 * Resultado de ejemplo:
 * [[1], [2]]
 *
 * Pista 1:
 * Se deben invertir los índices de las filas y columnas de cada entrada de la matriz. Por ejemplo, el valor en la posición
 * [1][2] en la matriz original estará en la posición [2][1] en la transpuesta de la matriz.
 *
 * Pista 2:
 * Cada columna de la matriz debe convertirse en una fila en la transpuesta de la matriz.
 * Cada fila de la matriz debe convertirse en una columna en la transpuesta de la matriz.
 *
 * Pista 3:
 * Intente iterar una columna a la vez y con cada columna, cree una fila de valores para agregar a la transposición de
 * la matriz.
 *
 * Time & Space Complexity óptimo:
 * O(W * H) time
 * O(W * H) space
 * donde W es el ancho de la matrix y H es la altura.
 */

fun transposeMatrix(matrix: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val transposeMatrix: MutableList<MutableList<Int>> = mutableListOf()

    for (columnIndex in matrix.first().indices) {
        val row = mutableListOf<Int>()
        for (rowIndex in matrix.indices) {
            val value = matrix[rowIndex][columnIndex]
            row.add(value)
        }
        transposeMatrix.add(row)
    }
    return transposeMatrix
}