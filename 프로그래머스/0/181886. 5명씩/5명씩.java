class Solution {
    public String[] solution(String[] names) {
        // 그룹 수 계산 (5명씩 묶으니 +4 해서 올림 처리)
        int groupCount = (names.length + 4) / 5;
        String[] answer = new String[groupCount];
        
        int index = 0;
        for (int i = 0; i < names.length; i += 5) { // 5명씩 건너뛰기
            answer[index++] = names[i]; // 각 그룹의 첫 번째 사람 저장
        }
        
        return answer;
    }
}
