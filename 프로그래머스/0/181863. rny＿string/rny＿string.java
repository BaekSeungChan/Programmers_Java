import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String rny_string) {
        List<String> answer = new ArrayList<>();
        String[] result = rny_string.split("");
        
        for(int i = 0; i < result.length; i++) {
            if(result[i].equals("m")) {
                answer.add("rn");
            } else {
                answer.add(result[i]);
            }
        }
        
        return String.join("", answer);
    }
}