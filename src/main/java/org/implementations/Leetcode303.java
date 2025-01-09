package org.implementations;

// https://leetcode.com/problems/range-sum-query-immutable/submissions/1502137122/
public class Leetcode303 {

	int[] nums;

	public Leetcode303(int[] nums) {
		this.nums = nums;

	}

	public int sumRange(int left, int right) {
		int i = 0;
		for (int j = left; j <= right; j++) {
			i += nums[j];

		}
		return i;

	}

	public static void main(String[] args) {
		Leetcode303 leetcode303 = new Leetcode303(new int[] { -2, 0, 3, -5, 2, -1 });
		System.out.println(leetcode303.sumRange(2, 5));
	}
}



