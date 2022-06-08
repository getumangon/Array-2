// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode: yes
// Any problem you faced while coding this: Took reference from lecture video

import java.util.*;

class Main {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            // here we multiply visited index by -1 if any index is positive that means that's the missing numbers
            if (Math.abs(nums[i]) <= nums.length && nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("missing numbers in the array is: " + findDisappearedNumbers(nums));
    }
}