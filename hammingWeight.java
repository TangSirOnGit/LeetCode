/*
Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.
*/

public class Solution {
	public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count ++;
            n = n&(n-1);
        }
        return count;
    }
}