package garden.vegetables;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

class Person{
    private String name;
    Person(String name){
        //System.out.println(name);
        this.name=name;
  }

  public String getName(){
        return name;
  }

  public String toString(){
        return "["+name+"]";
  }
}


public class StreamPipeline {

    private static Person getPersonInstances(){
        List<Person> personList= new ArrayList<>();
        personList.add(new Person("jim"));
        personList.add(new Person("Mary"));
        personList.add(new Person("Mij"));
        personList.add(new Person("Yram"));
       int i= new Random().nextInt(4);
        return personList.get(i);

    }

public static void main(String[] args){

    List<Person> personList= new ArrayList<>();
    Stream.of("first","second").forEach(System.out::println);
    Stream<Person> personStream= Stream.generate(()->getPersonInstances());
    personStream.limit(2).forEach(System.out::println);


    for(int i=0;i<20;i++){
        personList.add(getPersonInstances());
    }

   Stream<Person> stream1=personList.stream().filter(person->
       person.getName().equals("jim"));
    System.out.println(stream1.count());

}

}
