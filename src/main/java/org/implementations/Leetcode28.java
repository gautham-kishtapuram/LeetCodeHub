package org.implementations;

import java.util.stream.IntStream;

public class Leetcode28 {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "gau"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        char firstCharacterFromNeedle = needle.charAt(0);

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == firstCharacterFromNeedle && haystack.startsWith(needle, i)) {
                return i;
            }

        }

        return -1;

    }

    public static int strStrUsingStreams(String haystack, String needle) {
        int maxIndex = haystack.length() - needle.length();
        char firstChar = needle.charAt(0);

        return IntStream.rangeClosed(0, maxIndex)
                .filter(i -> haystack.charAt(i) == firstChar)
                .filter(i -> haystack.startsWith(needle, i))
                .findFirst()
                .orElse(-1);
    }
}
