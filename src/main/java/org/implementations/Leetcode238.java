package org.implementations;

import java.util.Arrays;

public class Leetcode238 {
	public int[] productExceptSelf(int[] nums) {
		if (nums.length == 1)
			return nums;
		int[] prefixSum = new int[nums.length];
		prefixSum[0] = nums[0];
		for (int i = 1; i <= prefixSum.length - 1; i++) {
			prefixSum[i] = prefixSum[i - 1] * nums[i];
		}
		System.out.println(Arrays.toString(prefixSum));

		int[] suffix = new int[nums.length];
		suffix[nums.length - 1] = nums[nums.length - 1];
		for (int i = nums.length - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] * nums[i];
		}
		System.out.println(Arrays.toString(suffix));

		int[] arrayToReturn = new int[nums.length];
		arrayToReturn[0] = suffix[1];
		arrayToReturn[nums.length - 1] = prefixSum[nums.length - 2];

		for (int i = 1; i < nums.length - 1; i++) {
			arrayToReturn[i] = prefixSum[i - 1] * suffix[i + 1];

		}
		return arrayToReturn;
	}

	public static void main(String[] args) {
		Leetcode238 leetcode238 = new Leetcode238();
		var result = leetcode238.productExceptSelf(new int[] { 1, 2, 3, 4, 5, 6 });
		System.out.println(Arrays.toString(result));
	}
}
