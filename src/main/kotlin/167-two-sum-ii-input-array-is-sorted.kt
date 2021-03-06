
@file:JvmName("TwoSumIiInputArrayIsSortedKt")

import org.junit.Test

/**
 * Solution
 * ---
 * Given an array of integers that is already **_sorted in ascending order_**,
 * find two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have _exactly_ one solution and you may
 * not use the _same_ element twice.
 * 
 * **Input:** numbers={2, 7, 11, 15}, target=9  
 * **Output:** index1=1, index2=2 
 * 
 * 
 */
fun twoSumIiInputArrayIsSorted(numbers: IntArray, target: Int): IntArray {
    var i = 0
    var j = numbers.size
    while (i < j) {
        val sum = numbers[i] + numbers[j]
        if (sum == target) {
            return intArrayOf(i + 1, j + 1)
        } else if (sum < target) {
            ++i
        } else {
            --j
        }
    }
    throw IllegalArgumentException("Not possible here")
}

/**
 * Tests
 */
class TwoSumIiInputArrayIsSortedTest {
    @Test fun test1() {

    }

    @Test fun test2() {

    }
}

