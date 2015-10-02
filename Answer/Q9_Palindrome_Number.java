"""
Determine whether an integer is a palindrome. Do this without extra space.
"""

public class Solution {
    public boolean isPalindrome(int x) {
        String st = Integer.toString(x);
        int i=0;
        if (x<0)
            return false;
        while (i<=st.length()/2){
            if (st.charAt(i) == st.charAt(st.length()-i-1))
                i++;
            else
                return false;
        }
        return true;
    }
}