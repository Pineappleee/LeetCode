
"""
Given a sorted array and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

"""

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int low = 0, high = nums.length -1;
        int mid = (low + high)/2;
        while ((high-low)>1){
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                low = mid;
                mid = (low + high)/2;}
            else {
                high = mid;
                mid = (low + high)/2;
            }
        }
        if (target == nums[low]) return low;
        else if(target > nums[high]) return nums.length;
        else if (target < nums[low]) return 0;
        else return high;
    }
}