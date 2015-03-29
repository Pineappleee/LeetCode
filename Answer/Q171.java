public class Solution {
    public int titleToNumber(String s) {
        char c;
        int[] num =new int[s.length()];
        int sum = 0;
        int j=0;
        for (int i=s.length()-1; i>=0; i--){
            c = s.charAt(i);
            num[j] = (int)c - 64;
            j++;
        }
        int t=0;
        for (int i=0; i< num.length;i++){
            sum += Math.pow(26,t)*num[i];
            t++;
        }
        return sum;
    }
}