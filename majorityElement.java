/*Given an array of size n, find the majority element. 
The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.
Credits:
Special thanks to @ts for adding this problem and creating all test cases.
*/

public class Solution{
    public static int majorityElement(int[] nums) {
        int totalNum = nums.length;
        Map elementMap = new HashMap();
        int element = nums[0];
        for(int i=0; i< totalNum; i++){
            element = nums[i];
            int times = 1;
            if(elementMap.containsKey(element)){
                times = (int)elementMap.get(element) +1;
            }

            if(times>=(totalNum/2)){
                break;
            }else{
                elementMap.put(element, times);
            }
        }
        return element;
    }
}
