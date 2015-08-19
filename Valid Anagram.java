/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
public class Solution {
	public boolean isAnagram(String s, String t) {
		if(s == null || t == null){
			return false;
	    }
		if(s.length() != t.length()){
			return false;
		}
		char [] charArray = s.toCharArray();
		Map sMap = new HashMap();
		for(Character  elment : charArray){
			Integer num = (Integer)sMap.get(elment);
			if(num == null){
				num = 1;
			}else{
				num += 1;
			}
			sMap.put(elment, num);
		}
		charArray = t.toCharArray();
		Map tMap = new HashMap();
		for(Character  elment : charArray){
			if( !sMap.containsKey(elment)){
				return false;
			}
			Integer num = (Integer)tMap.get(elment);
			if(num == null){
				num = 1;
			}else{
				num += 1;
			}
			tMap.put(elment, num);
		}
	
		Iterator iter = sMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
			if(val != tMap.get(key)){
				return false;
			}
		}
		return true;
	}
}