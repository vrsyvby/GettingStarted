package garden.vegetables;


interface Viewable{
    void view();
}
public class LambdaExamples {

    private static Viewable staticViewable=()-> System.out.println("inside static viewable");
    private  Viewable intanceViewable=()-> System.out.println("inside instance viewable");

    private static void viewIt(Viewable viewable){
        viewable.view();
    }

    public static void main(String args[]){

         Viewable localViewable=()-> System.out.println("inside local viewable");
         viewIt(localViewable);
        viewIt(new LambdaExamples().intanceViewable);
        viewIt(staticViewable);
        viewIt(()-> System.out.println("passed on the fly"));

        for(String s: new String[]{"first","second","third"}){
            viewIt(()->System.out.println("on the fly: "+s));

        }
   }
}
