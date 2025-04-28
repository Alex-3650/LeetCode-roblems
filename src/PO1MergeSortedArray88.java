import java.util.Arrays;
import java.util.Map;

public class PO1MergeSortedArray88 {
    public static void main(String[] args) {
        int [] muns1={1,2,3,0,0,0};
        int [] muns2={2,5,6};

        merge(muns1,3,muns2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int first=m-1;
       int second=n-1;
       int end=m+n-1;

       while (first>=0&&second>=0){

           if (nums1[first]>nums2[second]){
               nums1[end--]=nums1[first--];
           }else{
               nums1[end--]=nums2[second--];
           }
       }
       while (second>=0){
           nums1[end--]=nums2[second--];
       }

        System.out.println(Arrays.toString(nums1));

    }
}
