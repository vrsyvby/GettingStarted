package garden.vegetables;

public class SelectionSort {

    public static void main(String[] args){
        int[] elements={99,44,6,2,1,5,63,87,283,4,0};


        for(int i=0;i<elements.length;i++){
           int min= elements[i];
           int k=i;
            for(int j=i+1;j<elements.length;j++){
                if(min>elements[j]){
                    min=elements[j];
                    k=j;
                }
           }
            int temp= elements[i];
            elements[i]=min;
            elements[k]=temp;

//            for(int m=0;m<elements.length;m++){
//                System.out.print(elements[m]+" ");
//            }
//            System.out.println();
        }


        for(int i=0;i<elements.length;i++){
            System.out.print(elements[i]+" ");
        }
    }
}
