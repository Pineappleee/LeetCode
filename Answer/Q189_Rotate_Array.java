/*
189. Rotate Array

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
*/

public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 1) {} 
        else {
            if(k>nums.length){
            k = k%nums.length;
        }
           int[] temp = new int[nums.length];
           for (int i=0; i<nums.length; i++) {
               temp[i] = nums[i];
               if (i <k)
               nums[i] = nums[i+nums.length-k];
           }
           int j=0;
           for (int i=k; i<nums.length; i++){
               nums[i] = temp[j];
               j++;
           }
        }
    }
}