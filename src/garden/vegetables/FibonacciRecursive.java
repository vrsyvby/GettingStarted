package garden.vegetables;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRecursive {



    public static int fibonacci(int n){
        // first 10 fibonacci sequence

        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }


      return  fibonacci(n-1)+fibonacci(n-2);
    }

    public static int iterative(int n){


        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }
        int nod1=0;
        int nod2=1;
        int temp=0;
        int result=1;
        for(int i=2;i<=n;i++){


            result= nod2+nod1;
            temp=nod2;
            nod2=result;
            nod1=temp;
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(2));

        System.out.println(iterative(3));
        System.out.println(iterative(2));
    }
}
