package garden.vegetables;

public class InsertionSort {

    public static void main(String[] args){

        int[] elements={99,44,6,2,1,5,63,87,283,4,0};

//        99,44,6,2,1,5,63,87,283,4,0
//        44,99,6,2,1,5,63,87,283,4,0
//        6,44,99,2,1,5,63,87,283,4,0


          for(int i=1;i<elements.length;i++){
              int max=i; //  max=3
              for(int j=i-1;j>=0;j--){

                  if(elements[j]>elements[max]){// 99>2

                      int temp = elements[j];// temp= 99
                      elements[j]= elements[max];// 6,44,2,2
                      elements[max]= temp;// 6,44,2,99
                      max=j;// max=2;
                  }

              }
              for(int k=0;k<elements.length;k++){
                  System.out.print(elements[k]+" ");
              }
              System.out.println();

          }




    }
}
