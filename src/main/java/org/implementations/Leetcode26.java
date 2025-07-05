package org.implementations;

import java.util.Arrays;

// Ref : https://leetcode.com/problems/remove-duplicates-from-sorted-array/


public class Leetcode26 {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{-1, -1, -1, 0, 0, 1, 1, 1}));
    }

}
