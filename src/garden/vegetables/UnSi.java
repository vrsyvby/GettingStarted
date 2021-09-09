package garden.vegetables;

public class UnSi {

    public static void main(String[] args){

        int testInt= (int)(Integer.MAX_VALUE+3);
        System.out.println(testInt);
        System.out.println((long)Integer.MAX_VALUE+3);
        System.out.println(Integer.toUnsignedString(testInt));
        System.out.println(new String(""+(long)Integer.MAX_VALUE+3));
    }
}
