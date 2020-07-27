package HackerRank1;
//Given a  2D Array, :

//
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:
//
//a b c
//  d
//e f g
//There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
//
//For example, given the 2D array:
//
//-9 -9 -9  1 1 1 
// 0 -9  0  4 3 2
//-9 -9 -9  1 2 3
// 0  0  8  6 6 0
// 0  0  0 -2 0 0
// 0  0  1  2 4 0
//We calculate the following  hourglass values:
//
//-63, -34, -9, 12, 
//-10, 0, 28, 23, 
//-27, -11, -2, 10, 
//9, 17, 25, 18
//Our highest hourglass value is  from the hourglass:
//
//0 4 3
//  1
//8 6 6
//Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
//
//Function Description
//
//Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.
//
//hourglassSum has the following parameter(s):
//
//arr: an array of integers
//Input Format
//
//Each of the  lines of inputs  contains  space-separated integers .
//
//Constraints
//
//Output Format
//
//Print the largest (maximum) hourglass sum found in .
//
//Sample Input
//
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0
//Sample Output
//
//19

public class Arrays_2D {

	
	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 0;
		arr[0][4] = 0;
		arr[0][5] = 0;
		
		arr[1][0] = 0;
		arr[1][1] = 1;
		arr[1][2] = 0;
		arr[1][3] = 0;
		arr[1][4] = 0;
		arr[1][5] = 0;
		
		arr[2][0] = 1;
		arr[2][1] = 1;
		arr[2][2] = 1;
		arr[2][3] = 1;
		arr[2][4] = 0;
		arr[2][5] = 0;
		
		arr[3][0] = 0; 
		arr[3][1] = 0;
		arr[3][2] = 2;
		arr[3][3] = 4;
		arr[3][4] = 4;
		arr[3][5] = 0;
		
		arr[4][0] = 0;
		arr[4][1] = 0;
		arr[4][2] = 0;
		arr[4][3] = 2;
		arr[4][4] = 0;
		arr[4][5] = 0;
		
		arr[5][0] = 0;
		arr[5][1] = 0;
		arr[5][2] = 1;
		arr[5][3] = 2;
		arr[5][4] = 4;
		arr[5][5] = 0;
		
		System.out.println(hourglassSum(arr));
		
	}

	public static int hourglassSum(int[][] arr) {
		int[] hSums = new int[50];
		int h = 0;
		int max = 0;
		for (int j = 0; j < arr.length-2; j++) {
			for (int i = 0; i < arr[j].length-2; i++) {
				int sum1 = arr[j][i] + arr[j][i + 1] + arr[j][i + 2];
				int sum2 = arr[j + 1][i + 1];
				int sum3 = arr[j + 2][i] + arr[j + 2][i + 1] + arr[j + 2][i + 2];
				hSums[h] = sum1 + sum2 + sum3;
			
				if (h == 0) max = hSums[h];
				if (hSums[h] > max) max = hSums[h];
				h++;
			}
		}

		return max;
	}

}
