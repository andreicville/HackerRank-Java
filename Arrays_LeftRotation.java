package HackerRank1;
//A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become .

//
//Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
//
//Function Description
//
//Complete the function rotLeft in the editor below. It should return the resulting array of integers.
//
//rotLeft has the following parameter(s):
//
//An array of integers .
//An integer , the number of rotations.
//Input Format
//
//The first line contains two space-separated integers  and , the size of  and the number of left rotations you must perform.
//The second line contains  space-separated integers .
//
//Constraints
//
//Output Format
//
//Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.
//
//Sample Input
//
//5 4
//1 2 3 4 5
//Sample Output
//
//5 1 2 3 4

public class Arrays_LeftRotation {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		int[] newArr = new int[5];
		newArr = rotateToLeft(arr, 4);
		for (int i : newArr) {
			System.out.println(i);
		}
	}

	public static int[] rotateToLeft(int[] a, int d) {

		int len = a.length;
		int[] newA = new int[len];
		for (int i = d; i < len; i++) {
			newA[i - d] = a[i];
		}
		for (int i = 0; i < d; i++) {
			newA[len - d + i] = a[i];
		}

		return newA;
	}
}
