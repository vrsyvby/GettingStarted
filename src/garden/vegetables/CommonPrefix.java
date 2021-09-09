package garden.vegetables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonPrefix {


/*
                    input= "ababaa"; commonPrefix=""; sum=6
                    input= "babaa"; commonPrefix="a"; sum=6
                    input= "abaa"; commonPrefix="ab"; sum=sum+2=8
                    input= "baa"; commonPrefix="aba"; sum=8
                    input= "aa"; commonPrefix="abab"; sum=8
                    input= "a"; commonPrefix="ababa"; sum=sum+1=9
*/



    public static List<Integer> countCommonPrefix(String[] args){

        List<Integer> counts= new ArrayList<>();
        Arrays.asList(args).forEach((input)->{
            int listIterator=1;
            String commonPrefix;
            int sum=input.length();
            String frstString= input;
            while(listIterator<frstString.length()){

                commonPrefix=frstString.substring(0,listIterator);
                input= frstString.substring(listIterator);

               for(int i=0;i<input.length() && i<commonPrefix.length();i++){
                   if(input.charAt(i)==commonPrefix.charAt(i)){
                      if(input.length()<commonPrefix.length() && i==input.length()-1){
                          sum+=input.length();
                      }else if(input.length()>commonPrefix.length() && i==commonPrefix.length()-1){
                          sum+=commonPrefix.length();
                      }

                   }else{
                       break;
                   }
               }



               listIterator++;
            }

            counts.add(sum);
        });
       return counts;
    }


    public static void main(String[] args){

      String[] testInput= new String[]{"ababaa","shyam","abaabaa"};
      System.out.println(countCommonPrefix(testInput));

    }
}
