import java.util.Scanner;
public class GCD_of_two_numbers {
    public static int findGCD(int a, int b) {
        if (b == 0){
            return a;
        }
        return findGCD(b, a % b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to find GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is: " + findGCD(a, b));
    }
}
