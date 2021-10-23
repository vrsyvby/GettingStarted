package garden.vegetables;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class ParallelStreamCreation {

    public static void main(String[] args){

        Map<String, Integer> treemap = new TreeMap<>();

        // Ralph a new employee
        int employeeNo = 1;
        treemap.compute("Ralph",
                (s1, s2) -> (s1 == null) ? employeeNo : 3);  // Line 1

        int s2 = 3;  // Line 2

        // Anne a  new employee
        treemap.compute("Anne",
                (s1, s3) -> (s1 == null) ? employeeNo + 1 : s2 + 1);  // Line 3

        System.out.println(treemap);
    }
}
