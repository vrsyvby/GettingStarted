package garden.vegetables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample2 {
    public static void main(String[] args){

        Stream<String> stream1= Stream.of("first","second","third");
        stream1.forEach(System.out::println);
        Stream<String> stream2=Stream.empty();
        stream2.forEach(System.out::println);

        String argumentString =
                (args != null && args.length > 0) ? args[0] : null;

        Stream<String> argStream = Stream.ofNullable(argumentString);
        // Stream.generate takes a Supplier to generate a stream
        Stream<Double> infinitelyRandom = Stream.generate(Math::random);
        infinitelyRandom.limit(10).forEach((t) ->
                System.out.print(String.format("%.4f  ", t)));

        List<String> iteratorStream= new ArrayList<>(List.of("first","second","third"));

        iteratorStream.stream().forEach(System.out::println);


        Stream<Integer> iteratorStream1= Stream.iterate(5,(t)->t + 5);
        System.out.println("\n----Infinite Stream created by " +
                "UnaryOperator limited to 10 ");
        // Limiting an Infinite Stream in the pipeline
        iteratorStream1.limit(10).forEach((t) -> System.out.print(t + " "));

        System.out.println("\n---- Finite Stream created by " +
                "UnaryOperator limited to <= 100  ");
        // Stops at 100, uses lambda expression Predicate
        Stream<Integer> finiteStream = Stream.iterate(5, (t) -> t <= 100,
                (t) -> t + 5);

        finiteStream.forEach((t) -> System.out.print(t + " "));
        args[0]="Test one two three";
        args[1]="Test five six seven";
        for(String arg: args){

            Stream<String> initalstream= Stream.of(arg.split("\\s"));
            Stream<String> argsStream= Stream.empty();
            argsStream=Stream.concat(argsStream,initalstream);
            argsStream.forEach(System.out::println);

        }

        Stream.Builder<String> wordStreamBuilder= Stream.<String>builder();
        for(String arg: args){
            for(String s:arg.split("\\s")){
                wordStreamBuilder.accept(s);
            }

        }

        Stream<String> wordStream= wordStreamBuilder.build();
        wordStream.forEach(System.out::println);

    }
}
