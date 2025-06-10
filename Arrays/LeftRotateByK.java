import java.util.*;
public class LeftRotate_array_by_k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {1,2,3,4,5};
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
        
    
