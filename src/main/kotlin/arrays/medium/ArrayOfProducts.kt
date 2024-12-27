package arrays.medium

/**
 * Escribe una función que toma un array de enteros no nulos y retorne un array de la misma longitud, donde cada
 * elemento del nuevo array sea igual al producto de los elementos del array original sin incluir al elemento en el
 * índice actual.
 * En otras palabras, el valor de output[i] es igual al producto de cada número del array original excepto input[i].
 * Se espera que se resuelva este problema sin ninguna clase de división.
 *
 * Parámetros de ejemplo:
 * input = [5, 1, 4, 2]
 *
 * Resultado de ejemplo:
 * [8, 40, 10, 20]
 *
 * 8 es igual a 1 * 4 * 2
 * 40 es igual a 5 * 4 * 2
 * 10 es igual a 5 * 1 * 2
 * 20 es igual a 5 * 1 * 4
 *
 * Pista 1:
 * Piensa en la solución mas simple para resolver este problema. ¿Cómo podemos hacer exactamente lo que nos piden sin
 * enfocarnos en el time o space complexity?
 *
 * Pista 2:
 * Entiende como es calculado output[i]. ¿Cómo podemos calcular el producto de todos los elementos sin considerar el
 * índice actual? ¿Podemos hacerlo con solo un recorrido a través del input array o tenemos que hacer multiples iteraciones?
 *
 * Pista 3:
 * Para cada índice en el input array, trata de calcular el producto de cada elemento a su izquierda y el producto de cada
 * elemento a su derecha. Puedes hacer esto con dos iteraciones a través del array. ¿Cómo estos productos pueden ayudarnos?
 *
 * Time & Space Complexity óptimo:
 * O(n) time
 * O(n) space
 * donde N es el tamaño del array.
 */

/**
 * Solución 1:
 * O(n^2) time
 * O(n) space
 */

fun arrayOfProductsFirstSol(numbers: List<Int>): List<Int> {

    val products = numbers.map { 1 }.toMutableList()

    for (firstIteratorIndex in numbers.indices) {
        var product = 1
        for (secondIteratorIndex in numbers.indices) {
            if (firstIteratorIndex != secondIteratorIndex)
                product *= numbers[secondIteratorIndex]
        }
        products[firstIteratorIndex] = product
    }
    return products
}

/**
 * Solución 2:
 * O(n) time
 * O(n) space
 */

fun arrayOfProductsSecondSol(numbers: List<Int>): List<Int> {

    val finalProducts = numbers.map { 1 }.toMutableList()
    val leftProducts = numbers.map { 1 }.toMutableList()
    val rightProducts = numbers.map { 1 }.toMutableList()

    var leftProduct = 1
    for (index in numbers.indices) {
        leftProducts[index] = leftProduct
        leftProduct *= numbers[index]
    }

    var rightProduct = 1
    for (index in numbers.lastIndex downTo 0) {
        rightProducts[index] = rightProduct
        rightProduct *= numbers[index]
    }

    for (index in numbers.indices) {
        finalProducts[index] = leftProducts[index] * rightProducts[index]
    }

    return finalProducts
}

/**
 * Solución 3:
 * O(n) time
 * O(n) space
 */

fun arrayOfProductsThirdSol(numbers: List<Int>): List<Int> {

    val finalProducts = numbers.map { 1 }.toMutableList()

    var leftProduct = 1
    for (index in numbers.indices) {
        finalProducts[index] = leftProduct
        leftProduct *= numbers[index]
    }

    var rightProduct = 1
    for (index in numbers.lastIndex downTo 0) {
        finalProducts[index] *= rightProduct
        rightProduct *= numbers[index]
    }

    return finalProducts
}