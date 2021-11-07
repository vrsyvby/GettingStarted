package garden.vegetables;

public class FirstRecurrence {

    /**
     *
     *[2,5,5,2,3,5,1,2,4]
     * get first recurrence.
     * using only arrays. O(1)
     * time complexity is fine.
     *
     *
     * use brute force first
     * for i=0-n
     *    for j=i+1.. n
     *      compare i==j, then return true.
     *      else continue
     * @param args
     */


    public static void main(String[] args){
       int[] nums= {2,5,5,2,3,5,1,2,4};
       int min=nums.length;
       int temp=0;
       outer:
       for(int i=0;i<nums.length;i++){
           inner:
           for(int j=i+1;j<nums.length;j++){
               if(nums[j]==nums[i]){
                   temp=j;

                   if(min>temp){
                       min=temp;
                   }
                   break inner;
               }
           }
       }

        System.out.println(nums[min]);
    }
}
