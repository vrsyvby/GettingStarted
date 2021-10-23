package garden.vegetables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalExamples {

    public static void main(String[] args){


        Function<String,String> f1= (s)-> s.replace(","," ");
        Function<List<String>,String> f2= (s)-> s.subList(1,4).toString().replace(","," ");
        Function<String,String> f3=(s)-> s.split("\\s")[0];

        System.out.println(f3.apply("Hello World!"));

        Function<List<Integer>,List<Integer>> f4= (s)->{
          System.out.println(s.toString());
          return s.subList(1,4);
        };

        Function<List<Integer>,String> f5= (s)->{
            System.out.println(s.toString());
            return s.toString();
        };

        Function<String,String> f6= (s)->{
            System.out.println(s.toString());
            return s.replace(","," ");
        };

        System.out.println(f5.compose(f4).andThen(f6).apply(List.of(10,20,30,40)));

        BiFunction<String,String,List<String>> bifunction1= (String s1, String s2)->{
          System.out.println(s1);
            System.out.println(s2);
          List<String> tokens= new ArrayList<>();
          tokens.addAll(List.of(s1.split("\\s")));
          tokens.add(s2);
          return tokens;
        };

        System.out.println(bifunction1.apply("Hello World!","yes"));



    }
}
