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

class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {

        // Write your code here
        if(s==null||s==""){
            return "NO";

        }else{
            int countbefore=0;
            boolean usedAlready=false;
            while(s.length()>0){
                int count=0;
                String sample=s.substring(0,1);
                char[] charr=sample.toCharArray();
                char ch=charr[0];
                for(int i=0;i<s.length();i++){
                    if(ch==s.charAt(i)){
                        count++;
                    }
                }
                if(countbefore==0)countbefore=count;
                else if(Math.abs(count-countbefore)>=2){
                    if(!usedAlready && count==1){
                        usedAlready=true;
                    }
                    else {
                        return "NO";
                    }
                }else{
                    if (Math.abs(count-countbefore)<2 &&!usedAlready && s.length()==1){

                            return "NO";


                    }else{
                        usedAlready=true;
                        countbefore=countbefore>count?count:countbefore;
                    }
                }
                s=s.replaceAll(sample,"");


            }
            return "YES";
        }
    }

}

public class Sherlock {
    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
*/
        String s = "aabbccddeefghi";

        String result = Result.isValid(s);

        System.out.println(result);

       /* bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}

