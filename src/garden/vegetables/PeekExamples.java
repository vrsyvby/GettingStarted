package garden.vegetables;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekExamples {

    public static void main(String[] args){


        List<Student> firstStudentList= Stream.generate(Student::new).limit(10).collect(Collectors.toList());

        firstStudentList.forEach(System.out::println);
        System.out.println("from scon list");
        List<Student> secondStudentList= Stream.generate(Student::new).limit(10).peek(System.out::println).collect(Collectors.toList());


        firstStudentList.stream().peek(PeekExamples::changeName).forEach(System.out::println);



    }

    private static void changeName(Student student){

        student.setName(student.getName()+" Doe");

    }
}
