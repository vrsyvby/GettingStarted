package garden.vegetables;


import java.util.*;
import java.util.stream.Stream;

class StudentGrades{
    private String name;
    private Optional<Float> gpa=Optional.empty();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Float> getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "StudentGrades{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public void setGpa(float gpa) {
        this.gpa=Optional.ofNullable(gpa);
    }

    StudentGrades(String name){
        this.name=name;
    }

    StudentGrades(String name, float gpa){
        this.name=name;
        this.gpa=Optional.of(gpa);
    }



}
public class OptionalTests {

   private static void printStatus(StudentGrades gpa){
       System.out.println(gpa.getName());
       if(gpa.getGpa().isPresent()){
           System.out.println("is in probation");
       }else{
           System.out.println("good standing");
       }
   }

    public static void main(String[] args){
        StudentGrades gpa1= new StudentGrades("jim",7.0f);
        StudentGrades gpa2= new StudentGrades("mij");

        List.of(gpa1,gpa2).stream().forEach(OptionalTests::printStatus);

        List<Long> list1 = new ArrayList<Long>(); // Line 1
        list1.add(5l);   // Line 2
        List<? extends Number> list2 = null;  // Line 3

        if (list1 instanceof List<?>) { // Line 4
            list2 = list1;      // Line 5
        }

        System.out.println(list2);


                Test test = new Test();
                List<? extends Number> items =
                        new ArrayList<Integer>(Arrays.asList(1, 2, 3));  // Line 1
                /*  Insert statement here */
        OptionalTests ot= new OptionalTests();
        ot.printItOut(items);

        ot.<Object>printItOut(items);

        ot.<List<?>>printItOut(items);



        ot.<List<? extends Number>>printItOut(items);





    }
    public <T> void printItOut(T type) {
        System.out.println(type);
    }
}
