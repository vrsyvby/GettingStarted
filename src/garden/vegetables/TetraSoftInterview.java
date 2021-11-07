package garden.vegetables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TetraSoftInterview {

    static int valueMapper(Object element){

        return (int)element;
    }


    public static void main(String[] args){

       Stream<Integer> instrem= Stream.of(35,58,32,48,98);

       int[] intarray= {35,58,32,48,98};
       IntStream instrem1=Arrays.stream(intarray);

        Stream<Integer> instrem2= List.of(35,58,32,48,98).stream();

       Stream.Builder<Integer> streambuilder= Stream.<Integer>builder();
        streambuilder.add(35);
        streambuilder.add(58);
        streambuilder.add(32);
        streambuilder.add(48);
        streambuilder.add(98);
        Stream<Integer> instrem3 = streambuilder.build();

        //instrem.filter(element-> element%2==0).forEach(System.out::println);
        //instrem2.sorted().forEach(System.out::println);

//        instrem1.peek(element-> element/2)
//                .forEach(System.out::println);

//        instrem1.map(element-> element/2).collect(Collectors.toMap(Objects::hashCode,
//                TetraSoftInterview:: valueMapper ));

        /*

           public class Employee{
             private Long id;
             private String name;



           }

           @repository
           public Interface EmployeeRepo extends JpaRespoitory<Long, Employee>


           @Controller
           public class EMployee{

           @Autowired
           private final EmployeeRepo repo;

             @PostMapping("save-employee")
             public String saveEmployee(@RequestBody Employee){

             repo.save(Employee);
             return "00";

           }

         */








    }
}
