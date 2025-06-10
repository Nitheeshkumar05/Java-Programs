public class ThirdLargest {
    public static int thirdLargest(int[] arr) {
        if (arr.length < 3) {
            return -1; 
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int i=0;

        while(i < arr.length){
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
            i++;
        }

        return third; 
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 3, 50, 23, 90};
        System.out.println("Third largest element: " + thirdLargest(array));
    }
}
