import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        //시간 시간 기준으로 오름차순
        Arrays.sort(book_time, Comparator.comparing(arr -> arr[0]));

        for (String[] strings : book_time) {
            System.out.println(strings[0] + " ~ " + strings[1]);
        }

        //방 번호와 방 종료 시간 + 청소시간을 담는 Map 선언
        Map<Integer, Integer> roomAndEndTimeMap = new HashMap<>();

        int roomNo = 0;
        for (int i = 0; i < book_time.length; i++) {
            roomNo++;

            //24 * 시 + 분
            //시작 시간
            int startTimeWithCleaning = convertToMinute(book_time[i][0]);

            //종료 시간 + 청소 시간 10분
            int endTimeWithCleaning = convertToMinute(book_time[i][1]) + 10;

            //처음일 경우
            if (roomAndEndTimeMap.isEmpty()) {
                roomAndEndTimeMap.put(roomNo, endTimeWithCleaning);
                continue;
            }

            //처음이 아닐 경우
            //사용 가능한 방이 있는지 있다면 가장 이전에 비워진 방부터 채운다.
            //시작 시간 >= map 에 있는 값(종료 시간 + 청소 시간)
            int minKey = 0;
            int minValue = 1800;
            for (Integer key : roomAndEndTimeMap.keySet()) {
                if (roomAndEndTimeMap.get(key) <= startTimeWithCleaning) {
                    if (roomAndEndTimeMap.get(key) < minValue) {
                        minValue = roomAndEndTimeMap.get(key);
                        minKey = key;
                    }
                }
            }

            if (minKey == 0 || minValue == 1800) {
                roomAndEndTimeMap.put(roomNo, endTimeWithCleaning);
            } else {
                roomAndEndTimeMap.put(minKey, endTimeWithCleaning);
            }
        }

        return roomAndEndTimeMap.size();
    }
    
    private int convertToMinute(String target) {
        String[] split = target.split(":");
        return Integer.valueOf(split[0]) * 60 + Integer.valueOf(split[1]);
    }
}