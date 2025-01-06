package org.implementations;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode1 {
	public static void main(String[] args) {
		int[] numbers = new int[] { 5,7,1,3,8};
		System.out.println(Arrays.toString(twoSum(numbers, 8)));
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if (integerIntegerHashMap.containsKey(difference)) {
				return new int[] { integerIntegerHashMap.get(difference), i };

			} else {
				integerIntegerHashMap.put(nums[i], i);
			}

		}
		return new int[0];
	}

}
