package garden.vegetables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExperimentsOnStrings {

    static void fillRemainingElements(int[] arr, int[] result, int rem, int k){
        int i=0;
        int len= arr.length;
        while(rem>i){
           result[k++]=arr[len-i-1];
            i++;
        }
    }

    public static void main(String[] args){

     int[] arr1= {0,3,4,31};
     int[] arr2= {4,6,30};
     int [] arr3= new int[arr1.length+arr2.length];

        Map<Integer, Integer> map = new HashMap<>();


     int i=0,j=0;
        for(int k=0;k<arr3.length;k++) {
            if (i < arr1.length &&  ( j==arr2.length || arr1[i]<arr2[j])) {   //i>j, arr1[i]>arr2[j]
                    arr3[k] = arr1[i];
                    //System.out.println("i "+i);
                    i++;
                } else {// for all remaining cases, i<j or arr1[i]<arr2[j]
               // System.out.println("j "+j);
                    arr3[k] = arr2[j];
                    j++;
                }
        }

//     if(i>j){
//         fillRemainingElements(arr1,arr3,i-j,k);
//
//     }else{
//         fillRemainingElements(arr2,arr3,j-i,k);
//     }


        Arrays.stream(arr3).forEach(System.out::println);


     }




}
