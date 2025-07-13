package org.implementations;

import java.util.*;

public class Leetcode15 {
    public static void main(String[] args) {

        Leetcode15 leetcode15 = new Leetcode15();
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(leetcode15.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listList = new HashSet<>();
        nums = Arrays.stream(nums).sorted().toArray();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> integers = new ArrayList<>();
                    integers.add(nums[i]);
                    integers.add(nums[j]);
                    integers.add(nums[k]);
                    listList.add(integers);
                    j++;
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    while (j < k) {
                        if (nums[k] != nums[k - 1]) {
                            k--;
                            break;
                        }
                        k--;
                    }

                } else {
                    while (j < k) {
                        if (nums[j] != nums[j + 1]) {
                            j++;
                            break;
                        }
                        j++;
                    }
                }


            }

        }
        return listList.stream().toList();
    }


    public List<List<Integer>> threeSumUsingAI(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);                 // still O(n log n)

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;   // skip same 'a'

            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(List.of(nums[i], nums[j], nums[k]));
                    j++; k--;
                    // skip duplicates of the second and third numbers
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }
}
