package arrays.medium

/**
 * Escribe una función que toma un array de enteros y retorne la longitud (primer valor del pico hasta el último valor
 * del pico) del pico más largo (ancho).
 * Un "pico" es definido como enteros adyacentes del array que son estrictamente crecientes hasta que se llegue a un tope
 * (el mayor valor en el pico), y luego proceda a ser estrictamente decreciente.
 * Se necesita al menos 3 enteros son requeridos para forma un pico.
 *
 * Por ejemplo, los enteros 1, 4, 10, 2 forman un pico, pero los enteros 4,0,10 no y tampoco los enteros 1,2,2,0.
 * De manera similar, los enteros 1,2,3 no forman un pico porque no hay ningún valor decreciente después del 3.
 *
 * Parámetros de ejemplo:
 * numbers = [1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]
 *
 * Resultado de ejemplo:
 * 6 // 0, 10, 6, 5, -1, -3
 *
 * Pista 1:
 * Puedes resolver este problema iterando de izquierda a derecha una sola vez.
 *
 * Pista 2:
 * Itera a través del array de izquierda a derecha, y trata a cada entero como una potencial punta del pico. Para que
 * sea la punta del pico, un entero debe ser estrictamente mayor que sus valores adyacentes. ¿Qué puedes hacer cuando
 * encuentres alguna punta?
 *
 * Pista 3:
 * Mientras iteras el array de izquierda a derecha, cada vez que encuentres una punta de pico, expande hacia afuera
 * desde la punta hasta que ya no tengas un pico.
 * Dado el aspecto de los picos y cuántos picos pueden caber en un array, dese cuenta que este proceso resulta en un
 * algoritmo de tiempo lineal. Asegúrate de dar seguimiento al pico más alto que encuentres mientras vas iterando.
 *
 * Time & Space Complexity óptimo:
 * O(n) time
 * O(1) space
 * donde N es el tamaño del array.
 */

fun longestPeak(numbers: List<Int>): Int {

    var longestPeak = 0

    for (index in 1 until (numbers.size - 1)) {
        if (isPeak(index, numbers)) {
            val leftSize = getLeftSize(index, numbers)
            val rightSize = getRightSize(index, numbers)
            val totalSize = leftSize + rightSize + 1 //Más uno por el pico

            if (totalSize > longestPeak) {
                longestPeak = totalSize
            }
        }
    }

    return longestPeak
}

fun getLeftSize(index: Int, numbers: List<Int>): Int {
    var isDecreasing = true
    var leftSize = 0
    var leftIndex = index
    while (isDecreasing && leftIndex > 0) {
        if (numbers[leftIndex - 1] < numbers[leftIndex]) {
            leftSize++
            leftIndex--
        } else {
            isDecreasing = false
        }
    }
    return leftSize
}

fun getRightSize(index: Int, numbers: List<Int>): Int {
    var isDecreasing = true
    var rightSize = 0
    var rightIndex = index
    while (isDecreasing && rightIndex < numbers.size - 1) {
        if (numbers[rightIndex] > numbers[rightIndex + 1]) {
            rightSize++
            rightIndex++
        } else {
            isDecreasing = false
        }
    }
    return rightSize
}

fun isPeak(index: Int, numbers: List<Int>): Boolean {
    val currentNumber = numbers[index]
    val leftNumber = numbers[index - 1]
    val rightNumber = numbers[index + 1]
    return currentNumber > leftNumber && currentNumber > rightNumber
}