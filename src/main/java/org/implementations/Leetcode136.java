package org.implementations;

public class Leetcode136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 2, 4, 2, 4}));
    }


    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
