package garden.vegetables;
import java.util.Scanner;

public class Anagarams {

    static boolean isAnagram(String a, String b) {
        if(a==null || b==null||a==""||b==""){
            return false;
        }else if(a.length()!=b.length()){
            return false;
        }else{

            a=a.toLowerCase();
            b=b.toLowerCase();
            char[] aCharArray=a.toCharArray();
            char[] bCharArray=b.toCharArray();
            String firstString=a.concat(b);

            while(firstString.length()>0){
                String sample= firstString.substring(0,1);

                char[] samplecharArray=sample.toCharArray();
                char samplechar=samplecharArray[0];

                int countA=0;
                int countB=0;
                for(int i=0;i<a.length();i++){

                    if(aCharArray[i]==samplechar){
                        ++countA;
                    }
                    if(bCharArray[i]==samplechar){

                        ++countB;
                    }
                }




                if(countA!=countB) return false;
                a= a.replace(sample,"");
                aCharArray=a.toCharArray();
                b= b.replace(sample,"");
                bCharArray=b.toCharArray();

                firstString=firstString.replace(sample,"");


            }

            return true;

        }



    }





    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
