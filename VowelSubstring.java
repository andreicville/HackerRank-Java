package HackerRank1;
import java.io.IOException;

public class VowelSubstring {
	public static void main(String[] args) throws IOException {
		System.out.println("Result: " + findSubstring("caberqiitefg", 5));
		System.out.println("Result: " + findSubstring("aeiouia", 3));
		System.out.println("Result: " + findSubstring("azerdii", 5));

	}
	/*
	 * Complete the 'findSubstring' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING s 2. INTEGER k
	 */

	static String strVowels = "aeiou";

	public static int countVowels(String str) {
		int count = 0;
		for (int j = 0; j < str.length(); j++) {
			// System.out.println("countVowels: " + j + " " + str.charAt(j) + " > " + str +
			// " = " + count);
			if (strVowels.indexOf(str.charAt(j)) >= 0) {
				count++;
			}

		}
		return count;
	}

	public static String findSubstring(String s, int k) {

		String myString = new String();
		char[] givenString = s.toCharArray();

		int maxV = 0;
		int vowelsQuant = 0;
		String strGood = "";
		
		// No Vowels found
		if (countVowels(s) == 0)
			return "Not found!";

		for (int i = 0; i <= givenString.length - k; i++) {

			myString = s.substring(i, i + k);
			vowelsQuant = countVowels(myString);
			if (vowelsQuant > maxV) {
				maxV = vowelsQuant;
				strGood = myString;
			}

		}
		return strGood;
	}

}
