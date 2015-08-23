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


/*pass all test*/
public class Solution {
    public int compareVersion(String version1, String version2) {
    	if(version1 == null || version2 == null){
            return 0;
        }
        String verValues1[] = version1.split("\\.");
        String verValues2[] = version2.split("\\.");
        int length1 = verValues1.length;
        int length2 = verValues2.length;
        int maxLength = Math.max(verValues1.length,verValues2.length);
        int index =0;
        //System.out.println("maxLength="+maxLength);
        while(index < maxLength){
            int value1 = 0;
            int value2 = 0;
            if(index < length1){
                value1 = Integer.parseInt(verValues1[index]);
            }
            if(index < length2){
                value2 = Integer.parseInt(verValues2[index]);
            }
            //System.out.println("value1="+value1+",value2="+value2);
            if(value1>value2){
                return 1;
            }else if(value1 <value2){
                return -1;
            }
            index++;
        }
        
        return 0;
    }
}