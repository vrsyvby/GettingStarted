package garden.vegetables;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
enum Category {
    FRUIT, VEGETABLE;
}

class ProduceItem {
    private Category category;
    private String value;

    ProduceItem(Category category, String value) {
        this.category = category;
        this.value = value;
    }

    public Category getCategory() {
        return category;
    }

    public String toString() {
        return value;
    }
}

class Items implements Comparator<Items> {
    private int id;

    Items(int id) {
        this.id = id;
    }

    int compareTo(Items i) {
        return i.id- this.id;
    }

    public int compare(Items o1, Items o2) {
        return o1.getId() - o2.getId();
    }

    public String toString() {
        return "" + id;
    }
    public int getId(){
        return id;
    }
}


public class StreamGrouping {

    static public  void main(String[] args){
        List<Items> testData = List.of(
                new Items(20),
                new Items(10),
                new Items(15)
        );
        List<Items> itemList = new ArrayList<>(testData);  // Line 1
       // Collections.sort(itemList);     // Line 2

        Set<Items> treeSet = new TreeSet(new Items(0));   // Line 3
        treeSet.addAll(testData);
        Items i1 = treeSet.iterator().next();      // Line 4

        System.out.println(i1);
        System.out.println(new Pet());

        List<Pet> petlist=Stream.generate(Pet::new)
                .limit(5000)
                .collect(Collectors.toList());
        long count = petlist.stream().filter(s->s.getType()=="Dog").count();
        System.out.println(count);

        Map<String,Long> petTypeCounts=petlist.stream().collect(Collectors.groupingBy(Pet::getType,Collectors.counting()));
        petTypeCounts.entrySet().stream().sorted((s,t)->s.getKey().compareTo(t.getKey())).forEach(System.out::println);

        Map<List,Double> petTypeStateCounts=petlist.stream()
                .collect(Collectors.groupingBy(pet-> Arrays.asList(pet.getType(),pet.getState()),Collectors.averagingInt(Pet::getAge)));
        petTypeStateCounts.entrySet().forEach(System.out::println);

        Map<String,Map<String,Long>> twoDPetMap=petlist.stream()
                .collect(Collectors.groupingBy(
                        Pet::getState,
                        TreeMap::new,
                        Collectors.groupingBy(
                                Pet::getType,
                                TreeMap::new,
                                Collectors.counting()
                        )
                ));

        twoDPetMap.entrySet().stream().forEach(System.out::println);


        Map<Boolean,List<Pet>> listofDogsAndNotDogs=petlist.stream().collect(Collectors.partitioningBy(s->s.getType().equals("Dog")));
        listofDogsAndNotDogs.entrySet().stream().filter(s->s.getKey())
                .flatMap(s->s.getValue().stream())
                .limit(5)
                .forEach(System.out::println);

       Map<Boolean,Map<String,Long>> DogsOrNotDogsbyVet= petlist.stream().collect(Collectors.partitioningBy(
                s->s.getType().equals("Dog"),
                Collectors.groupingBy(Pet::getVet,
                        TreeMap::new,
                        Collectors.counting())
        ));
        DogsOrNotDogsbyVet.entrySet().stream()
                .filter(s->s.getKey()).limit(5).forEach(System.out::println);
        DogsOrNotDogsbyVet.entrySet().stream()
        .filter(s->s.getKey()).flatMap(s->s.getValue().keySet().stream()).limit(5).forEach(System.out::println);

        List aList = List.of("January", "February");
        List bList = List.of("January", "September");
        List cList = List.of("February", "April");

        Stream.of(aList, bList, cList)
                .distinct()     // Line 1
                .flatMap(Collection<String>::stream)  // Line 2
                .peek(s -> System.out.print(s + ","))
                .allMatch(s -> s.length() >= 5);  // Line 3

        System.out.println(
                Stream.iterate(10, t -> t <= 30, (t) -> t + 10)
                        .mapToInt((s) -> s * 1000) // Line 1
                        .map((s) -> s / 1000) // Line 2
                        .average()); // Line 3

        Stream.of(
                        new ProduceItem(Category.FRUIT, "Apple"),
                        new ProduceItem(Category.VEGETABLE, "Broccoli"),
                        new ProduceItem(Category.FRUIT, "Pear")
                ).collect(Collectors.partitioningBy(
                        c -> c.getCategory() == Category.VEGETABLE)) // Line 1
                .values().stream()  // Line 2
                .forEach(System.out::print);

        List<Pet> firstList= List.of(new Pet());
        List<Pet> secondList= List.of(new Pet());
        List<Pet> thirdList= List.of(new Pet());

        List<List<Pet>> listOfLists= List.of(firstList,secondList,thirdList);
//
        System.out.println("flat map operation");
        listOfLists.stream().flatMap(s->s.stream().map(t->t.getName()))
                .forEach(System.out::println);

        List<Pet> fullList= new ArrayList<>();

        listOfLists.stream().map(s-> fullList.addAll(s))
                .allMatch(s->s!=null);
        fullList.forEach(System.out::println);

    }
}
