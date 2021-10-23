package garden.vegetables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SFFInterviewSolution {

    public static void main(String[] args){

        int[] array= {0,10,20,30,0};
        Arrays.copyOf(array, array.length);
        /// are there any non zero elements?
        // sorted?

        int k=0;

         for(int i=0;i<array.length;i++){

          if(array[i]!=0){
              array[k++]=array[i];
          }
       }

         for(int i=k;i<array.length;i++){

             array[i]= 0;

         }

        List<Integer> elements= new ArrayList<>();
        elements.add(1);
        elements.remove(0);
        elements.add(0,3);
                elements.add(2);
        elements.add(3);
                elements.add(4);


//        List<Integer> el= IntStream.range(0, elements.size())
//                .map(i -> (elements.size() - 1 - i))    // IntStream
//                .mapToObj(elements::get)                // Stream<T>
//                .collect(Collectors.toList());
        elements.forEach(System.out::println);




        Arrays.stream(array).forEach(System.out::println);

    }
}
