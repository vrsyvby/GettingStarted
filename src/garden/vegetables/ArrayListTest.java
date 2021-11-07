package garden.vegetables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {


    public static void main(String[] args){

//        List<Integer> test= new ArrayList<>(10);
//        test.add(1,10);
//
//        test.forEach(System.out::println);

        LinkedList[] arrints= new LinkedList[10];
        LinkedList<Integer> firsttry= new LinkedList<>();
        firsttry.add(10);
        arrints[1]=firsttry;
        System.out.println(arrints[0]);
        System.out.println(arrints[1]);

    }
}
