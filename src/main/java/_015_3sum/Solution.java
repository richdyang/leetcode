
package _015_3sum;

import java.util.*;

/**
 * https://leetcode.com/problems/3sum
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        if(nums == null || nums.length < 3) return list;

        Arrays.sort(nums);

        for(int i=0; i < nums.length-2; ++i) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum < 0) ++j;
                    else if (sum > 0) --k;
                    else {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        ++j;
                        --k;
                    }
                }
            }
        }

        return list;
    }
}

