import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean ans = search(n);
        if(ans){
            System.out.println(n + " is a Prime Number");
        }else{
            System.out.println(n + " is Not a Prime Number");
        }
        
    }
    public static boolean search(int n){

        if(n <=1) return false;

        if(n == 2 || n== 3) return true;

        for(int i=2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;


    }
    
}
