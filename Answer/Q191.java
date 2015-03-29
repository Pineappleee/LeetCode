public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String cur = Integer.toBinaryString(n);
        int sum = 0;
        for (int i=0; i<cur.length();i++){
            if (cur.charAt(i) == '1')
                sum++;
        }
        return sum;
        
    }

/*  Alternate method
    public int hammingWeight(int n) {
        int sum = Integer.bitCount(n);
        return sum;
        
    }
*/
}