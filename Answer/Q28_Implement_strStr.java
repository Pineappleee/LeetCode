/*
Q28 Implement strStr()
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

public class Solution {
    public int strStr(String haystack, String needle) {
    int m = haystack.length();
    int n = needle.length();
    int i, j;   
    for(i=0; i<=m-n; i++) {  // !!! <=
        for(j=0; j<n && haystack.charAt(i+j)==needle.charAt(j); j++);
        if(j==n) return i;  // !!!
    }
    return -1;
    }
}