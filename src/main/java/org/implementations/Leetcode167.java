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

    public int[] twoSumOptimal(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        while (leftPointer < rightPointer) {
            int sum = numbers[leftPointer] + numbers[rightPointer];
            if (sum == target) {
                return new int[]{++leftPointer, ++rightPointer};
            } else if (sum > target) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Leetcode167 leetcode167 = new Leetcode167();
        int[] result = leetcode167.twoSum(new int[]{2, 3, 4, 5, 6, 7}, 9);

        int[] resultOpt = leetcode167.twoSumOptimal(new int[]{2, 3, 4, 5, 6, 7}, 9);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(resultOpt));
    }
}