package garden.vegetables;

public class SwitchThroughFall {

    public static void main(String[] args){

        String[] arr= {"A","B","C"};


        for(String sample: arr){
            System.out.println("sample value: "+sample);
            switch(sample){
                case "A":
                    System.out.println("A");
                case "B":
                    System.out.println("B");
                default:
                    System.out.println("default");
                case "C":
                    System.out.println("C");
            }

        }

    }
}
