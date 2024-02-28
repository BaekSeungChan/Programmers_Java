import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> tempList = new ArrayList<>();
        
        int temp = -1;
        
        for(int num : arr){
            if(temp != num){
                tempList.add(num);
            }
            temp = num;
        }
        
        
        int[] answer = new int[tempList.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}