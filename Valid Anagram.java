/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
public class Solution {
	/*pass*/
	public boolean isAnagram(String s, String t) {
		if(s==null||t==null||s.length()!=t.length()){  
        return false;  
    }  
    char[] array1 = s.toCharArray();  
    char[] array2 = t.toCharArray();  
    Arrays.sort(array1);  
    Arrays.sort(array2);  
    return Arrays.equals(array1, array2); 
	}
}