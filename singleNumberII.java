/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
public class Solution {
/*pass, too slowly, 12.95%*/
    public int singleNumber(int[] nums) {
        int result = nums[0];
		Map numsMap = new HashMap();
		for(int i=0; i < nums.length; i ++){
			if(numsMap.containsKey(nums[i])){
				numsMap.put(nums[i],2);
			}else{
				numsMap.put(nums[i],1);
			}
		}

		Iterator iter = numsMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
			if((Integer)val == 1){
				result =  (Integer)key;
				break;
			}
		}
		return result;
    }
}