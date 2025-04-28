import java.util.Arrays;
import java.util.Scanner;

public class PO3RemoveDuplicates26 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int [] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public  static int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
       int k=1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i-1]!=nums[i]){
                nums[k]=nums[i];
                k++;
            }
        }

    return k+1;
    }
}
//0,1,2,3,4,2,2,3,3,4