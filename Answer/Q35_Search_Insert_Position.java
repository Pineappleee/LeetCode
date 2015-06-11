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