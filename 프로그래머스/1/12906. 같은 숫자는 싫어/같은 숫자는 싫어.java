import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        int temp = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (temp != arr[i]) {
                result.add(arr[i]);
                temp = arr[i];
            }
        }
        
        int[] answer = new int[result.size()];
        
        for (int j = 0; j < result.size(); j++) {
            answer[j] = result.get(j);
        }

        return answer;
    }
}
