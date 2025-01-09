package org.implementations;

import java.math.BigInteger;
import java.util.HashMap;

public class Leetcode347 {
	public static void main(String[] args) {
		topKFrequent(new int[] { 12, 12, 3, 45 }, 2);

	}

	public static int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer, BigInteger> integerIntegerHashMap = new HashMap<>();
		for (int element : nums) {
			if (integerIntegerHashMap.containsKey(element)) {
				integerIntegerHashMap.put(element, integerIntegerHashMap.get(element).add(BigInteger.ONE));
			} else {
				integerIntegerHashMap.put(element, BigInteger.ZERO);
			}
		}
		int[] ints = new int[k];
		
		return null;
	}
}
