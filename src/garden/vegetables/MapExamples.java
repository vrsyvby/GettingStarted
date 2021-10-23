package garden.vegetables;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExamples {

    public static void main(String[] args){

        List<Student> firstStudentList= Stream.generate(Student::new).limit(10).collect(Collectors.toList());

        firstStudentList.forEach(System.out::println);

        Set firstSet= firstStudentList.stream().map(MapExamples::getStudentMap).collect(Collectors.toSet());
        firstSet.forEach(System.out::println);

        firstStudentList.stream().map((s)->MapExamples.getStudentMap(s)).collect(Collectors.toSet());
    }

    private static void changeName(Student student){

        student.setName(student.getName()+" Doe");

    }

    private static Map.Entry<Integer, Student> getStudentMap(Student p){
        return new AbstractMap.SimpleEntry<Integer,Student>(p.getStudentId(),p);
    }
}
