package garden.vegetables;
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

class Resultss {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int countChars(String comparator, String a, String b) {
        comparator=comparator.toLowerCase();
        int deletionsRequired = 0;
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aCharArray = a.toCharArray();
        char[] bCharArray = b.toCharArray();


        while (comparator.length() >0 ) {
            String sample = comparator.substring(0,1);

            char[] samplecharArray = sample.toCharArray();
            char samplechar = samplecharArray[0];

            int countA = 0;
            int countB = 0;
            for (int i = 0; i < a.length(); i++) {

                if (aCharArray[i] == samplechar) {
                    ++countA;
                }
            }


            for (int i = 0; i < b.length(); i++) {
                if (bCharArray[i] == samplechar) {

                    ++countB;
                }
            }


            if(countA>countB){
                deletionsRequired+=countA-countB;
            }else {
                deletionsRequired+=countB-countA;
            }
            a = a.replace(sample, "");
            aCharArray = a.toCharArray();
            b = b.replace(sample, "");

            bCharArray = b.toCharArray();
            //  System.out.println(sample);
            comparator=comparator.replace(sample,"");
            //  System.out.println(comparator);


        }

        return deletionsRequired;
    }


    public static int makeAnagram(String a, String b) {

        if (a == null || b == null || a == "" || b == "") {
            return 0;
        } else {
            System.out.println(a+b);
            return countChars(a.concat(b), a, b);
        }
    }
}



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Resultss.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
