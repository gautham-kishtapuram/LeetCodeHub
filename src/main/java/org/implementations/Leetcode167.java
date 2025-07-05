package org.implementations;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode167 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> storeOccurances = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int remainingAmount = target - numbers[i];
            if (storeOccurances.containsKey(remainingAmount)) {
                return new int[]{storeOccurances.get(remainingAmount), i + 1};
            } else {
                storeOccurances.put(numbers[i], i + 1);
            }

        }

        return null;
    }

    public static void main(String[] args) {
        Leetcode167 leetcode167 = new Leetcode167();
        int[] result = leetcode167.twoSum(new int[]{2, 3, 4, 5, 6, 7}, 9);
        System.out.println(Arrays.toString(result));
    }
}