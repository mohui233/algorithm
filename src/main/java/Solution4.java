import java.util.Arrays;

/**
 * @author Wangzj
 * @date 2019/7/3 16:19
 */
public class Solution4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int length = a + b;
        int[] nums3 = new int[length];
        for(int i=0; i<nums1.length; i++){
            nums3[i] = nums1[i];
        }
        for(int j=0; j<nums2.length; j++){
            nums3[j+a] = nums2[j];
        }
        Arrays.sort(nums3);
        int c = length / 2;
        int d = length % 2;
        double g = 0;
        if(d!=0){
            int e = nums3[c];
            g = (float) ((float)e * 1.0);
        }else {
            int f = nums3[c-1] + nums3[c];
            g = (float)f / 2 ;
        }
        System.out.println("中位数是："+g);
        return g;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2};
        findMedianSortedArrays(nums1,nums2);
    }


}
