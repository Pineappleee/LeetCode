/* Longest Substring Without Repeating Characters
  Given a string, find the length of the longest substring without repeating characters. 
  For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
  which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
*/

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s==null) return 0;
        char[] arr = s.toCharArray();
        int mark = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0; i<arr.length; i++){
            if (!map.containsKey(arr[i]))
                map.put(arr[i],i);
            else {
                mark = Math.max(mark, map.size());
                i = map.get(arr[i]);
                map.clear();
            }
        }
        return Math.max(mark, map.size());
    }
}