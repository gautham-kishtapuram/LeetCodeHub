package org.implementations;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Leetcode347 {
	public static void main(String[] args) {
		int[] array = topKFrequent(new int[] { -1, -1, 1, 1, 2, 2, 3 }, 2);
		System.out.println(Arrays.toString(array));
		int[] array1 = topKFrequentApproach2(new int[] {-1, -1, 1, 1, 2, 2, 3 }, 2);

		System.out.println(Arrays.toString(array1));

	}

	public static int[] topKFrequent(int[] nums, int k) {
		if (nums.length == 1 && k == 1) {
			return nums;
		}
		HashMap<Integer, BigInteger> integerIntegerHashMap = new HashMap<>();
		for (int element : nums) {
			if (integerIntegerHashMap.containsKey(element)) {
				integerIntegerHashMap.put(element, integerIntegerHashMap.get(element).add(BigInteger.ONE));
			} else {
				integerIntegerHashMap.put(element, BigInteger.ZERO);
			}
		}
		List<HashMap<Integer, BigInteger>> list = new ArrayList<>();
		list.add(integerIntegerHashMap);
		Map<Integer, String> sortedMap = integerIntegerHashMap.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(k)
				.collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString(),
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		int[] ints = new int[k];
		int i = 0;

		for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
			ints[i++] = entry.getKey();
		}

		return ints;
	}
//TODO to work on making the solution better
	public static int[] topKFrequentApproach2(int[] nums, int k) {
		if (nums.length == 1 && k == 1) {
			return nums;
		}
		HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
		for (int element : nums) {
			integerIntegerHashMap.put(element, integerIntegerHashMap.getOrDefault(element, 0) + 1);
		}
		int[] numbersCount = new int[integerIntegerHashMap.size()];
		for (Map.Entry<Integer, Integer> entry : integerIntegerHashMap.entrySet()) {
			numbersCount[entry.getValue()] = entry.getKey();
		}

		int[] numbersToReturn = new int[k];
		int pointer = 0;
		for (int i = numbersCount.length - 1; i >= k; i--) {
			numbersToReturn[pointer] = numbersCount[i];
			pointer++;
		}
		return numbersToReturn;

	}
}
