package com.in;

import java.util.Arrays;

public class MoveZero {
	public static void moveZeroes(int[] nums) {
		int n = nums.length;
		int insertPos = 0;

		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				nums[insertPos] = nums[i];
				insertPos++;
			}
		}

		while (insertPos < n) {
			nums[insertPos] = 0;
			insertPos++;
		}
	}

	public static void main(String[] args) {
		int[] nums1 = { 0, 1, 0, 3, 12 };
		moveZeroes(nums1);
		System.out.println(Arrays.toString(nums1));
	}

}
