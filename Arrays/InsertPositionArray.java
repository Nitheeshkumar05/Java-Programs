
import java.util.Arrays;

public class insert_position {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,6,7};
        int index = 4;
        int value = 5;

        int[] nums1 = new int[nums.length+1];

        for(int i=0;i<index;i++){
            nums1[i] = nums[i];
        }

        nums1[index] = value;

        for(int i=index;i<nums.length;i++){
            nums1[i+1] = nums[i];

        }

        
        System.out.println(Arrays.toString(nums1));
    }
    
}
