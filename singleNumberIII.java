/*
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. 
Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
*/

public class Solution {
	public int[] singleNumber(int[] nums) {
		int [] result = new int[2];
		if(nums.length <2){
			return result;
		}

		Map numsMap = new HashMap();
		for(int i=0; i < nums.length; i ++){
			if(numsMap.containsKey(nums[i])){
				numsMap.put(nums[i],2);
			}else{
				numsMap.put(nums[i],1);
			}
		}

		Iterator iter = numsMap.entrySet().iterator();
		int singleCount = 0;
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
			if(val == 1){
				singleCount++;
				result[singleCount-1] = (Integer)key;
				if(singleCount==2){
					break;
				}
			}
		}
		return result;
	}
}