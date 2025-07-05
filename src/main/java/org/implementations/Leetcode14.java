package org.implementations;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/longest-common-prefix/description/
public class Leetcode14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        System.out.println(prefix);
        return prefix;
    }

// the initial intution was to sort the array and pick first and last elements -
// but would not work since might have completely different strings between 0 and lenght-1
    public static String sortTheArray(String[] strs) {
        System.out.println(Arrays.toString(Arrays.stream(strs).sorted().toArray()));
        return null;
    }

    public static String sort(String[] args) {
        List<String> stringList = Arrays.stream(args).sorted((e1, e2) -> BigInteger.valueOf(e2.length()).compareTo(BigInteger.valueOf(e1.length()))).toList();
        System.out.println(stringList);
        return sortTheArray2(stringList.getFirst(), stringList.getLast());
    }

    public static String sortTheArray2(String firstElement, String lastElement) {
        while (!lastElement.isEmpty()) {
            if (!firstElement.contains(lastElement)) {
                lastElement = lastElement.substring(0, lastElement.length() - 1);
            } else {
                return lastElement;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        String[] sample = new String[]{"zz","zzzz", "abcd", "ab", "cc", "abc"};
        Leetcode14.longestCommonPrefix(sample);

        System.out.println("calling the sort method");
        System.out.println(sort(sample));
        System.out.println("END");
    }
}
