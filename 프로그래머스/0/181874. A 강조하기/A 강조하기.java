class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++){
            char currentChar = myString.charAt(i);
            if(myString.charAt(i) == 'a'){
                answer += Character.toUpperCase(currentChar);
            }else if (myString.charAt(i) == 'A'){
                answer += myString.charAt(i);
            }else {
                answer += Character.toLowerCase(currentChar);
            }
        }
        return answer;
    }
}