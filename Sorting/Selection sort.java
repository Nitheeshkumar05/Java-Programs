
import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args){
        int[] nums = {3,2,5,4,6,7,1,6};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selection(int[] arr){
        for(int i=0;i < arr.length;i++){
            int last = arr.length-i-1;
            int max = maximum(arr,0,last);
            swapped(arr,max,last);

        }

    }
    public static int maximum(int[] arr,int start,int last){
        int max = start;
        for(int i=0;i<= last;i++){
            if(arr[i] >= arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swapped(int[] arr,int max,int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] =temp;
    }
}
    


