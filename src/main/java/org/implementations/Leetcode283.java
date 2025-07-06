package org.implementations;

import java.util.Arrays;
import java.util.Formattable;
// https://leetcode.com/problems/move-zeroes/
public class Leetcode283 {
    public static void main(String[] args) {
        int[] ints = new int[]{0,45,0,21,5,0,45,2,0,89,0,1,0,3,0,0,1,0,0,12};
        Leetcode283 leetcode283 = new Leetcode283();
//        leetcode283.moveZeroesSecondSolution(ints);
//        leetcode283.moveZeroesToLast(ints);
        leetcode283.moveZeroesToRight(ints);

        System.out.println(Arrays.toString(ints));
    }

    public void moveZeroesSecondSolution(int[] nums) {
        int rightPointer = nums.length - 1;
        for (int i = 0; i <= rightPointer; i++) {
            if (nums[i] == 0) {
                while (nums[rightPointer] == 0) {
                    rightPointer--;
                }
                int temp = nums[rightPointer];
                nums[rightPointer] = nums[i];
                nums[i] = temp;

            }

        }
    }

    public void moveZeroes(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {

            if (leftPointer <= rightPointer) {
                if (nums[rightPointer] == 0) {
                    rightPointer--;

                } else if ((nums[leftPointer] == 0 && nums[rightPointer] != 0)) {

                    int temp = nums[rightPointer];
                    nums[rightPointer] = nums[leftPointer];
                    nums[leftPointer] = temp;
                    leftPointer++;
                    rightPointer--;


                } else {
                    leftPointer++;
                    rightPointer--;

                }

            }

        }

    }

    public void moveZeroesToLast(int[] nums) {
        int zeroTracker = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && zeroTracker > -1) {
                nums[zeroTracker] = nums[i];
                nums[i] = 0;
                zeroTracker++;
            } else if (nums[i] == 0 && zeroTracker == -1) {
                zeroTracker = i;
            }

        }
    }

    public void moveZeroesToRight(int[] nums) {
        int pointerForTrackingZero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && pointerForTrackingZero == -1) {
                pointerForTrackingZero = i;
            }
            if (nums[i] != 0 && pointerForTrackingZero > -1) {
                nums[pointerForTrackingZero] = nums[i];
                nums[i] = 0;
                pointerForTrackingZero++;
            }
        }
    }


    /*
    * 0,1,0,3,12
    * 1 0 0 3 12
    * 1 3 0 0 12
    *
    *
    *
    * 0 1 0 3 12
    * 1 0 0 3 12
    * 1 3 0 0 12
    *
    *
    *
    *
    * */
}
