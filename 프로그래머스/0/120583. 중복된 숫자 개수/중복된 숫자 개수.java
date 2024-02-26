import java.util.Arrays;

class Solution {
    public long solution(int[] array, int n) {
        return Arrays.stream(array).filter(i -> i == n).count();
    }
}