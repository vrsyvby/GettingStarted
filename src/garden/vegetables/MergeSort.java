package garden.vegetables;

import java.util.Arrays;

public class MergeSort {



    public static int[] merge(int[] left, int[] right){
         int[] result= new int[left.length+right.length];
         int leftindex=0;
         int rightindex=0;
         int index=0;
         while(leftindex<left.length && rightindex<right.length){

             if(left[leftindex]<right[rightindex]){
                 result[index]= left[leftindex];
                 leftindex++;

             }else{
                 result[index]= right[rightindex];
                 rightindex++;
             }

             index++;

         }

         while(leftindex<left.length){
             result[index]= left[leftindex];
             index++;
            leftindex++;
        }

        while(rightindex<right.length){
            result[index]= right[rightindex];
            index++;
            rightindex++;
        }
         return result;
    }

    public static int[]  mergesort(int [] elements){

        if(elements.length==1){
           return elements;
        }
        int midindex= (elements.length)/2;
        int[] firsthalf= Arrays.copyOfRange(elements,0, midindex);
        int[] secondhalf= Arrays.copyOfRange(elements,midindex, elements.length);

       return  merge(mergesort(firsthalf), mergesort(secondhalf));

    }

    public static void main(String[] args){

        int[] elements={99,44,6,2,1,5,63,87,283,4,0};

        elements=  mergesort(elements);

        int k=0;
        int[] curr1= Arrays.copyOfRange(elements,0, elements.length-k);
        int[] curr2= Arrays.copyOfRange(elements,elements.length-k+1, elements.length);


        Arrays.stream(elements).sorted();
        for(int i=0;i<elements.length;i++){
            System.out.print(elements[i]+" ");
        }

    }
}
