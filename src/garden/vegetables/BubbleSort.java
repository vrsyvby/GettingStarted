package garden.vegetables;

public class BubbleSort {


    public static void main(String[] args){

        int[] elements={99,44,6,2,1,5,63,87,283,4,0};


//            6,5,3,1,8,7,2,4, i=0, j=1
//            5,6,3,1,8,7,2,4, i=1, j=2
//            5,3,6,1,8,7,2,4, i=2, j=3
//            5,3,1,6,8,7,2,4, i=3, j=4
//            5,3,1,6,7,8,2,4


                    //int j=0;int j=1, int loop =0

               for(int loop=0;loop<elements.length;loop++){

                  for(int i=0;i<elements.length-1;i++){
                       if (elements[i+1] < elements[i]) {
                           int temp = elements[i+1];
                           elements[i+1] = elements[i];
                           elements[i] = temp;
                       }

                   }

            }

        for(int k=0;k<elements.length;k++){
            System.out.print(elements[k]+" ");
        }
        System.out.println();




    }
}
