class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer = mutableListOf<Int>()

        for (i in l..r) {
            val numberStr = i.toString()
            if (numberStr.all { it == '0' || it == '5' }) {
                answer.add(i)
            }
        }
        
        return if (answer.isEmpty()) intArrayOf(-1) else answer.toIntArray()
    }
}