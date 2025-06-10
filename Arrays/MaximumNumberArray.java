public class array_maximum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,10,26,36,58};
        System.out.println(max(arr));

    }

    static int max(int[] arr){

        if(arr.length==0){
            return -1;
        }

        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
