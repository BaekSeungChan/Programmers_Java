import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        if(map.keySet().size() > count){
            return count;
        } else {
            return map.keySet().size();
        }
    }
}


