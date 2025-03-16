package arrays.medium

/**
 * You're given a list of integers nums. Write a function that returns a boolean representing whether there exists a
 * zero-sum subarray of nums
 * A zero-sum subarray is any subarray where all the values add up to zero. A subarray is any contiguous section of the array.
 * For the purposes of this problem, a subarray can be as small as one element and as long as the original array.
 *
 * Sample Input
 * nums = [-5, -5, 2, 3, -2]
 *
 * Sample Output
 * True // The subarray [-5, 2, 3] has a sum of 0
 *
 * Hint 1
 * A good way to approach this problem is to first think of a simpler version. How would you check if the entire array sum is zero?
 *
 * Hint 2
 * If the entire array does not sum to zero, then you need to check if there are any smaller subarrays that sum to zero.
 * For this, it can be helpful to keep track of all the sums from [0, i], where i is every index in the array.
 *
 * Hint 3
 * After recording all sums from [0, 1], what would it mean if a sum is repeated?
 *
 * Time & Space Complexity óptimo:
 * O(N) time
 * O(N) space
 * donde N es el tamaño del array.
 */

fun zeroSumSubarray(numbers: List<Int>): Boolean {

    val subArraysSumSet = mutableSetOf(0)
    var currentSum = 0

    for (number in numbers) {

        currentSum += number
        if (subArraysSumSet.contains(currentSum)) return true

        subArraysSumSet.add(currentSum)
    }

    return false
}