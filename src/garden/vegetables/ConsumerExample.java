package garden.vegetables;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args){

        Consumer<String> consumer= (s)-> System.out.println(s);

        Consumer<List<String>> consumer1= (s)->s.forEach(consumer);

        consumer1.accept(List.of("Hello","World"));

        BiConsumer<List<String>,Consumer<String>> biconsumer1= (s,c)->s.forEach(c);

        biconsumer1.accept(List.of("Hwollo","String"),(s)-> System.out.println(s));

    }
}
