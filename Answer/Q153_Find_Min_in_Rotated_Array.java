"""Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
"""

public class Solution {
    public int findMin(int[] nums) {
        
        if (nums == null || nums.length == 0) return 0;
        
        if (nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
        int mid = left + (right-left)/2;
        
        if (nums[left] < nums[right]) return nums[0]; // no rotation
        
        else if (left == right-1) return nums[right]; // only two elements left, pivot point it's 
        
        else if (nums[mid] > nums[left]) left = mid; // discard left part, it's already sorted
        
        else right = mid; 
        }
        return 0;
    }
}