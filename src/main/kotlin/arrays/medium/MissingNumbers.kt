package arrays.medium

/**
 * You're given an unordered list of unique integers nums in the range [1, n], where n represents the length of nums + 2.
 * This means that two numbers in this range are missing from the list.
 * Write a function that takes in this list and returns a new list with the two missing numbers, sorted numerically.
 *
 * Sample Input
 * nums = [1, 4, 3]
 *
 * Sample Output
 * [2, 5] // n is 5, meaning the completed list should be [1, 2, 3, 4, 5]
 *
 * Hint 1
 * How would you solve this problem if there was only one missing number? Can that solution be applied to this problem
 * with two missing numbers?
 *
 * Hint 2
 * To efficiently find a single missing number, you can sum up all the values in the array as well as sum up all the
 * values in the expected array (i.e. in the range [1, n]). The difference between these values is the missing number.
 *
 * Hint 3
 * Using the same logic as for a single missing number, you can find the total of the two missing numbers.
 * How can you then find which numbers these are?
 *
 * Hint 4
 * If you take an average of the two missing numbers, one of the missing numbers must be less than that average,
 * and one must be greater than the average.
 *
 * Hint 5
 * Since we know there is one missing number on each side of the average, we can treat each side of the list as its own
 * problem to find one missing number in that list.
 */

/**
 * Optimal Space & Time Complexity
 * O(n) time
 * O(n) space
 * where n is the length of the input array
 */
fun missingNumbersFirstSol(numbers: List<Int>): List<Int> {

    val numbersInSeat = numbers.toSet()
    val solution = mutableListOf<Int>()

    (1..(numbers.size + 2)).forEach { number ->
        if (numbersInSeat.contains(number).not()) {
            solution.add(number)
        }
    }

    return solution
}

/**
 * Optimal Space & Time Complexity
 * O(n) time
 * O(1) space
 * where n is the length of the input array
 */
fun missingNumbersSecondSol(numbers: List<Int>): List<Int> {

    fun createArray(from: Int, to: Int): List<Int> {
        val array = mutableListOf<Int>()
        for (num in from..to) {
            array.add(num)
        }
        return array
    }

    val totalSum = createArray(from = 1, to = numbers.size + 2).sum()
    val missingSum = totalSum - numbers.sum()

    val averageMissingSum = missingSum.div(2)
    var leftToAverageCurrentSum = 0
    var rightToAverageCurrentSum = 0

    for (num in numbers) {
        if (num <= averageMissingSum) {
            leftToAverageCurrentSum += num
        } else {
            rightToAverageCurrentSum += num
        }
    }

    val desiredLeftSum = createArray(from = 1, to = averageMissingSum).sum()

    val desiredRightSum = createArray(from = averageMissingSum + 1, to = numbers.size + 2).sum()

    return listOf(
        desiredLeftSum.minus(leftToAverageCurrentSum),
        desiredRightSum.minus(rightToAverageCurrentSum)
    )
}