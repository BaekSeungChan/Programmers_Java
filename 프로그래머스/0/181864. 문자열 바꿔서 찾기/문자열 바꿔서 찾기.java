import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        List<String> reverseAlphabet = new ArrayList<>();
        String[] splitAlphabet = myString.split("");
        
        for (int i = 0; i < splitAlphabet.length; i++) {
            if (splitAlphabet[i].equals("A")) {
                reverseAlphabet.add("B");
            } else {
                reverseAlphabet.add("A");
            }
        }
        
        String alphabetJoin = String.join("", reverseAlphabet);
        
        if (alphabetJoin.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}
