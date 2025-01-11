class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        answer = arr
        
        queries.forEachIndexed { _, row ->
            val data = answer[row[0]]
            answer[row[0]] = answer[row[1]]
            answer[row[1]] = data
        }
        
        return answer
    }
}