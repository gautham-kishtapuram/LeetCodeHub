package org.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/group-anagrams/
public class Leetcode49 {
	public static void main(String[] args) {
		System.out.println(groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
		System.out.println(groupAnagrams(new String[] { "eat" }));
		System.out.println("Second Approach");
		System.out.println(groupAnagramsApproach2(new String[] { "eat" }));
		System.out.println(groupAnagramsApproach2(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
		System.out.println(groupAnagrams(new String[] { "ddddddddddg", "dgggggggggg" }));
		System.out.println(groupAnagramsApproach2(new String[] { "ddddddddddg", "dgggggggggg" }));
		System.out.println(groupAnagramsApproach2(new String[] { "ddddddddddg", "dgggggggggg" }));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<Integer>> stringListHashMap = new HashMap<>();
		List<String> strings = Arrays.stream(strs).toList().stream().map(element -> {
			char[] arrayOfString = element.toCharArray();
			Arrays.sort(arrayOfString);
			return String.valueOf(arrayOfString);
		}).toList();

		for (int i = 0; i < strings.size(); i++) {
			if (stringListHashMap.containsKey(strings.get(i))) {
				stringListHashMap.get(strings.get(i)).add(i);
			} else {
				List<Integer> arrayList = new ArrayList<>();
				arrayList.add(i);
				stringListHashMap.put(strings.get(i), arrayList);
			}
		}
		List<List<String>> list = new ArrayList<>();
		for (Map.Entry<String, List<Integer>> map : stringListHashMap.entrySet()) {
			List<String> strings1 = new ArrayList<>();
			for (Integer integers : map.getValue()) {
				strings1.add(strs[integers]);

			}
			list.add(strings1);
		}
		return list;
	}

	public static List<List<String>> groupAnagramsApproach2(String[] strs) {
		HashMap<String, List<String>> stringListHashMap = new HashMap<>();
		for (String element : strs) {
			int[] stringIndexes = new int[26];
			for (char ch : element.toCharArray()) {
				stringIndexes[ch - 'a'] += (ch);
			}
			String hashValue = Arrays.toString(stringIndexes);

			stringListHashMap.putIfAbsent(hashValue, new ArrayList<>());

			stringListHashMap.get(hashValue).add(element);

		}
		return new ArrayList<>(stringListHashMap.values());

	}
	public static List<List<String>> groupAnagramsApproach3(String[] strs) {
		HashMap<Integer, ArrayList<String>> anagrams = new HashMap<>();

		for (String str : strs) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			int key = Arrays.hashCode(charArray);
			anagrams.putIfAbsent(key, new ArrayList<>());
			anagrams.get(key).add(str);
		}

		return new ArrayList<>(anagrams.values());

	}


}
