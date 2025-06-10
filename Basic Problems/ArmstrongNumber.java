import java.util.Scanner;
public class amrstrong_number_check {
    public static void main(String[] args) {
    
        Scanner hi = new Scanner(System.in);
        int n = hi.nextInt();
        
        if(isArmstrong(n)){
            System.out.println(n + " is a armstrong number");
        }else{
            System.out.println(n + " is not armstrong");
        }

    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum += rem*rem*rem;
        }
        return sum == original;     

    }
}
