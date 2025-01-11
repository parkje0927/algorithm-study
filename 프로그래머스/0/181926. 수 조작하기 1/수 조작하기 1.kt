class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = 0
        answer = n
        
        for (char in control) {
            answer += getControlNumber(char)
        }
        
        return answer
    }
    
    // w : n += 1
    // s : n -= 1
    // d : n += 10
    // a : n -= 10
    private fun getControlNumber(char: Char): Int {
        if (char == 'w') {
            return 1
        }
        if (char == 's') {
            return -1
        }
        if (char == 'd') {
            return 10
        }
        return -10
    }
}