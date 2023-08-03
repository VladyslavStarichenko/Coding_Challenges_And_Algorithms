package leetcode;

import java.util.Arrays;


public class LongestConsecutiveSequence {

//    public int longestConsecutive(int[] nums) {
//        int max = 0;
//        Set<Integer> set = new HashSet<>();
//        for(int val : nums) set.add(val);
//        for(int i : nums){
//            if(set.contains(i-1)) continue;
//            int total = 0;
//            while(set.remove(i++)){
//                total++;
//            }
//            if(total > max) max = total;
//        }
//        return max;
//    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int maxCount = 1, checkMaxCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                checkMaxCount++;
            } else if (nums[i] != nums[i - 1]) {
                checkMaxCount = 1;
            }

            if (checkMaxCount > maxCount) {
                maxCount = checkMaxCount;
            }

        }
        return maxCount;
    }
}
