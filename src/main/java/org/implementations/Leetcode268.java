package org.implementations;
// https://leetcode.com/problems/missing-number/submissions/1688542532/
public class Leetcode268 {
    public static void main(String[] args) {
        System.out.println(Leetcode268.missingNumber(new int[]{0,2}));
    }

    public static int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 1; i <= nums.length; i++) {
            result ^= i;

        }
        for (int num : nums) {
            result ^= num;

        }
        return result;
    }
}
