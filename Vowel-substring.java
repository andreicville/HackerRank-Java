import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String findSubstring(String s, int k) {
    // Write your code here
    
    String strVowels = "aeiou";
    String myString = new String();
    char givenString[] = s.toCharArray();
    ArrayList<Integer> countV= new ArrayList<Integer>();
    for (int i=0; i<givenString.length-k; i++) {
        if (strVowels.contains(givenString[i])) {
              myString = s.substring(i, i+k);
              int count = 0;
              for (int j=0; j<k;j++) {
                  if (strVowels.contains(myString.CharAt(j))) {
                      count++;
                  }
              }
              countV.add(count);
              break;
        }
    }
    System.out.println(myString);

    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.findSubstring(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
