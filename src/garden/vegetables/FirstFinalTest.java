package garden.vegetables;

public class FirstFinalTest {

public static void main(String[] args){

    int number=4323230;
    String test= number+"";
    String lastCh= test.substring(test.length()-1,test.length());
    switch(lastCh){

        case"1":
        case"3":
        case"5":
        case"7":
        case"9":
            System.out.println("odd");
            break;

        case"2":
        case"4":
        case"6":
        case"8":
        case"0":
            System.out.println("even");
            break;

    }


}


}
