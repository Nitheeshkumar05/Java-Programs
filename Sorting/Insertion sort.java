
import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args){
        int[] nums = {3,2,5,11,8,11,1,4};
        insertion(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void insertion(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1] >= arr[j]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }

        }
    }
    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
