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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    // Java 8
    String alph="abcdefghijklmnopqrstuvwxyz";
    int control=0;
    String isPangram="pangram";
    s=s.toLowerCase();
    for(int i=0; i<alph.length(); i++){
        for(int j=0; j<s.length(); j++){
            if(alph.charAt(i)==s.charAt(j)||alph.charAt(i)==' '){
            control++;
        }  
        }
        if(control==0){
            isPangram="not pangram";
        }
        control=0;
    }
    return isPangram;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
