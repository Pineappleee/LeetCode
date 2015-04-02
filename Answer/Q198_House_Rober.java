public class Solution {
    public int rob(int[] num) {
        int[] rob = new int[num.length+1];
        if (num.length == 0)
            return 0;
        else if (num.length == 1)
            return num[0];
        else{
            rob[1] = num[0];
            for (int i=2; i<num.length+1; i++){
                rob[i] = rob[i-1] > rob[i-2] + num[i-1] ? rob[i-1] : rob[i-2] + num[i-1];
            }
            return rob[num.length];
        }
        
    }
}