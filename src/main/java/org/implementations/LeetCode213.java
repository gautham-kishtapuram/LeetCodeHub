package org.implementations;

import java.util.Arrays;

public class LeetCode213 {
	public static void main(String[] args) {
		LeetCode213 leetcode303 = new LeetCode213();
		boolean result = leetcode303.containsDuplicate(new int[] { 4, 2, 1, 3 });
		System.out.println(result);

	}
	//      Approch 1
	//	public boolean containsDuplicate(int[] nums) {
	//		HashSet<Integer> integers = new HashSet<>();
	//		for (int i = 0; i < nums.length; i++) {
	//			integers.add(nums[i]);
	//		}
	//		return nums.length != integers.size();
	//
	//	}

	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);

		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] == nums[i - 1])
				return true;

		}
		return false;
	}

}
