package garden.vegetables;

public class FactorialRecursive {


    public static int fatorial(int n){

         if(n==1){
             return 1;
         }

         return n*fatorial(--n);

    }

    public static void main(String[] args){
        System.out.println(fatorial(5));
    }
}
