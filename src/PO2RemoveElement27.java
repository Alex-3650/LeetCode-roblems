import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class PO2RemoveElement27 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int [] nums={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));

    }
    public  static int removeElement(int[] nums, int val) {
        int k=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){

                nums[k]=nums[i];
                k++;
            }

        }
        return k;
    }
}
