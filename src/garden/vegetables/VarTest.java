package garden.vegetables;

public class VarTest {

    static float tax_rate =0.06F;

    public static void main(String[] args){

        var aClassWithAVeryLongName=
                new  AClassWithAVeryLongName();

        aClassWithAVeryLongName.setName("Testing");
var name=aClassWithAVeryLongName.getName();
        System.out.println(name);

        var i=1;
        var intArray= new int[10];
        Object nulObject= null;
        var var= nulObject;

        for(var k=0;k<10;k++){
            System.out.println(k);
        }

        var result = 0.0;
        var tax_rate = 0.05;    // Line 1
        var price = 100;
        var adjusted_tax = price * tax_rate;  // Line 2
        result = price + adjusted_tax;  // Line 3
        System.out.println("Adjusted price = " + result);

      String s1="hello";
      String s2= "hello";
      System.out.println(s1==s2);

    }
}
