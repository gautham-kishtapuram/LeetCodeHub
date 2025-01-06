package org.implementations;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode242 {
	public static void main(String[] args) {

		String s1 = "rat";
		String s2 = "car";
		LeetCode242 leetCode242 = new LeetCode242();
		System.out.println(leetCode242.isAnagram3(s1, s2));

	}

	// Approach 1
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		char[] s1ToChar = s.toCharArray();
		char[] s2ToChar = t.toCharArray();
		Arrays.sort(s1ToChar);
		Arrays.sort(s2ToChar);
		return Arrays.toString(s1ToChar).equals(Arrays.toString(s2ToChar));

	}

	// Approach 2
	public boolean isAnagram2(String s, String t) {
		HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
		for (char c : s.toCharArray()) {
			characterIntegerHashMap.put(c, characterIntegerHashMap.getOrDefault(c, 0) + 1);
		}
		for (char c : t.toCharArray()) {
			characterIntegerHashMap.put(c, characterIntegerHashMap.getOrDefault(c, 0) - 1);
		}
		for (int frequency : characterIntegerHashMap.values()) {
			if (frequency != 0) {
				return false;
			}
		}
		return true;

	}

	// Approach 3
	public boolean isAnagram3(String s, String t) {
		int[] characters = new int[26];
		for (char ch : s.toCharArray()) {
			characters[ch - 'a'] += 1;
		}
		System.out.println(Arrays.toString(characters));

		for (char ch : t.toCharArray()) {
			characters[ch - 'a'] -= 1;
		}
		System.out.println(Arrays.toString(characters));
		for (int integer : characters) {
			if (integer != 0)
				return false;
		}
		return true;
	}

}
