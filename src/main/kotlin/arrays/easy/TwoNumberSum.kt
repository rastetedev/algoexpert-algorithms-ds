package arrays.easy

/**
 * Escribe una función que recibe como parámetros de entrada un array no vacío de números enteros distintos y un entero
 * que representa una suma deseada. Si dos números cualquiera del array dan como suma el
 * segundo parámetro, la función debe retornarlos dentro de un array, sin importar el orden.
 * Si no se encuentran dos números dentro del array que logren la suma deseada, entonces se debe retornar un array vacío.
 * Ten en cuenta que la suma deseada debe ser obtenida por dos números distintos del array. No puede sumarse un solo
 * número consigo mismo para obtener la suma deseada.
 * Se puede asumir que solo puede haber máximo un par de números que cumplan con la suma deseada.
 *
 * Parámetros de ejemplo:
 * array: [3, 5, -4, 8, 11, 1, -1, 6]
 * targetSum: 10
 *
 * Resultado de ejemplo:
 * [-1, 11]
 *
 * Pista 1:
 * Intenta usar dos "for loops" para sumar todos los posibles pares en el array. ¿Cuáles son los time y space complexity
 * de esta solución?
 *
 * Pista 2:
 * Nota que para número X dentro del array, estás tratando de encontrar un número Y de tal manera que X + Y = targetSum.
 * Con dos variables conocidas de esta ecuación (X y targetSum) no debe ser muy difícil hallar el Y.
 *
 * Pista 3:
 * Intenta guardar cada número en un Hash Table, resolviendo la ecuación mencionada en la Pista 2 para cada número y
 * verificando si la Y deseada se encuentra ya almacenada en el Hash Table. ¿Cuáles son los time y space complexity
 * de esta solución?
 *
 * Time & Space Complexity óptimo:
 * O(N) time
 * O(N) space
 * donde N es el tamaño del array.
 */

/**
 * Solución 1:
 * O(n^2) time
 * O(1) space
 */

fun twoNumberSumFirstSol(array: List<Int>, targetSum: Int): List<Int> {
    for (i in 0 until array.size - 1) {
        for (j in i + 1 until array.size) {
            val firstNumber = array[i]
            val secondNumber = array[j]
            if (firstNumber + secondNumber == targetSum) return listOf(firstNumber, secondNumber)
        }
    }
    return emptyList()
}

/**
 * Solución 2:
 * O(n) time
 * O(n) space
 *
 * Al saber que son números distintos podemos usar un HashTable con cada número del array como clave.
 * La ventaja es que podemos acceder a cada número del HashTable en tiempo constante.
 */

fun twoNumberSumSecondSol(array: List<Int>, targetSum: Int): List<Int> {
    val temporalStorage = hashMapOf<Int, Boolean>()

    for (number in array) {
        val secondNumber = targetSum - number
        if (temporalStorage.contains(secondNumber)) return listOf(number, secondNumber)
        else temporalStorage[number] = true
    }
    return emptyList()
}

/**
 * Solución 3:
 * O(nlog(n)) time
 * O(1) space
 *
 * Es más óptimo que el primero en cuestión de tiempo por el mergeSort que se usa (QuickSort, HeapSort) y más óptimo que
 * el segundo en cuestión de espacio.
 * Se necesita ordenar para saber en qué dirección mover los punteros. Si necesitamos una suma mayor movemos el índice
 * izquierdo, si necesitamos una suma menor movemos el índice derecho.
 */

fun twoNumberSumThirdSol(array: List<Int>, targetSum: Int): List<Int> {
    array.toMutableList().sort()

    var leftIndex = 0
    var rightIndex = array.lastIndex

    while (leftIndex < rightIndex) {
        val currentSum = array[leftIndex] + array[rightIndex]
        if (currentSum == targetSum) return listOf(array[leftIndex], array[rightIndex])
        else if (currentSum < targetSum) ++leftIndex
        else --rightIndex
    }
    return emptyList()
}