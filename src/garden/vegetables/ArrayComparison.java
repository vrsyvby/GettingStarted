package garden.vegetables;

import java.util.List;
import java.util.Arrays;

public class ArrayComparison {
    public static void main(String[] args) {

        // Set up some array data for comparison.
        String[] firstString = {"abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"};
        String[] copyOfFirstString = {"abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"};
        String[] firstStringUnsorted = {"jkl", "mno", "pqr", "stu", "vwx",
                "yz", "abc", "def", "ghi"};
        String[] partialFirstString = {"abc", "def", "ghi", "jkl", "mno"};

        String firstStringReference[] = firstString;

        // Create pass-thru Lists from the arrays to test List equality
        List firstList = Arrays.asList(firstString);
        List secondList = Arrays.asList(copyOfFirstString);

        // First, compare arrays using object.equals
        System.out.println("------------- Object.equals ------------");
        System.out.println(" (firstString.equals(copyOfFirstString)) = "
                + firstString.equals(copyOfFirstString));
        System.out.println(" (firstString.equals(firstStringReference)) = "
                + firstString.equals(firstStringReference));

        // Compare arrays using Arrays.equals
        System.out.println("\n------------- Arrays.equals ------------");
        System.out.println(" (Arrays.equals(firstString,copyOfFirstString)) = "
                + Arrays.equals(firstString, copyOfFirstString));
        System.out.println(" (Arrays.equals(firstString,firstStringReference)) = "
                + Arrays.equals(firstString, firstStringReference));
        System.out.println(" (Arrays.equals(firstString,firstStringUnsorted)) = "
                + Arrays.equals(firstString, firstStringUnsorted));


    }
}