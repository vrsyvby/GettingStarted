package garden.vegetables;

import java.util.Arrays;
import java.util.List;

public class ArraysOddities {

    public static void main(String[] args) {

        String[] firstString = {
                "abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"
        };

        List firstList = List.copyOf(Arrays.asList(firstString));
        List secondList = List.of(firstList);

        System.out.println("firstList = " + firstList.toString());
        System.out.println("secondList = " + secondList.toString());

        Object o = firstList.get(0);
        System.out.println(o.getClass().getName());

        o = secondList.get(0);
        System.out.println(o.getClass().getName());



        int[] aArray = new int[3];
        Integer[] bArray = new Integer[3];
        aArray[2] = 1;
        bArray[0] = 1;  // Line 1

        for (int a : aArray) {
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int b : bArray) {  // Line 2
            System.out.print(b + " ");  // Line 3
        }


        int[][] spreadsheet = new int[3][];
        spreadsheet[0] = new int[3];
        spreadsheet[1] = new int[]{1, 2, 3}; // Line 1
        System.out.println(Arrays.deepToString(spreadsheet)); // Line 2
    }
}
