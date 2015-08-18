/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
For example,

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.
*/

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		int rowNum = matrix.length;
		if(rowNum==0){
			return false;
		}
		int columNum = matrix[0].length;
		if(columNum==0){
			return false;
		}
		boolean result = false;
		int rowIndex = 0;
		int columnIndex = columNum-1;
		for(int index = 0; index < (rowNum+columNum-1) ; index++){
			if(rowIndex<0 || rowIndex>=rowNum || columnIndex<0 || columnIndex>=columNum ){
				break;
			}
			if(matrix[rowIndex][columnIndex] == target){
				result = true;		
				break;
			}else if( target > matrix[rowIndex][columnIndex]){
				rowIndex++;
			}else{
				columnIndex--;
			}
		}
		return result;
	}
}