/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/

public class Solution {
	/*316 ms pas 1101 case*/
    public int addDigits(int num) {
        int result = 0;
        final int NUM_TEN = 10;
    	do{
			int lastNum = num%NUM_TEN;
			result += lastNum;
			num = num/NUM_TEN;
		}while(num>=NUM_TEN);
		
		result += num;			
		if(result>=NUM_TEN){
			return addDigits(result);
		}else{
			return result;
		}
    }
    /*288ms pass 1101 case*/
    public  int addDigits(int num) {
        return (num-1)%9 +1;
    }
}