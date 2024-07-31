import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int pick = nums.length / 2;
        Set<Integer> hashSet = new HashSet();
        for (int num : nums) {
            hashSet.add(num);
        }
        return Math.min(hashSet.size(), pick);
    }
}
