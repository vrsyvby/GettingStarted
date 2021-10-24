package garden.vegetables;

public class BubbleSort {


    public static void main(String[] args){

        int[] elements={6,5,3,1,8,7,2,4};


//            6,5,3,1,8,7,2,4, i=0, j=1
//            5,6,3,1,8,7,2,4, i=1, j=2
//            5,3,6,1,8,7,2,4, i=2, j=3
//            5,3,1,6,8,7,2,4, i=3, j=4
//            5,3,1,6,7,8,2,4

            int loop=0;
                    //int j=0;int j=1, int loop =0

                while(loop<elements.length){
                   int i=0;
                   while(i<elements.length-1) {
                       if (elements[i+1] < elements[i]) {
                           int temp = elements[i+1];
                           elements[i+1] = elements[i];
                           elements[i] = temp;
                       }
                       i++;
                   }
                 loop++;
            }

        for(int k=0;k<elements.length;k++){
            System.out.print(elements[k]+" ");
        }
        System.out.println();




    }
}
