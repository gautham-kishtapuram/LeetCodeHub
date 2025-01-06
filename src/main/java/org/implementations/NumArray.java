package org.implementations;

class NumArray {

	int[] nums;

	public NumArray(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		this.nums = nums;
	}

	public int sumRange(int left, int right) {
		if (left == 0)
			return nums[right];
		return nums[right] - nums[left - 1];
	}

	public static void main(String[] args) {
		NumArray leetcode303 = new NumArray(new int[] { 1, 2, 3, 4, 5, 6 });
		for (int i = 0; i < leetcode303.nums.length; i++) {
			System.out.print(leetcode303.nums[i] + " ");

		}
		System.out.println();
		System.out.println(leetcode303.sumRange(1, 5));
	}

}