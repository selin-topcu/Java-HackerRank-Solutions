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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
     // Write your code here
     List<String> myList = new ArrayList<String>();
     double pos=0,neg=0,zero=0;
     DecimalFormat df = new DecimalFormat("0.000000");
    for(int i =0; i<arr.size(); i++){
      if(arr.get(i)>0){
          pos++;
      }else if(arr.get(i)<0){
          neg++;
      }
      else{
          zero++;
      }     
    }
    
    myList.add(String.format("%.6f", pos/arr.size()));
    myList.add(String.format("%.6f", neg/arr.size()));
    myList.add(df.format(zero/arr.size()));

for(int i =0; i<myList.size();i++){
        System.out.println(myList.get(i));
}

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
