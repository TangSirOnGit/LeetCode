/*
Given n non-negative integers a1, a2, ..., an, 
where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.
*/
public class Solution {
    /*fail--Time Limit Exceeded
    remove the print ,pass*/
	public int maxArea(int[] height){
		if(height.length<2){
            return 0;
        }
        int maxarea = 0;
        int area = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        while(leftIndex < rightIndex){
            if(height[leftIndex] <= height[rightIndex]){
                area = height[leftIndex] *(rightIndex - leftIndex);
                /System.out.println("area "+leftIndex+":"+area);
                leftIndex++;
            }else{
                area = height[rightIndex] *(rightIndex - leftIndex);
                System.out.println("area "+rightIndex+":"+area);
                rightIndex--;
            }
            if(area > maxarea){
                maxarea = area;
            }
        }
        return maxarea;
	}
}