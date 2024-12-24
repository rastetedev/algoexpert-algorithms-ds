package arrays.medium


/**
 * Escribe una función que tome un array de enteros y devuelva un valor booleano que represente si la matriz es monótona.
 * Se dice que una matriz es monótona si sus elementos, de izquierda a derecha, son enteramente no-crecientes o son
 * enteramente no-decrecientes.
 * Los elementos no-crecientes no necesariamente disminuyen; simplemente no aumentan. Del mismo modo, los elementos
 * no-decrecientes no necesariamente aumentan; simplemente no disminuyen.
 * Tenga en cuenta que los arrays vacíos y los arrays de un elemento son monótonas.
 *
 * Parámetros de ejemplo:
 * array = [-1, -5, -10, -1100, -1100, -1101, -1102, -9001]
 *
 * Resultado de ejemplo:
 * true
 *
 * Pista 1:
 * Puedes resolver este problema iterando el array de izquierda a derecha una sola vez.
 *
 * Pista 2:
 * Intenta iterando el array de izquierda a derecha, en búsqueda de dos enteros adyacentes que puedan indicar el sentido
 * (si el array es creciente o decreciente). Una vez que se encuentre el sentido "tentativo", se debe comparar a todos
 * los elementos posteriores con su anterior para poder ver si rompe con la "tendencia". Si es así entonces no es monótono.
 *
 * Pista 3:
 * De manera alternativa, puedes asumir que el array es tanto enteramente no-creciente como enteramente no-decreciente.
 * Mientras vas iterando cada elemento, realiza una verificación para ver si puedes invalidar una o ambas suposiciones.
 *
 * Time & Space Complexity óptimo:
 * O(n) time
 * O(1) space
 * donde N es el tamaño del array.
 */

/**
 * Solución 1:
 *
 * ¿Es estrictamente creciente o decreciente?
 */

fun monotonicArrayFirstSol(numbers: List<Int>): Boolean {
    if (numbers.size <= 2) return true

    var direction = numbers[1] - numbers[0]
    for (i in 2 until numbers.size) {
        if (direction == 0) {
            direction = numbers[i] - numbers[i - 1]
            continue
        }
        if (isDirectionBroken(direction, currentNumber = numbers[i], previousNumber = numbers[i - 1])
        ) { return false }
    }
    return true
}

private fun isDirectionBroken(direction: Int, currentNumber: Int, previousNumber: Int): Boolean {
    val diferencia = currentNumber - previousNumber
    return if (direction > 0) {
        diferencia < 0
    } else {
        diferencia > 0
    }
}

/**
 * Solución 2:
 *
 * Asumimos ambas condiciones.
 */
fun monotonicArraySecondSol(numbers: List<Int>): Boolean {
    var isIncreasing = false
    var isDecreasing = false

    for (i in 1 until numbers.size) {
        if (numbers[i] < numbers[i - 1]) isDecreasing = true
        if (numbers[i] > numbers[i - 1]) isIncreasing = true
    }

    return !(isIncreasing && isDecreasing)
}