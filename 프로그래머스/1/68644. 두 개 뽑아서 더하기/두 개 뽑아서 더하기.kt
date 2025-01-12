class Solution {
    fun solution(numbers: IntArray): IntArray {
        val result: MutableSet<Int> = hashSetOf()

        for (i in 0 until numbers.size - 1) {
            for (j in i + 1 until numbers.size) {
                result.add(numbers[i] + numbers[j])
            }
        }

        return result.sorted().toIntArray()
    }
}