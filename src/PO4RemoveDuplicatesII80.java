import java.util.Scanner;

public class PO4RemoveDuplicatesII80 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int[] nums={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int k=2;

        for (int i = 2; i < nums.length; i++) {


            if (nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }

        }
        return k;
    }
}
