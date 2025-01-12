class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        
        //먼저 사전순 정렬
        strings.sort()

        //인덱스 n 번째 글자를 기준으로 오름차순 정렬
        answer = strings.sortedBy { it[n] }.toTypedArray()
        
        return answer
    }
}