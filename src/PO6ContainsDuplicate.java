import java.util.Arrays;
import java.util.Scanner;

public class PO6ContainsDuplicate {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int [] arr={1,5,-2,-4,0};
        System.out.println(    containsDuplicate(arr));

    }
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length==1)return false;
        int start=0;
        int end=nums.length-1;
        Arrays.sort(nums);



        while(start!=end){
           if (nums[start]==nums[start+1]){
               return true;
           }else if(nums[end]==nums[end-1]){
               return true;
           }else{
               start++;
               if (start==end){
                   return false;
               }

               end--;
           }
        }
        return false;

    }
}
