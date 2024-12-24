package arrays.medium

/**
 * Escribe una función que recibe como parámetros de entrada un array no vacío de números enteros distintos y un entero
 * La función debe buscar todos los triples en el array que sumen el entero deseado y debe retornar un array de dos dimensiones
 * con todos estos triples. Los números en cada combinación triple deben estar ordenados de forma ascendente.
 * Así mismo, las combinaciones también deben presentarse en forma ordenada ascendentemente entre ellos según los números
 * que contienen.
 * Si no hay ninguna combinación triple entonces devolver un array vacío.
 *
 * Parámetros de ejemplo:
 * array = [12, 3, 1, 2, -6, 5, -8, 6]
 * targetSum = 0
 *
 * Resultado de ejemplo:
 * [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
 *
 * Pista 1:
 * Usar tres "for loops" para calcular la suma de todos los posibles triples en el array generaría un algoritmo
 * que corre en (n^3) tiempo, donde "n" es el tamaño del array. ¿Podrías pensar en una solución más eficiente basada solo
 * en dos "for loops"?
 *
 * Pista 2:
 * Intenta ordenar el array y recorrerlo una vez. En cada número, coloca un puntero izquierdo a la derecha del número
 * actual y un puntero derecho al final del array. Verifica si el número actual, el número en el puntero izquierdo y el
 * número en el puntero derecho suman la cantidad deseada. ¿Cómo podrías continuar? Teniendo en cuenta que el array ya ha
 * sido ordenado.
 *
 * Pista 3:
 * Ya que el array ya está sorteado (Pista 2), sabes que al mover el puntero izquierdo (Pista 2) un índice a la derecha,
 * encontraremos un número izquierdo mayor y por consecuencia una suma mayor. De manera similar, sabes que al mover el
 * puntero derecho un índice a la izquierda encontraremos un número derecho menor y por consecuencia una suma menor.
 * Eso significa que dependiendo del resultado de la suma de los tres números (número actual, número en el puntero derecho
 * y número en el puntero izquierdo) deberás mover el puntero izquierdo o el puntero derecho o ambos para tratar de obtener
 * la suma deseada.
 *
 * Time & Space Complexity óptimo:
 * O(n^2) time
 * O(n) space
 * donde N es el número de monedas a tu disposición.
 */

fun threeNumberSum(numbers: MutableList<Int>, targetSum: Int): List<List<Int>> {
    numbers.sort()
    val tripletList = mutableListOf<List<Int>>()

    for (i in 0 until numbers.lastIndex - 1) {
        var leftIndex = i + 1
        var rightIndex = numbers.lastIndex

        while (leftIndex < rightIndex) {
            val sum = numbers[i] + numbers[leftIndex] + numbers[rightIndex]
            if (sum == targetSum) {
                tripletList.add(
                    listOf(
                        numbers[i],
                        numbers[leftIndex],
                        numbers[rightIndex]
                    )
                )
                leftIndex++
                rightIndex--
            } else if (sum < targetSum) {
                leftIndex++
            } else {
                rightIndex--
            }
        }
    }
    return tripletList
}