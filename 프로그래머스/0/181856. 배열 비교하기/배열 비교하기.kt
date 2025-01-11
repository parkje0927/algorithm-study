class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        if (arr1.size != arr2.size) {
            return if (arr1.size < arr2.size) -1 else 1
        }
        
        val sumArr1 = arr1.sum()
        val sumArr2 = arr2.sum()
        
        return when {
            sumArr1 < sumArr2 -> -1
            sumArr1 > sumArr2 -> 1
            else -> 0
        }
    }
}