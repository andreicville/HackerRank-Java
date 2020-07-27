package HackerRank1;

import java.util.ArrayList;
import java.util.Iterator;

///*John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
//Function Description
//Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
//sockMerchant has the following parameter(s):
//
//n: the number of socks in the pile
//ar: the colors of each sock
//Input Format
//
//The first line contains an integer , the number of socks represented in .
//The second line contains  space-separated integers describing the colors  of the socks in the pile.
//
//Constraints
//
// where 
//Output Format
//
//Return the total number of matching pairs of socks that John can sell.
//
//Sample Input
//
//9
//10 20 20 10 10 30 50 10 20
//Sample Output
//
//3*/
public class SockMerchant {

	public static void main(String[] args) {
		ArrayList<Integer> myArr = new ArrayList<Integer>();
		//int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int[] ar = { 6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5 };

		for (int i = 0; i < ar.length; i++)
			myArr.add(ar[i]);
		System.out.println(countPairs(myArr));
	}

	public static int countPairs(ArrayList<Integer> socks) {
		int pair = 0;
		int count = 0;

		Iterator<Integer> socksItr = socks.iterator();
		while (socksItr.hasNext()) {

			pair = socks.get(0);
			socks.remove(0);

			for (int i = 0; i < socks.size(); i++) {
				if (pair == socks.get(i)) {
					count++;
					socks.remove(i);

					break;
				}

			}

		}

		return count;
	}

}
