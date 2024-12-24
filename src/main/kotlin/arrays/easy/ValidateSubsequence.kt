package arrays.easy

/**
 * Teniendo dos arrays no vacíos de enteros, escribe una función que determine si el segundo array es una sub-array
 * de la primera.
 * Un sub-array es una serie de números que no están necesariamente adyacentes en el array principal, pero si en
 * el mismo orden como aparecen en el array principal.
 * Por ejemplo, los arrays: [1,3,4] y [2,4] son sub-arrays del array [1,2,3,4]
 * Nota que un simple número del array y el array mismo son sub arrays válidas del array.
 *
 * Parámetros de ejemplo:
 * array: [5, 1, 22, 25, 6, -1, 8, 10]
 * sub-array: [1,6,-1,10]
 *
 * Resultado de ejemplo:
 * true
 *
 * Pista 1:
 * Puedes resolver este problema iterando solo una vez a través del array principal.
 *
 * Pista 2:
 * Itera a través del array principal y busca el primer entero dentro del sub-array potencial. Si el entero se encuentra
 * ahi, sigue iterando a través del array principal, pero ahora busca el segundo número del sub-array
 * potencial. Continúa este proceso hasta que encuentres cada entero en el proceso o se termine de iterar el array principal.
 *
 * Pista 3:
 * Para poder implementar lo que menciona la Pista 2, debes declarar una variable que almacene la posición del sub-array
 * potencial. Al principio la posición será el índice con valor 0, mientras vas encontrando los números del sub-array en
 * el array principal irás incrementando este valor hasta que llegues al final del sub-array.
 *
 * Time & Space Complexity óptimo:
 * O(N) time
 * O(1) space
 * donde N es el tamaño del array.
 */

/**
 * Solución 1:
 *
 * Solución con base en las Pistas
 */

fun validateSubsequenceFirstSol(array: List<Int>, subSequence: List<Int>): Boolean {
    var subSequenceIndex = 0

    for (number in array) {
        if (subSequenceIndex == subSequence.size) break
        if (number == subSequence[subSequenceIndex]) subSequenceIndex++
    }
    return subSequenceIndex == subSequence.size
}

/**
 * Solución 2:
 */

fun validateSubsequenceSecondSol(array: List<Int>, subSequence: List<Int>): Boolean {
    var arrayIndex = 0
    var subSequenceIndex = 0

    while (arrayIndex < array.size && subSequenceIndex < subSequence.size) {
        if (subSequence[subSequenceIndex] == array[arrayIndex]) subSequenceIndex++
        arrayIndex++
    }

    return subSequenceIndex == subSequence.size
}