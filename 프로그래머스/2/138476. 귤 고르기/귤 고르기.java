import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> tangerineMap = new HashMap<>();

        for (int num : tangerine) {
            tangerineMap.put(num, tangerineMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(tangerineMap.keySet());
        keySet.sort((o1, o2) -> tangerineMap.get(o2).compareTo(tangerineMap.get(o1)));

        for (Integer key : keySet) {
            if (k <= 0) {
                break;
            }
            answer++;
            k -= tangerineMap.get(key);
        }

        return answer;
    }
}