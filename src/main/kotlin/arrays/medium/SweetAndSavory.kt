package arrays.medium

/**
 * You're hosting an event at a food festival and want to showcase the best possible pairing of two dishes from the festival
 * that complement each other's flavor profile.
 * Each dish has a flavor profile represented by an integer. A negative integer means a dish is sweet, while a positive
 * integer means a dish is savory. The absolute value of that integer represents the intensity of that flavor.
 * For example, a flavor profile of -3 is slightly sweet, one of -10 is extremely sweet, one of 2 is mildly savory,
 * and one of 8 is significantly savory.
 * You're given an array of these dishes and a target combined flavor profile. Write a function that returns the best
 * possible pairing of two dishes (the pairing with a total flavor profile that's closest to the target one). Note that
 * this pairing must include one sweet and one savory dish. You're also concerned about the dish being too savory,
 * so your pairing should never be more savory than the target flavor profile.
 * All dishes will have a positive or negative flavor profile; there are no dishes with a 0 value. For simplicity,
 * you can assume that there will be at most one best solution. If there isn't a valid solution, your function
 * should return [0, 0]. The returned array should be sorted, meaning the sweet dish should always come first.
 *
 * Sample Input #1
 * dishes = [-3, -5, 1, 7] target = 8
 *
 * Sample Output #1
 * [-3, 7] // The combined profile of 4 is closest without going over
 *
 * Sample Input #2
 * dishes = [3, 5, 7, 2, 6, 8, 1]
 * target = 10
 *
 * Sample Output #2
 * [0, 0] // There are no sweet dishes
 *
 * Sample Input #3
 * dishes = [2,5, -4, -7, 12, 100, -25] target = -20
 * target = -20
 *
 * Sample Output #3
 * [-25, 5] // This pairing gets the exact combined profile of -20
 *
 * Hint 1
 * The sweet and savory dishes are essentially two different lists that have been combined into one.
 * It can be helpful to first separate them.
 *
 * Hint 2
 * Looking at all possible pairs will be inefficient. Would sorting the lists first help improve the time complexity?
 *
 * Hint 3
 * Try using a two-pointer approach to find the best pairing. Start with a current pairing, and move the savory pointer
 * until the pairing gets too savory. If the dish is too savory, then move the sweet pointer.
 * Do this through the entire lists, keeping track of the best pairing you find.
 *
 * Optimal Space & Time Complexity
 * O(nlog(n)) time
 * O(n) space
 * where n is number of dishes
 */

fun sweetAndSavory(dishes: List<Int>, savorTarget: Int): List<Int> {

    val sweetDishes = dishes.filter { it < 0 }.toMutableList()
    val savoryDishes = dishes.filter { it > 0 }.toMutableList()

    sweetDishes.sortDescending()
    savoryDishes.sort()

    var bestPair = listOf(0, 0)
    var bestDifference = Int.MAX_VALUE

    var sweetDishIndex = 0
    var savoryDishIndex = 0

    while (sweetDishIndex < sweetDishes.size && savoryDishIndex < savoryDishes.size) {

        val currentSum = sweetDishes[sweetDishIndex] + savoryDishes[savoryDishIndex]

        if (currentSum <= savorTarget) {
            val currentDifference = savorTarget - currentSum
            if (currentDifference < bestDifference) {
                bestDifference = currentDifference
                bestPair = listOf(
                    sweetDishes[sweetDishIndex],
                    savoryDishes[savoryDishIndex]
                )
            }
            savoryDishIndex++
        } else {
            sweetDishIndex++
        }
    }

    return bestPair
}