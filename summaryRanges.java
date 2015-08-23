/*
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
*/

public class Solution {
	/*too slowly ,3.17% */
	public List<String> summaryRanges(int[] nums) {
		List<String> resultList = new ArrayList<String>();
        int totalNum =  nums.length;
        if(totalNum==0){
            return resultList;
        }
		//final String containerStr = "";
		int startPos = 0;
		for(int index=0; index < totalNum; index++){
			if(nums[index] - nums[startPos] == index - startPos){
				continue;
			}else{
				if(index - startPos > 1){
					resultList.add(nums[startPos]+"->"+nums[index-1]);
				}else{
					resultList.add(nums[startPos]);
				}
				startPos = index;
			}
		}

		if(totalNum -1 - startPos >= 1){
			resultList.add(nums[startPos]+"->"+nums[totalNum-1]);
		}else{
			resultList.add(nums[startPos]);
		}
		
		return resultList;
		}
		}
}

/*
*/