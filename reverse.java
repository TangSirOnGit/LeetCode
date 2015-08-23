/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
*/
public class Solution {
	/*存在溢出问题*/
	public int reverse(int x) {
		int result = 0;
     	 	final int NUM_TEN = 10;
    		while(x>=NUM_TEN || x<=-NUM_TEN){
    			result = result*NUM_TEN + x%NUM_TEN;
			x = x/NUM_TEN;
		}
		return (result*NUM_TEN + x);
	}
}