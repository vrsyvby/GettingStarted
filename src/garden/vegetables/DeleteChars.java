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

class Results {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
        if(s==null||s==""||s.length()<2){
            return 0;
        }else{
            int count=0;
            int loopIterator=0;



            while(loopIterator+1<s.length()){

                String firstChar=s.substring(loopIterator,loopIterator+1);
             char[] charr=   firstChar.toCharArray();
                char ch=charr[0];
                String secondChar=s.substring(loopIterator+1,loopIterator+2);
                System.out.println(firstChar+" "+secondChar);

                if(firstChar.equals(secondChar)){
                    s=s.replaceFirst(firstChar,"");
                    count+=1;
                }else{
                    loopIterator+=1;
                }
            }
            return count;
        }

    }

}

public class DeleteChars {
    public static void main(String[] args) throws IOException {

        int result = Results.alternatingCharacters("AAAA");
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Results.alternatingCharacters(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
