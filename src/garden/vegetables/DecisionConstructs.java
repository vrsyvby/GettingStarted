package garden.vegetables;

public class DecisionConstructs {

    public static void main(String[] args){

        if(false);
        else System.out.println("hello world");


        if(false)
            if(true) System.out.println("Hey, there!");
            else System.out.println("Hey!");
        else System.out.println("Bye");
        boolean flag=false;
        if(flag=true) System.out.println("assigned then checked fro validtion.");

        boolean a=false;
        boolean b= false;
        boolean c= false;

        if((a=true)||(b=true)&&(c=true)){
            System.out.println(a+" "+b+" "+c);

        }

    }
}
