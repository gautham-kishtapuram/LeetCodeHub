package org.implementations;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode1 {
	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 3, 3, 4, 4 };
		System.out.println(Arrays.toString(twoSum(numbers, 7)));
	}

	public static int[] twoSum(int[] nums, int target) {
		if (nums.length == 2)
			return nums;
		int firstPointer = 0;
		int secondPointer = nums.length - 1;

		while (firstPointer < secondPointer) {
			if (nums[firstPointer] + nums[secondPointer] == target) {
				return new int[] { firstPointer, secondPointer };
			}
			firstPointer++;
			secondPointer--;

		}
		return null;
	}

}
