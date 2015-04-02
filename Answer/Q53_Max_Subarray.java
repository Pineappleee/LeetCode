public class Solution {
    public int maxSubArray(int[] A) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        if (A.length == 0)
            return sum;
        else {
            for (int i =0; i< A.length; i++){
                sum = sum + A[i];
                max = Math.max(sum,max);
                if (sum < 0)
                    sum = 0;
            }
        }
        return max;
    }
}