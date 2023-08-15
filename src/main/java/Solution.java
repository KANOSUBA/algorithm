import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> HashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int x = nums[i];
            int y =target - x;
            if (HashMap.containsKey(y)){
                return new int[] {HashMap.get(y),i};
            }
            HashMap.put(nums[i],i);
        }
        return null;
    }
}
