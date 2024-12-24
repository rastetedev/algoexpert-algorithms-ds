package arrays.medium

/**
 * Escribe una función que teniendo dos arrays de enteros no vacíos, encuentre un par de números (uno de cada array)
 * los cuales su diferencia absoluta sea lo más cercano a 0. Debe retornar una lista con los dos números, siendo el
 * número escogido de la primera lista el primero.
 * Se define como la diferencia absoluta de dos enteros la distancia entre ellas en la línea real de números. Por
 * ejemplo: la diferencia absoluta entre -5 y 5 es 10 y entre -5 y -4 es 1.
 * Se puede asumir que habrá solo un par de números con la diferencia absoluta más cercana a 0.
 *
 * Parámetros de ejemplo:
 * firstArray = [-1, 5, 10, 20, 28, 3]
 * secondArray = [26, 134, 135, 15, 17]
 *
 * Resultado de ejemplo:
 * [28, 26]
 *
 * Pista 1:
 * En lugar de generar todos los pares de números posibles, intenta de alguna manera mirar solo los pares que sabes que
 * en realidad podrían tener la diferencia más pequeña. ¿Cómo se puede lograr esto?
 *
 * Pista 2:
 * ¿Ayudaría si se ordenaran las dos matrices? Si las matrices estuvieran ordenadas y estuvieras buscando un par de números
 * determinado, ¿podrías encontrar eficientemente el siguiente par de números para buscar? ¿Cuáles son las implicaciones
 * en tiempo de ejecución de ordenar las matrices?
 *
 * Pista 3:
 * Comience ordenando ambas matrices, según la sugerencia n.° 2. Coloque un puntero al comienzo de ambas matrices y evalúe
 * la diferencia absoluta de los números del puntero. Si la diferencia es igual a cero, entonces has encontrado el par más
 * cercano; de lo contrario, incremente el puntero del menor de los dos números para encontrar un par potencialmente mejor.
 * Continúe hasta obtener un par con una diferencia de cero o hasta que uno de los punteros salga del alcance de su matriz.
 *
 * Time & Space Complexity óptimo:
 * O(nlog(n) + mlog(m)) time => n es el número de elementos en la primera lista y m el de la segunda lista
 * O(1) space
 */

/**
 * Nos valemos de la seguridad que nos da el tener los valores ordenados ascendentemente. De esa forma vamos moviendo
 * los punteros necesarios para acortar la diferencia.
 */

fun smallestDifference(firstArray: MutableList<Int>, secondArray: MutableList<Int>): List<Int> {
    firstArray.sort()
    secondArray.sort()

    var firstListIndex = 0
    var secondListIndex = 0

    var smallestDifference: Int
    var zeroClosestValue = Int.MAX_VALUE
    var pairNumberResult = listOf<Int>()

    while (firstListIndex < firstArray.size && secondListIndex < secondArray.size) {

        val numberFromFirstList = firstArray[firstListIndex]
        val numberFromSecondList = secondArray[secondListIndex]

        if (numberFromFirstList < numberFromSecondList) {
            smallestDifference = numberFromSecondList - numberFromFirstList
            firstListIndex++
        } else if (numberFromFirstList > numberFromSecondList) {
            smallestDifference = numberFromFirstList - numberFromSecondList
            secondListIndex++
        } else {
            return listOf(numberFromFirstList, numberFromSecondList)
        }

        if (zeroClosestValue > smallestDifference) {
            zeroClosestValue = smallestDifference
            pairNumberResult = listOf(numberFromFirstList, numberFromSecondList)
        }
    }

    return pairNumberResult
}