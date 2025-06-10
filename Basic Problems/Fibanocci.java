import java.util.Scanner;
public class fibonici {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n number of series: ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        // arr = {0,1,1,2,3,5,8}


        int temp= 0;
        for(int i=2;i<=n;i++){
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("Fibonici of " + n + " is : " + temp);

    }
    
}
