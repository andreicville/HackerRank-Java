package HackerRank1;

import java.util.Iterator;
import java.util.Vector;

//Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.

//
//For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided. For example,  indexed from . The number on each cloud is its index in the list so she must avoid the clouds at indexes  and . She could follow the following two paths:  or . The first path takes  jumps while the second takes .
//
//Function Description
//
//Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.
//
//jumpingOnClouds has the following parameter(s):
//
//c: an array of binary integers
//Input Format
//
//The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .
//
//Constraints
//
//Output Format
//
//Print the minimum number of jumps needed to win the game.
//
//Sample Input 0
//
//7
//0 0 1 0 0 1 0
//Sample Output 0
//
//4

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		// 0 0 1 0 0 1 0
		v.add(0);
		v.add(0);
		v.add(1);
		v.add(0);
		v.add(0);
		v.add(1);
		v.add(0);
		
		// 0 0 1 0 0 1 0

		System.out.println(countingJumps(v));

	}

	public static int countingJumps(Vector<Integer> c) {

		int count = 0;
				
		for (int i=0; i<c.size()-1; i++ ) {
			System.out.println(i+ ":" + c.get(i));
			if ((c.get(i+2) == 0) && ((i+2)<c.size())) i++;
			count++;
		}
		
		return count;
	}
}
