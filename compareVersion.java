/*
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
Credits:
Special thanks to @ts for adding this problem and creating all test cases.
*/

public class Solution {
    public int compareVersion(String version1, String version2) {
    	if(version1 == null || version2 == null){
            return 0;
        }
        String verValues1[] = version1.split("\\.");
        String verValues2[] = version2.split("\\.");
        if(verValues1.length <2 || verValues2.length <2){
            return 0;
        }
        double da = Math.pow(10, verValues1[1].length());
        double value1 = Integer.parseInt(verValues1[0]) + Integer.parseInt(verValues1[1])/da;

        da = Math.pow(10, verValues2[1].length());
        double value2 = Integer.parseInt(verValues2[0]) + Integer.parseInt(verValues2[1])/da;
        if(value1>value2){
            return 1;
        }else if(value1 < value2){
            return -1;
        }else{
            return 0;
        }
    }
}