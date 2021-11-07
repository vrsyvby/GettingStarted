package garden.vegetables;

public class JPMC {


    public static void isPalindrome(String value){

        // value
        //abcba
        // abcab



        if(value=="" || value==null){ // exited, O(1)
           System.out.println("false");
        }else{

           char[] chars= value.toCharArray();// a,b,c,a,b


//           compare 0> n-1
//                1-> n-2
//                2-> n-3
//                till n-k= n-k
            int lengthofValue= value.length();// 5
            boolean isPalindrome= true;
              for(int i=0;i<lengthofValue;i++){// 0<5

                  if(i==Math.ceil(lengthofValue/2)){ // i , 5/2=3. i
                      break;
                  } else if(chars[i]!=chars[lengthofValue-1-i]){  //a==a, // b==b,//c==c, //b=b,//a==a
                      isPalindrome=false;
                      break;
                  }
            }

            System.out.println(isPalindrome);
        }

        //O(1)+

    }


    public static void main(String[] args){
        isPalindrome("abcba");
        isPalindrome("abcab");
        isPalindrome("");
        isPalindrome(null);
        isPalindrome("a");
         // valid case,
        // invalid case
        // null
        //""
        // single length

    }
}
