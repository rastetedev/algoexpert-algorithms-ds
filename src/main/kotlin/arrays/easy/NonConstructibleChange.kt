package arrays.easy

/**
 * Dado un array de enteros que representan los valores de monedas, escribe una función que retorne
 * la cantidad minima de cambio (la mínima suma de dinero) que NO PUEDAS generar. Las monedas pueden tener cualquier valor
 * entero positivo y no son necesariamente únicos (puede haber monedas con el mismo valor repetidas).
 * Por ejemplo, si tiene las siguientes monedas = [1,2,5], la cantidad mínima de cambio que NO PUEDES generar es 4.
 * Si no tienes monedas, la cantidad mínima de cambio que NO PUEDES generar es 1.
 *
 * Parámetros de ejemplo:
 * coins = [5, 7, 1, 1, 2, 3, 22]
 *
 * Resultado de ejemplo:
 * 20
 *
 * Pista 1:
 * Un enfoque para resolver este problema es intentar generar cada cantidad de cambio, empezando por 1 y continuando hasta
 * que eventualmente ya no puedas generar más. Aunque este enfoque funciona, hay uno mejor aún.
 *
 * Pista 2:
 * Empieza ordenando el array de entrada (coins). Ya que estás tratando de encontrar la mínima cantidad de cambio que no
 * puedes generar, hace sentido considerar las monedas de más bajo valor primero.
 *
 * Pista 3:
 * Para entender el truco para este problema, considera el siguiente ejemplo: coins = [1, 2, 4]. Con este conjunto de
 * monedas, podemos generar los siguientes cambios: 1, 2, 3, 4, 5, 6, 7. Ahora, si agregamos una moneda de valor "9" a "coins",
 * no seremos capaces de generar un cambio de 8. Sin embargo, si agregamos una moneda de valor "7", si seremos capaces de
 * generar un cambio de 8 y también desde 1 a 15. ¿Por qué ocurre esto?
 *
 * Pista 4:
 * Crea una variable para almacenar el monto de cambio que puedas generar actualmente. Ordena las monedas e itéralas de forma
 * ascendente. En cada iteración, compara la moneda actual con el actual monto de cambio que puedes generar hasta el momento.
 * Aquí hay dos escenarios que pueden pasar:
 *  - El valor de la moneda ES MAYOR que el monto de cambio que puedes generar más uno.
 *  - El valor de la moneda es MENOR O IGUAL QUE el monto de cambio que puedes generar más uno.
 * En el primer escenario, simplemente retorna el monto de cambio que puedes generar más uno, porque no puedes generar ese
 * monto. En el segundo escenario, agrega el valor de la moneda al monto de cambio que puedes generar y puedes continuar
 * iterando. La razón de esto es que, si estás en el segundo escenario, puedes generar todos los valores de cambio que
 * tienes actualmente más el valor de la moneda que estás considerando en ese momento. Si tienes las siguientes monedas
 * [1, 2] entonces puedes hacer "1", "2" y "3" de cambio. Asi que, si agregas una moneda de "4", entonces puedes hacer
 * "4 + 1", "4 + 2" y "4 + 3" de cambio. Entonces, puedes hacer hasta "7" de cambio.
 *
 * Time & Space Complexity óptimo:
 * O(N LOG N) time
 * O(1) space
 * donde N es el número de monedas a tu disposición.
 */

/**
 * Solución 1:
 */
fun nonConstructibleChange(coins: MutableList<Int>): Int {
    coins.sort()

    var posibleChange = 0

    for (coin in coins) {
        if (coin > posibleChange + 1) return posibleChange + 1
        else posibleChange += coin
    }

    return posibleChange + 1
}